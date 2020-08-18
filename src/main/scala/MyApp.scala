import com.ryota0624.myreader
import com.typesafe.scalalogging.Logger

object MyApp extends App {
  val logger = Logger("my-app")

  logger.info("hello")
  logger.info(s"${myreader.LineReadable}")
}