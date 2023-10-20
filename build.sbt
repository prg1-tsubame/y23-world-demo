val scala3Version = "3.3.0"

lazy val root = project
  .in(file("."))
  .settings(
    name := "World Demo",
    version := "0.1.0-SNAPSHOT",

    scalaVersion := scala3Version,

    run / fork          := true,
    run / connectInput  := true,
    Global / cancelable := true,
    libraryDependencies += "org.scala-lang.modules" %% "scala-swing" % "3.0.0"
  )
