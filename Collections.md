### Collection Framework
- Collections are the containers that groups multiple item in single unit.
- Provides an architecture to store and manipulate the group of objects.
- Operations such as searching, sorting, inserting, manipulation, deletion...etc are supported.
- Has many interfaces and classes

## Hierarchy
```
Iterable
 └─── Collection  
   └─── List
   	└─── ArrayList
   	└─── LinkedList
   	└─── Vector
   		└─── Stack 
   └─── Queue
   	└─── PriorityQueue
   	└─── Deque
   	└─── ArrayQueue
   └─── Set
   	 └─── HashSet
   	 └─── LinkedHashSet
   └─── Map
   	 └─── HashMap
   	 └─── HashTable
   	 └─── StoredMap
   	 	└─── TreeMap
```
## Interfaces
- Iterator - `hasNext()`;`next()`;`remove()`;
- Iterable - `iterator()`;
- Collection - `add()`;`addAll()`;`clear()`;....