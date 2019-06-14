// src/main/scala/progscala2/introscala/upper1.sc
package progscala2.introscala

object Upper {
  def main(args: Array[String]) = {
    val output = args.map(_.toUpperCase()).mkString(" ")
    println(output)
  }
}
