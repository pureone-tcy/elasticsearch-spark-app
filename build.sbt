import Dependencies._

ThisBuild / scalaVersion     := "2.12.8"
ThisBuild / version          := "0.1.0-SNAPSHOT"
ThisBuild / organization     := "com.example"
ThisBuild / organizationName := "example"

lazy val root = (project in file("."))
  .settings(
    name := "elasticsearch-spark-app",
    libraryDependencies ++= Seq(
      "org.apache.spark" %% "spark-core" % "2.4.3",
      "org.apache.spark" %% "spark-streaming" % "2.4.3",
      "org.apache.spark" %% "spark-streaming-twitter" % "1.6.3",
      "org.elasticsearch" %% "elasticsearch-spark-20" % "7.0.1",
      scalaTest % Test
    )
  )

// See https://www.scala-sbt.org/1.x/docs/Using-Sonatype.html for instructions on how to publish to Sonatype.
