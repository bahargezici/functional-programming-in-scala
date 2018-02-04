package funsets

object Main extends App {
  import FunSets._
  println(contains(singletonSet(1),1))

  val s1 = singletonSet(1)
  val s2 = singletonSet(2)
  val s = union(s1, s2)
  val s3 = diff(s, s2)

  val s_filter = filter(s, s2)
  println(contains(s,2))

  println(printSet(s))
  println(printSet(s_filter))



}
