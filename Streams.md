### Streams API

- A list can be converted to stream for filtering.

For example:
```java
(ArrayList<String>) keywordArray.stream().filter(str -> str.trim().contains(search))
				.collect(Collectors.toList());
```
