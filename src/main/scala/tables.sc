def integetTable(num:Int) ={
  for(i <- 1 to 10) yield num * i
}
integetTable(2)
def sumOfTable(num:Int)={
  integetTable(num).sum
}
sumOfTable(2)
integetTable(2).reduceLeft((x,y)=>x+y)
integetTable(2).reduceRight((x,y)=>x+y)
integetTable(2).foldLeft(1)((x,y)=>x+y)
integetTable(2).foldRight(0)((x,y)=>x+y)
integetTable(2).fold(1)((x,y)=>x+y)


// Returns a row as a sequence
def makeRowSeq(row: Int) =
  for (col <- 1 to 10) yield {
    val prod = (row * col).toString
    val padding = " " * (4 - prod.length)
    padding + prod
  }

// Returns a row as a string
def makeRow(row: Int) = makeRowSeq(row).mkString

// Returns table as a string with one row per line
def multiTable() = {

  val tableSeq = // a sequence of row strings
    for (row <- 1 to 10)
      yield makeRow(row)

  tableSeq.mkString("\n")
}
multiTable