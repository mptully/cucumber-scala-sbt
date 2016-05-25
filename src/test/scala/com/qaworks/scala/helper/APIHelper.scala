package com.qaworks.scala.helper

import java.io._
import org.apache.http.client.methods.HttpGet
import org.apache.http.impl.client.{CloseableHttpClient, HttpClientBuilder, DefaultHttpClient}
import play.api.libs.json.Json


/**
  * Created by matttully on 25/05/2016.
  */
object APIHelper {

  /**
    * Returns the text content from a REST URL. Returns a blank String if there
    * is a problem.
    */
  def getRestContent(url: String): String = {

    val httpClient = HttpClientBuilder.create().build();
    val httpResponse = httpClient.execute(new HttpGet(url))
    val entity = httpResponse.getEntity()
    var content = ""
    if (entity != null) {
      val inputStream: InputStream = entity.getContent()
      content = io.Source.fromInputStream(inputStream).mkString
      inputStream.close
    }
    httpClient.close()

    return content

  }

  def getFormattedAddress(content: String) = {

    val jsonObject = Json.parse(content)

    //val formattedAddress = jsonObject \\ "formatted_address"
    val formattedAddress = (jsonObject \\ "formatted_address")

    if(formattedAddress.isEmpty)
      s"Formatted address element not found"
    else
    //formattedAddress.head.toString().replace('"','')
      formattedAddress.head.toString().replace("\"","")
  }
}
