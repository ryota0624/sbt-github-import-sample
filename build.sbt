name := "my-app"

version := "0.1"

crossScalaVersions := Seq("2.12.10", "2.13.1")

lazy val myReaderRepository = ProjectRef(uri("git://github.com/ryota0624/my-reader.git#master"), "my-reader")

dependsOn(myReaderRepository)

libraryDependencies += "ch.qos.logback" % "logback-classic" % "1.2.3"
libraryDependencies += "com.typesafe.scala-logging" %% "scala-logging" % "3.6.0"
libraryDependencies += "com.lightbend" %% "emoji" % "1.0.0"
libraryDependencies += "com.lightbend" %% "emoji" % "1.0.0"
libraryDependencies += "dev.zio" %% "zio" % "v1.0.0-RC8-8"