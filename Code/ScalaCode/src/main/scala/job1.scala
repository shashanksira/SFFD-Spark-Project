package job1

import org.apache.spark.sql.SparkSession

object job1sub {
    val spark = SparkSession.builder().getOrCreate()

    println("larkin")
    def method1(): Unit = {
        val df = spark.read.csv("D:/Documents/sharpestminds/SparkProject/Data/FireDepartmentSample.csv")
        df.write.parquet("D:/Documents/sharpestminds/SparkProject/Data/Fire.parquet")
    }
}