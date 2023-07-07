scalaVersion := "3.3.0"

name := "test"

libraryDependencies ++= Seq(
  "dev.zio" %% "zio" % "2.0.15",
  "dev.zio" %% "zio-cli" % "0.5.0",
)

enablePlugins(JavaAppPackaging)