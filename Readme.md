## I/O Streams
- Scanner - best for simple text and when you want to parse numbers or words easily.
- BufferedReader ( BufferedReader, BufferedWriter ) - best for large text files, because it is faster and reads line by line.
- FileReader ( File, FileWriter ) - best for simple character data when you don't need advanced features like buffering.
- FileInputStream ( FileInputStream, FileOutputStream ) - best for binary data (images, audio, PDFs) or when you need full control of raw bytes.


## Collections Framework
- Interfaces like **List, Set, Map** define what tools can do, and classes like **ArrayList, HashSet, HashMap**

| Interface	| Common Classes	| Description |
| ------------- | ------------- |:-------------:| 
| List	| ArrayList, LinkedList	| Ordered collection that allows duplicates |
| Set	|HashSet, TreeSet, LinkedHashSet	| Collection of unique elements |
| Map	|HashMap, TreeMap, LinkedHashMap	| Stores key-value pairs with unique keys | 

- List is better when i want to access elements by index, also has duplicates.
- Set only when need unique values.
- Map when need key value pairs.