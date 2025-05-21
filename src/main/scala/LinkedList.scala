class LinkedList() {
  var head: Node = null

  def this(h: Node) {
    this()
    head = h
  }

  //  def tail() : LinkedList = new LinkedList(head.next)

  def addToStart(s: String): Unit = {
    if (head == null) {
      head = new Node(s, null)
    }
    else head = new Node(s, head)

  }

  def getSize(): Int = {

    //    if(head == null) 0 else 1 + tail.getSize()

    def countNode(node: Node): Int = {

      if (node == null) return 0
      if (node.next == null) return 1
      1 + countNode(node.next)
    }

    countNode(head)
  }

  def removeFirstElement(): Unit = {
    if (head.next == null) {
      head = null
    }
    else {
      head.item = head.next.item
      head.next = head.next.next
    }
  }

  def getLastElement(): Node = {

    def lastElement(n: Node): Node = {
      if (n == null || n.next == null) {
        return n
      }
      else lastElement((n.next))
    }


    lastElement(head)


  }

  def addToEnd(element: String): Unit = {
    getLastElement().next = new Node(element, null)
  }

  def isPresent(e: String): Boolean = {
    def check(n: Node): Boolean = {
      if (n == null) return false
      if (n.item.contains(e)) {
        return true
      }
      return check(n.next)
    }

    check(head)
  }

  def findElement(s: String): Node = {
    def check(n: Node): Node = {
      if (n == null) return n
      if (n.item == s) {
        return n
      }
      return check(n.next)
    }

    check(head)
  }

  def removeLastElement(): Unit = {


    if (head == null || head.next == null) {
      head = null
      return
    }
    //    if (head.next.next == null) {
    //      head.next = null
    //    }
    else {
      new LinkedList(head.next).removeLastElement()
    }






    //    var n = getLastElement()
    //    n = null

    //lastElement(head)

  }

  def swapElements(e1: String, e2: String): Unit = {
    findElement(e1).item = e2
    findElement(e2).item = e1


  }

  def removeElement(e: String): Unit = {
    var node = findElement(e)
    var name = node.item
    if (node != null) {
      if (findElement(e).next != null) {
        node.item = node.next.item
        node.next = node.next.next
      }
      else {
        removeLastElement()
      }


    }
  }


  def insertAfter(before: String, after: String): Unit = {
    var node = findElement(before)
    if (node != null) {
      var newNode = new Node(after, node.next)
      node.next = newNode
    }
  }

  override def toString: String = {

    var result: String = s"List content (size ${getSize()}) : "

    def nameNode(node: Node): String = {
      if (node == null) return "null"
      s"${node.item} -> ${nameNode(node.next)}"

    }

    result + nameNode(head)

  }


}

object LinkedList extends App {
  var flightList: LinkedList = new LinkedList()
  println(flightList)
  println(flightList.getSize())
  flightList.addToStart("Rome")
  println(flightList)
  //  println(flightList.getSize())
  //    flightList.addToStart("Paris")
  //    println(flightList)
  //  flightList.addToStart("Tokyo")
  //  println(flightList)
  //  flightList.removeFirstElement()
  //  println(flightList)
  //  println(flightList.getLastElement().item)
  //  flightList.addToEnd("Carolina")
  //  println(flightList)
  //  println((flightList.isPresent("Carolina")))
  //  flightList.swapElements("Carolina","Paris")
  //  println(flightList)
  flightList.removeLastElement()

  println(flightList)
  println(flightList.getSize())
  //  flightList.removeElement("Paris")
  //  println(flightList)
  //  flightList.insertAfter("Carolina","Berlin")
  //  println(flightList)
}
