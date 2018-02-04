package objsets

/**
  * Created by bahar.gezici on 25/12/2017.
  */
object List {

  val a: Array[NonEmpty] = Array(new NonEmpty(1, Empty, Empty))
  val b: Array[IntSet] = a
  b(0) = Empty
  val s: NonEmpty = a(0)

}
