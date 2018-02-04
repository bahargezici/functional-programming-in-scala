import patmat.Huffman

object Hello extends App {
    val list = List('c', 'a', 'b', 'a', 'a', 'b')
    Huffman.times(list)

  Huffman.makeOrderedLeafList(Huffman.times(list))
}
