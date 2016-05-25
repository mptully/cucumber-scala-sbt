package com.qaworks.scala

import cucumber.api.scala.{ScalaDsl, EN}
import org.scalatest.Matchers
import com.qaworks.scala.helper.APIHelper._
/**
  * Created by matttully on 25/05/2016.
  */
class GoogleAPIAddressCheckStepDefintions extends ScalaDsl with EN with Matchers {

  var url: String = _
  var content: String = _

  Given("""^I access the google geocode api$"""){ () =>

    // could add this to configuration along with other urls.
    url = "https://maps.googleapis.com/maps/api/geocode/json?address=%20<postcode>&sensor=false"

  }

  When("""^I call the API with post code (.*\s+.*)$"""){ (postCode: String) =>

    content = getRestContent(url.replace("<postcode>", postCode.replace(" ","")))

  }

  Then("""^'(.*)' should be returned$""") { (expectedAddress: String) =>

    val actualAddress = getFormattedAddress(content);
    expectedAddress.trim should be(actualAddress.trim)

  }

}