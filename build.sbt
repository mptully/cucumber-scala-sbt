name := "cucumber-scala-sbt"

version := "1.0"

scalaVersion := "2.11.5"

libraryDependencies ++= Seq(
  "org.scalatest" % "scalatest_2.11" % "2.2.1",
  "org.scala-lang" % "scala-library" % "2.11.5",
  "info.cukes" % "cucumber-scala_2.11" % "1.2.2",
  "info.cukes" % "cucumber-junit" % "1.2.2",
  "info.cukes" % "cucumber-picocontainer" % "1.2.2",
  "junit" % "junit" % "4.11" % "test",
  "org.apache.httpcomponents" % "httpclient" % "4.5.2" % "test",
  "com.typesafe.play" % "play-json_2.11" % "2.4.6" % "test"

)