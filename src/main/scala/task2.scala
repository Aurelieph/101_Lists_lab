object task2 extends App{

  var myList: List[String] = List("Grace","Paul","Fatima","Carolina")
  println(myList.mkString(","))
  println(myList.contains("Paul"))

  var newList: List[String]= myList.filter(x => x != "Paul")

  println(newList.mkString(","))



}
