
name := "scala-gen"

version := "1.5.0.1"

organization := "com.simplesys"

val scalaTest = "org.scalatest" %% "scalatest" % "3.0.4"
val scalaIOExtender = "com.simplesys" %% "scala-io-extender" % "1.5.0.1"
val common = "com.simplesys" %% "common" % "1.5.0.1"

libraryDependencies ++= Seq(
    common,
    scalaIOExtender ,
    scalaTest % Test
)

scalaVersion := "2.12.5"
