```kotlin
fun main() {
    val list = mutableListOf(1, 2, 3, 4, 5)
    val newList = list.toMutableList() // Create a copy
    newList.removeIf { it % 2 == 0 }
    println(list) // Original list remains unchanged
    println(newList) // Modified list

    val map = mutableMapOf("a" to 1, "b" to 2, "c" to 3)
    val newMap = map.toMutableMap() // Create a copy
    newMap.entries.removeIf { it.value % 2 == 0 }
    println(map) // Original map remains unchanged
    println(newMap) // Modified map

    val set = mutableSetOf(1, 2, 3, 4, 5)
    val newSet = set.toMutableSet() //Create a copy
    newSet.removeIf {it % 2 == 0}
    println(set) // Original set remains unchanged
    println(newSet) // Modified set
}
```