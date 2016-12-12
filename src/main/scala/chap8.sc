
def fileLines(file: java.io.File) =
  scala.io.Source.fromFile(file).getLines().toList

def getFilesList(path:String) ={
  val files = new java.io.File(path).listFiles
  for {
    file <- files
        if file.getName.contains("properties")
      line <- fileLines(file)
  }    yield  line

}
val fileLineData = getFilesList(".")
fileLineData.length
//for (line <- fileLineData) println(line)

val keyValuesPairs: Array[(String, String)] =
  for (line :String <- fileLineData)
  yield{  line.split("""=""") match {
      case Array(k,v) => (k,v)
      case Array(k) => (k,"")
      case _ => ("too many colons","not good")
  }
    //  .map{ case (k, v) => (k.substring(1, k.length-1), v.substring(1, v.length-1))}
  //.toMap
}

//val (key, value) = keyValuesPairs.spl
println("this is " + keyValuesPairs.toMap.keySet)

def getFilesListPath(path:String): Array[String] ={
  val files = new java.io.File(path).listFiles
  for {
    file <- files
    if file.getName.contains("properties")
  }    yield  file.getAbsolutePath
}
val abc = getFilesListPath(".")
for(a <- abc) println(a)
