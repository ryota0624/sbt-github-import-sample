name := "my-app"

version := "0.1"

crossScalaVersions := Seq("2.12.10", "2.13.1")

lazy val myReaderRepository = ProjectRef(uri("git://github.com/ryota0624/my-reader.git#master"), "my-reader")

dependsOn(myReaderRepository)

libraryDependencies += "ch.qos.logback" % "logback-classic" % "1.2.3"
libraryDependencies += "com.typesafe.scala-logging" %% "scala-logging" % "3.6.0"
libraryDependencies += "com.lightbend" %% "emoji" % "1.0.0"
libraryDependencies += "com.lightbend" %% "emoji" % "1.0.0"
libraryDependencies += "dev.zio" %% "zio" % "1.0.0"

val AkkaVersion = "2.5.31"
libraryDependencies += "com.typesafe.akka" %% "akka-actor-typed" % AkkaVersion
libraryDependencies += "com.typesafe.akka" %% "akka-stream" % AkkaVersion

val circeVersion = "0.13.0"

libraryDependencies ++= Seq(
  "io.circe" %% "circe-core",
  "io.circe" %% "circe-generic",
  "io.circe" %% "circe-parser"
).map(_ % circeVersion)

