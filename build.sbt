import Dependencies.*

ThisBuild / scalaVersion := "3.3.7"
ThisBuild / version := "0.1.7"
ThisBuild / organization := "be.botkop"

lazy val root = (project in file(".")).settings(
  name := "numsca",
  libraryDependencies ++= Seq(
    "org.nd4j" % "nd4j-native-platform" % "0.9.1",
    "com.typesafe.scala-logging" %% "scala-logging" % "3.9.6",
    "ch.qos.logback" % "logback-classic" % "1.2.3",
    scalaTest % Test
  ),
  publishTo := sonatypePublishToBundle.value,
  pomIncludeRepository := { _ => false },
  licenses := Seq(
    "BSD-style" -> url("http://www.opensource.org/licenses/bsd-license.php")
  ),
  homepage := Some(url("https://github.com/botkop")),
  scmInfo := Some(
    ScmInfo(
      url("https://github.com/botkop/numsca"),
      "scm:git@github.com:botkop/numsca.git"
    )
  ),
  developers := List(
    Developer(
      id = "botkop",
      name = "Koen Dejonghe",
      email = "koen@botkop.be",
      url = url("http://botkop.be")
    )
  ),
  publishMavenStyle := true,
  Test / publishArtifact := false,
  scalacOptions ++= Seq(
    "-source:future",
    "-deprecation",
    "-feature"
  ),
  fork := true
)
