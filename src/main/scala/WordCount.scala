import org.apache.flink.api.scala.ExecutionEnvironment

import java.io.{File, FileOutputStream, FileReader, InputStream}
import java.util.Date

object WordCount {
  def main(args: Array[String]): Unit = {
    val env: ExecutionEnvironment = ExecutionEnvironment.getExecutionEnvironment

    val file: File = new File("abc.txt")
    val fos: FileOutputStream = new FileOutputStream(file)
    fos.write("https://sehuatang.net/forum.php?mod=viewthread&tid=734439".getBytes())
    fos.close()



    print(new Date().getTime)
  }
}
