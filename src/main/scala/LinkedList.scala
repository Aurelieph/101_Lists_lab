class LinkedList() {
  var head: Node = null

  def addToStart(s: String): Unit = {
    if (head == null) {
      head = new Node(s, null)
    }
    else head = new Node(s, head)

  }

  def getSize(): Int = {
    var number: Int = 0
    //    while (true) {
    //      if (head.next != null){
    //        number +=1
    //      }
    //      else return number
    //    }
    //    number
    var nb: Int = 0

    def countNode(node: Node): Int = {

      if (node == null) return 0
      if (node.next == null) return 1
      1 + countNode(node.next)
    }

    countNode(head)
  }

  override def toString: String = {

    var result: String = s"List content (size ${getSize()}) : "

    def nameNode(node: Node): String = {
      if (node == null) return "null"

      //if (node.next == null) return node.item
      s"${node.item} -> ${nameNode(node.next)}"

    }

    result + nameNode(head)

  }

}

object LinkedList extends App {
  var flightList: LinkedList = new LinkedList()
  println(flightList)
  flightList.addToStart("Rome")
  println(flightList)
  flightList.addToStart("Paris")
  println(flightList)
  flightList.addToStart("Tokyo")
  println(flightList)
}
