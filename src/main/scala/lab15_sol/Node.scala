package lab15_sol

class Node() {
  var item:String = ""
  var next:Node = null

  def this(s:String, n:Node) = {
    this()
    item = s
    next = n
  }
}

object Node extends App {
  val all:Node = new Node("Tokyo", new Node("Paris", new Node("Milan", null)))

  val a:Node = new Node("Milan", null)
  val b:Node = new Node("Paris", a)
  val c:Node = new Node("Tokyo", b)
}
