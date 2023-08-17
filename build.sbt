course := "progfun2"
assignment := "calculator"

scalaVersion := "3.3.0"

scalacOptions ++= Seq("-language:implicitConversions", "-deprecation")

libraryDependencies ++= Seq(
    "org.scalameta" %% "munit" % "0.7.29" % Test,
    "org.scalacheck" %% "scalacheck" % "1.17.0"
)
