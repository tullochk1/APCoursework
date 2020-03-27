object Coursework {

  import scala.io.Source
  import java.io.PrintWriter

  var routeInfo: Map[String, List[(Int, String, Float)]] = Map()
  val source = Source.fromFile("cyclingroutedata.txt")
  var line = ""

  def main(args: Array[String]): Unit = {
    loadData()
  }

  def loadData(): Unit = {

    for (line <- source.getLines) {

      val result = line.split(',')


      for (v <- result) {
        println(v)
      }

    }

  }
}