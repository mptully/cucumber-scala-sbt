package com.qaworks.scala

import cucumber.api.CucumberOptions
import cucumber.api.junit.Cucumber
import org.junit.runner.RunWith

/**
  * Created by matttully on 25/05/2016.
  */
@RunWith(classOf[Cucumber])
@CucumberOptions(
  features = Array("src/test/resources/features"),
  glue = Array("com/qaworks/scala"),
  plugin = Array("pretty", "html:target/cucumber-report"),
  tags = Array("@api")
)
class RunCukesTest {
}
