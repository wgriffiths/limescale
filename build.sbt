import Dependencies._

lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization := "com.example",
      scalaVersion := "2.12.1",
      version      := "0.1.0-SNAPSHOT"
    )),
    name := "Hello",
    libraryDependencies += scalaTest % Test,
    libraryDependencies += "com.typesafe.play" %% "play-ws" % "2.6.0-M1",
    libraryDependencies += "com.typesafe.play" % "play-ahc-ws-standalone_2.12" % "1.0.0-M4"

  )
