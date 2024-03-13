import java.time.DayOfWeek
import java.time.LocalDate
import java.time.LocalTime
import java.time.Month
import java.time.MonthDay
import java.util.*
fun main(){
  //  var one = 80
  //  var two = 70
  //  var three = 55
  //  if(one > two){
     //   println("one")
   // }else if(two >three){
  //      println("two")
//    }else{
  //      println("three")
//    }
    time()
}
fun time(){
    var now = LocalDate.now()
    var then = LocalTime.now()
    println("current date is $now and the time is $then")
    var pet = DayOfWeek.WEDNESDAY
    var dot = Month.MARCH
    println("day is $pet and month is $dot")


    }
