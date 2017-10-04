# HashMap
HashMap question answered for the KPCB fellowship application

Problem Statement:
Using only primitive types, implement a fixed-size hash map that associates string keys with arbitrary data object references. Your data structure should be optimized for algorithmic runtime and memory usage.
The solution should be delivered in one class (or your language's equivalent) that provides the following functions:

constructor(size): return an instance of the class with pre-allocated space for the given number of objects.
boolean set(key, value): stores the given key/value pair in the hash map. Returns a boolean value indicating success / failure of the operation.
get(key): return the value associated with the given key, or null if no value is set.
delete(key): delete the value associated with the given key, returning the value on success or null if the key has no value.
float load(): return a float value representing the load factor (`(items in hash map)/(size of hash map)`) of the data structure. Since the size of the dat structure is fixed, this should never be greater than 1.

Files included in zip file:
- Map class (The hashmap class)
- Entry class (Wrapper class used by the Map class)
- Test (The test used to test the hashmap class)

Command-line functions to compile and run the class:
- Compile:
  javac <Destination_folder>/Entry.java
  javac <Destination_folder>/Map.java
- Run:
  java <Destination_folder>/Entry.java
  java <Destination_folder>/Map.java

Runtime Analysis:
- constructor(size): O(size)
- boolean set(key, value): O(size)
- get(key): O(size)
- delete(key): O(size^2)
- float load(): O(1)

Memory usage:
Since the same initialized hashmap is being worked on when set, get and delete methods are called, we know that the memory used will be the size of the array "map".
