name := "my-app"

version := "0.1"

crossScalaVersions := Seq("2.12.10", "2.13.1")

lazy val myReaderRepository = RootProject(uri("git://github.com/ryota0624/my-reader.git#feature/multi_module"))
lazy val subMyReaderRepository = ProjectRef(uri("git://github.com/ryota0624/my-reader.git#feature/multi_module"), "sub")

dependsOn(myReaderRepository, subMyReaderRepository)