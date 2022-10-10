fun main() {

    val Groups = arrayOf<String>("Group1", "Group2","Group3", "Group4")

    println(Groups[0])
    println(Groups.get(1))
    println("____________")

    Groups[0]= "Group Satu"
    Groups.set(1, "Group Dua")

    println(Groups[0])
    println(Groups.get(1))
    println(Groups.get(2))
}