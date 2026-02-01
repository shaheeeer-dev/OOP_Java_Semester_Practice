```
Generics Practice Problems

Problem 1: Generic Box

Scenario:
You want a container that can hold any type of object safely without casting.

Requirements:
•	Create a generic class Box<T> with a field content of type T.
•	Provide methods: setContent(T content) and getContent().
•	Test the class by storing an Integer, a String, and a Double.

Focus:
•	Generic class
•	Type safety
•	Avoid casting

⸻

Problem 2: Generic Pair

Scenario:
You need a reusable class that can store a pair of objects of potentially different types.

Requirements:
•	Create a generic class Pair<K, V> with fields key of type K and value of type V.
•	Provide methods: getKey(), getValue(), setKey(K key), setValue(V value).
•	Test the class with:
•	Pair<String, Integer> for a person’s name and age
•	Pair<Integer, String> for product ID and name

Focus:
•	Generic class with multiple type parameters
•	Reusable container
•	Type safety without casting

⸻

Problem 3: Generic Method

Scenario:
You want a reusable method to print arrays of any type without duplicating code.

Requirements:
•	Create a class Printer with a generic static method:

      public static <T> void printArray(T[] array)

•	Test it with arrays of Integer[], String[], and Double[].

Focus:
•	Generic method
•	Reusable for any type of array
•	Avoid code duplication
