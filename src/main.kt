
fun main(){
     var a=Names(listOf("Tut","Anjela","Naima","Tessa","Nyawera","Akuot","Saido","Swabrina","Marie","Esther"))
    println(a)

    var e=averageHeight(listOf(1,2,3,4,5,6))
    println(e)


    var person2=person("Angela",20,6.4,51.5)
    var person3=person("Salim",21,4.7,50.5)
    var person4=person("Munde",22,6.7,30.5)
    var person5=person("Brenda",23,7.7,25.5)
    var person6=person("Yusuf",24,8.7,50.5)
    var nameList= listOf(person2,person3,person4,person5,person6)
    var descNameList=nameList.sortedByDescending { person->person.age }
    println(descNameList)

    var student=person("jane",30, 5.5,60.4)
    var student1=person("peter",29,7.4,90.7)
    var Addpeople= mutableListOf(student,student)
    println(descNameList.plus(Addpeople))

    var car1=Car("KGD224K",123)
    var car2=Car("KBB200K",678)
    var bus= listOf(car1,car2)
    println(averagemileage(bus))




}

fun Names(names:List<String>):List<String>{
    var x = mutableListOf<String>()
    names.forEachIndexed() { index, b ->
        if (index % 2 == 0)

            x.add(b)

    }
    return x

}
fun averageHeight(height:List<Int>):String{
    var f = height.sum()
    var t = height.average()
    var total = "people's height is $f meters,and their average is $t"
    return total
}
data class person(var name:String, var age:Int, var height: Double, var weight:Double)

fun add(pupils:List<Any>):List<Any>{
    return listOf()
}

data class Car(var registration: Any,var mileage:Int)

fun averagemileage(K: List<Car>):Int{
    var v=0
    K.forEach{ cars->cars.mileage
        v+=cars.mileage
    }
    var total = v/K.count()
    return total

}



















//1. Given a list of 10 strings, write a function that returns a list of the strings
//at even indices i.e index 2,4,6 etc     (2 points)
//
//2. Given a list of people’s heights in metres. Write a function that returns
//the average height and the total height    (2 points)
//
//3. Given a list of Person objects, each with the attributes, name, age,
//height and weight. Sort the list in order of descending age   (2 points)
//
//4.  Given a list similar to the one above, write a function in which you will
//create 2 more people objects and add them to the list at one go.
//(1 points)
//
//5. Write a function that takes in a list of Car objects each with a
//registration and mileage attribute and returns the average mileage of
//all the vehicles in the list.      (3 points)