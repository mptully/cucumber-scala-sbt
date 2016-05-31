name := "cucumber-scala-sbt"

version := "1.0"

scalaVersion := "2.11.5"

libraryDependencies ++= Seq (
  "org.scalatest" %% "scalatest" % "2.2.4" % "test",
  "org.scala-lang" % "scala-library" % "2.11.5",
  "info.cukes" % "cucumber-core" % "1.2.4" % "test",
  "info.cukes" % "cucumber-scala_2.10" % "1.2.2" % "test",
  "info.cukes" % "cucumber-jvm" % "1.2.4" % "test",
  "info.cukes" % "cucumber-junit" % "1.2.4" % "test",
  "info.cukes" % "cucumber-picocontainer" % "1.2.2",
  "junit" % "junit" % "4.11" % "test",
  "org.apache.httpcomponents" % "httpclient" % "4.5.2" % "test",
  "com.typesafe.play" % "play-json_2.11" % "2.4.6" % "test")


enablePlugins(CucumberPlugin)
CucumberPlugin.glue := "com/qaworks/scala/"
CucumberPlugin.tags := List("WIP", "ignore")
