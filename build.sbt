name := "my-app"

version := "0.1"

crossScalaVersions := Seq("2.12.10", "2.13.1")

lazy val myReaderRepository = ProjectRef(uri("git://github.com/ryota0624/my-reader.git#master"), "my-reader")

dependsOn(myReaderRepository)