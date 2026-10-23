Part 1: Java Stream API — Complete method guide
1. First, understand how Streams work
   A Stream is a sequence of elements that lets you process data declaratively, without manually writing loops for every operation.

For example, suppose you have this list:
List<Integer> numbers = List.of(10, 15, 20, 25, 30);


Without Streams:
List<Integer> result = new ArrayList<>();

for (Integer n : numbers) {
if (n > 15) {
result.add(n);
}
}


With Streams:
List<Integer> result = numbers.stream()
.filter(n -> n > 15)
.toList();


Output:
[20, 25, 30]


The Stream pipeline has three parts:
1. Source

List, Set, array, generated values


2. Intermediate operations

filter → map → sorted → distinct


3. Terminal operation

toList, collect, count, reduce, forEach


Remember these three rules:
- Intermediate operations return another Stream and are generally lazy.
- Terminal operations trigger the pipeline and produce a result or side effect.
- A Stream is normally consumed only once. Create a new Stream from the source when you need another pipeline.

2. How to create Streams
   These methods help you obtain a Stream before processing anything. Method	When to use	Example
   collection.stream()	Sequential processing	list.stream()
   collection.parallelStream()	Parallel processing when justified by workload	list.parallelStream()
   Stream.of(...)	Create a Stream from individual values	Stream.of(1, 2, 3)
   Arrays.stream(array)	Stream an array	Arrays.stream(nums)
   Stream.empty()	Create an empty Stream	Stream.empty()
   Stream.builder()	Build a Stream incrementally	builder.add(1).add(2).build()
   Stream.iterate(...)	Generate a sequence using a recurrence	Stream.iterate(1, n -> n * 2)
   Stream.generate(...)	Generate values using a supplier	Stream.generate(Math::random)
   Stream.concat(a, b)	Combine two Streams	Stream.concat(s1, s2)
   Stream.ofNullable(value)	Stream zero or one element, including a possibly null value	Stream.ofNullable(value)

Example: generate the first five even numbers starting from 2.
List<Integer> evens = Stream.iterate(2, n -> n + 2)
.limit(5)
.toList();


Output: [2, 4, 6, 8, 10]

iterate() and generate() can produce infinite Streams. Always use a limiting operation or another operation that safely bounds the computation when you need a finite result.

Java also provides IntStream, LongStream, and DoubleStream for primitive values. They have specialized operations such as sum(), average(), min(), max(), and summaryStatistics().




3. Intermediate operations — the most important methods
   These methods transform, filter, reorder, or limit elements. They don't normally execute until a terminal operation is called.
   A. Filtering and removing elements
1. filter(Predicate)
   Keeps elements that satisfy a condition.
   numbers.stream()
   .filter(n -> n > 10)
   .toList();


Use when you need to retain only matching elements: adults above 18, employees earning more than ₹10 LPA, even numbers, and so on.

2. distinct()
   Removes duplicate elements according to equals() and hashCode().
   Stream.of(1, 2, 2, 3, 3)
   .distinct()
   .toList();


Output: [1, 2, 3]

Use when you need unique values. For custom objects, make sure equality is defined appropriately.

3. takeWhile(Predicate) — Java 9+
   Keeps elements from the beginning until the first element fails the condition.
   Stream.of(2, 4, 6, 3, 8)
   .takeWhile(n -> n % 2 == 0)
   .toList();


Output: [2, 4, 6]

Notice that 8 isn't included because the sequence already encountered 3.

Use for ordered data when you need the initial matching segment.

4. dropWhile(Predicate) — Java 9+
   Drops elements from the beginning until the first element fails the condition, then retains the rest.
   Stream.of(2, 4, 6, 3, 8)
   .dropWhile(n -> n % 2 == 0)
   .toList();


Output: [3, 8]

Use when you need to skip an initial matching segment, rather than every element matching a condition.

Interview distinction: filter() checks every element independently. takeWhile() and dropWhile() have special prefix-based behavior on ordered Streams.
B. Transforming elements
5. map(Function)
   Transforms each element into one output element.
   List<String> names = List.of("amit", "riya");

names.stream()
.map(String::toUpperCase)
.toList();


Output: [AMIT, RIYA]

Use for extracting a property, converting types, or transforming values.

6. flatMap(Function)
   Transforms each element into a Stream and flattens all resulting Streams into one.
   List<List<Integer>> nested =
   List.of(List.of(1, 2), List.of(3, 4));

nested.stream()
.flatMap(List::stream)
.toList();


Output: [1, 2, 3, 4]

Use for nested collections, such as departments containing employees, orders containing products, or sentences containing words.

7. mapMulti(BiConsumer) — Java 16+
   Allows one input element to emit zero, one, or multiple output elements using a downstream consumer.
   Stream.of("a,b", "c,d")
   .<String>mapMulti((text, out) -> {
   for (String part : text.split(",")) {
   out.accept(part);
   }
   })
   .toList();


Output: [a, b, c, d]

Use as an alternative to some flatMap() pipelines when directly emitting results is convenient.

Primitive mapping methods
Use these when converting object Streams to primitive Streams for numerical operations.
Method	Example	Result type
mapToInt()	.mapToInt(String::length)	IntStream
mapToLong()	.mapToLong(Employee::getId)	LongStream
mapToDouble()	.mapToDouble(Employee::getSalary)	DoubleStream
flatMapToInt()	Flatten IntStream values	IntStream
flatMapToLong()	Flatten LongStream values	LongStream
flatMapToDouble()	Flatten DoubleStream values	DoubleStream

Example:
int total = List.of("Java", "Spring", "SQL")
.stream()
.mapToInt(String::length)
.sum();


Output: 12

This is preferable to manually converting each length and accumulating the result.
C. Sorting and limiting
8. sorted()
   Sorts elements by natural order.
   numbers.stream().sorted().toList();


For custom ordering:
employees.stream()
.sorted(Comparator.comparing(Employee::getSalary))
.toList();


Descending order:
employees.stream()
.sorted(Comparator.comparing(Employee::getSalary)
.reversed())
.toList();


Use for rankings, salary order, alphabetical sorting, or top/bottom results.

9. limit(long maxSize)
   Retains at most the first N elements.
   numbers.stream().limit(3).toList();


Use for the first three records or top-N results after sorting.

10. skip(long n)
    Skips the first N elements.
    numbers.stream().skip(3).toList();


Use for pagination or ignoring initial records.

For pagination, the usual pattern is .skip((long) page * size).limit(size). Define page as zero-based.

11. peek(Consumer)
    Performs an action on elements as they pass through the pipeline, without transforming them.
    numbers.stream()
    .peek(System.out::println)
    .filter(n -> n > 5)
    .toList();


Use primarily for debugging. It is not a reliable way to implement required business side effects because lazy evaluation and optimizations may prevent an action from running for every source element.

D. Controlling execution
Method	Purpose	Important detail
sequential()	Requests sequential execution	Useful when switching from parallel processing
parallel()	Requests parallel execution	Does not guarantee faster execution
unordered()	Removes the requirement to preserve encounter order	Can enable more efficient parallel processing
onClose(Runnable)	Registers a close handler	Relevant to Streams that own or wrap resources
close()	Closes the Stream	Usually important for resource-backed Streams, such as file lines

Example:
try (Stream<String> lines = Files.lines(path)) {
long count = lines.filter(s -> !s.isBlank()).count();
}


The try-with-resources block closes the file-backed Stream.

Important: Don't use parallel Streams blindly. For most small collections, normal stream() is the simpler choice. Parallel processing is worth considering only after assessing workload, data size, thread safety, ordering requirements, and measurement results.

4. Terminal operations — methods that produce results
   These operations end the pipeline.
   A. Finding and counting
   Method	Return type	When to use
   count()	long	Count matching elements
   min(Comparator)	Optional<T>	Find the minimum
   max(Comparator)	Optional<T>	Find the maximum
   findFirst()	Optional<T>	Find the first element
   findAny()	Optional<T>	Find any element, especially when order doesn't matter
   anyMatch(Predicate)	boolean	At least one element matches
   allMatch(Predicate)	boolean	Every element matches
   noneMatch(Predicate)	boolean	No elements match

Examples:
boolean hasHighSalary = employees.stream()
.anyMatch(e -> e.getSalary() > 1_000_000);

Optional<Employee> highestPaid = employees.stream()
.max(Comparator.comparing(Employee::getSalary));


Remember:
- findFirst(), findAny(), min() and max() return an Optional.
- Match operations short-circuit when the result is known.
- allMatch() and noneMatch() return true for an empty Stream; anyMatch() returns false.
- Don't call .get() on an Optional without checking whether a value exists or using a suitable alternative.
  B. Collecting results
  Method	When to use
  toList()	Obtain an unmodifiable List (Java 16+)
  collect(collector)	Collect into a List, Set, Map, grouped result, or custom container
  toArray()	Convert to an array
  toArray(generator)	Create a typed array
  forEach()	Perform an action for each element
  forEachOrdered()	Process elements in encounter order when defined
  iterator()	Obtain an iterator
  spliterator()	Obtain a Spliterator for traversal or splitting

Example:
String[] names = employees.stream()
.map(Employee::getName)
.toArray(String[]::new);


Stream.toList() returns an unmodifiable list. If you need a mutable ArrayList, use:
List<Integer> mutable = numbers.stream()
.collect(Collectors.toCollection(ArrayList::new));


C. Reducing values into one result
reduce() combines elements using an associative accumulation operation.

Three important forms:
// 1. No identity: result may be empty
Optional<Integer> result = numbers.stream()
.reduce(Integer::sum);

// 2. Identity and accumulator
int sum = numbers.stream()
.reduce(0, Integer::sum);

// 3. Identity, accumulator and combiner
int total = numbers.parallelStream()
.reduce(0, Integer::sum, Integer::sum);


Use reduce() for combining values, such as sum, product, or a custom associative operation. For simple numeric totals, mapToInt(...).sum() is often clearer. For mutable containers, prefer collect() over mutating a container inside reduce().
D. Primitive Stream terminal methods
For IntStream, LongStream, and DoubleStream, learn these as well:
Method	Purpose
sum()	Calculate total
average()	Return OptionalDouble
min() / max()	Find extreme values
count()	Count elements
summaryStatistics()	Get count, sum, min, max and average
boxed()	Convert primitives into wrapper objects
asLongStream() / asDoubleStream()	Convert primitive Stream types where supported
range() / rangeClosed()	Generate integer or long sequences on specialized Streams
mapToObj()	Convert primitive values to objects
mapToLong() / mapToDouble()	Convert to other primitive Stream types

Example:
IntSummaryStatistics stats = numbers.stream()
.mapToInt(Integer::intValue)
.summaryStatistics();


You can then call stats.getCount(), getSum(), getMin(), getMax() and getAverage().





5. The Collectors class — essential for interviews
   Many advanced Stream questions are actually questions about Collectors. The collect() method takes a Collector that describes how to accumulate elements into a result.

Import:
import java.util.stream.Collectors;


A. Basic collectors
Collector	Purpose	Example
toList()	Collect into a List	collect(toList())
toSet()	Collect into a Set	collect(toSet())
toCollection()	Choose the collection type	toCollection(TreeSet::new)
joining()	Join strings	joining(", ")
counting()	Count elements	counting()
summarizingInt()	Produce integer statistics	summarizingInt(String::length)
summarizingLong()	Produce long statistics	summarizingLong(Employee::getId)
summarizingDouble()	Produce double statistics	summarizingDouble(Employee::getSalary)
summingInt()	Sum mapped integers	summingInt(Employee::getAge)
summingLong()	Sum mapped longs	summingLong(Employee::getId)
summingDouble()	Sum mapped doubles	summingDouble(Employee::getSalary)
averagingInt()	Calculate an integer-derived average	averagingInt(Employee::getAge)
averagingLong()	Calculate a long-derived average	averagingLong(Employee::getId)
averagingDouble()	Calculate a double-derived average	averagingDouble(Employee::getSalary)
minBy() / maxBy()	Find a minimum or maximum using a Comparator	maxBy(Comparator.naturalOrder())
reducing()	Reduce elements through a Collector	reducing(Integer::sum)

Example — join names:
String result = List.of("Amit", "Riya", "Neha")
.stream()
.collect(Collectors.joining(", "));


Output: Amit, Riya, Neha
B. Grouping and partitioning
These are particularly important for employee-based questions.

groupingBy() — group elements using a classifier
Map<String, List<Employee>> byDepartment =
employees.stream()
.collect(Collectors.groupingBy(
Employee::getDepartment));


Example result: Engineering → employees in Engineering; HR → employees in HR.

You can also specify a downstream collector:
Map<String, Long> countByDepartment =
employees.stream()
.collect(Collectors.groupingBy(
Employee::getDepartment,
Collectors.counting()));


partitioningBy() — split into two groups
Map<Boolean, List<Employee>> result =
employees.stream()
.collect(Collectors.partitioningBy(
e -> e.getSalary() > 800_000));


The keys are true and false.

mapping() — transform values inside a group
Map<String, List<String>> namesByDepartment =
employees.stream()
.collect(Collectors.groupingBy(
Employee::getDepartment,
Collectors.mapping(
Employee::getName,
Collectors.toList())));


filtering() — filter inside a downstream group (Java 9+)
Map<String, List<Employee>> highPaidByDepartment =
employees.stream()
.collect(Collectors.groupingBy(
Employee::getDepartment,
Collectors.filtering(
e -> e.getSalary() > 800_000,
Collectors.toList())));


This retains all department keys encountered, even if a particular department has no employees who satisfy the downstream filter. A normal upstream filter() would remove those employees before grouping and might omit their departments altogether.

flatMapping() — flatten nested values inside a group (Java 9+)

Useful when each employee has a collection of skills and you want all skills grouped by department.

collectingAndThen() — apply a finishing transformation
List<Integer> result = numbers.stream()
.collect(Collectors.collectingAndThen(
Collectors.toList(),
List::copyOf));


teeing() — run two collectors and combine their results (Java 12+)

Useful when one traversal needs to calculate two different summaries, such as total and count, then combine them into one result.

toMap() and toConcurrentMap()
Map<Integer, String> namesById = employees.stream()
.collect(Collectors.toMap(
Employee::getId,
Employee::getName));


If duplicate keys are possible, supply a merge function:
Map<String, Integer> result = Stream.of("java", "sql", "java")
.collect(Collectors.toMap(
s -> s,
s -> 1,
Integer::sum));


Output: {java=2, sql=1}

toConcurrentMap() is useful when a concurrent map is appropriate, especially for parallel collection. It also requires you to consider duplicate keys and merge behavior.
C. Other important Stream patterns
- Optional.map() and Optional.flatMap() — transform a possibly present result.
- Optional.orElse(), orElseGet(), orElseThrow() — handle missing results.
- Comparator.comparing(), thenComparing(), reversed(), and nullsFirst() / nullsLast() — construct sorting rules.
- Collectors.groupingBy() with maxBy() or minBy() — calculate highest or lowest values per group.
- Collectors.toMap() with a merge function — deduplicate or aggregate records by key.
- IntStream.range() and rangeClosed() — generate index sequences or numerical ranges.
  One important distinction: Collectors.toList() does not promise a specific List implementation or mutability, whereas Stream.toList() returns an unmodifiable List.

6. A compact decision guide
   What do you need to do?

Keep elements matching a condition

Transform every element

Flatten nested collections

Calculate a total or average

Group records by a property

Split records into two categories

Sort and retrieve the top N

Find one matching record

Count occurrences or frequencies

Remove duplicates


Use: filter()
stream.filter(x -> condition).toList();







Part 2: Your 60 Java Stream API practice questions
Rules for this challenge
- Solve in order, from easy to hard.
- Use Java Streams rather than traditional loops wherever possible.
- Don't look up solutions before attempting each question.
- For custom-object questions, create your own Employee, Order, or Student class with the required fields.
- Use Java 17 for all questions unless a question explicitly tests a newer feature.
  Level 1 — Easy: Build your fundamentals
  Questions 1–15 · Focus: filter, map, distinct, sorted, limit, skip, count, matching and finding.
  Easy practice
  0/15 completed



[ ] 1. Given a list of integers, filter out all even numbers.

[ ] 2. Given a list of integers, return only numbers greater than 50.

[ ] 3. Convert a list of names to uppercase using map().

[ ] 4. Convert a list of strings to their respective lengths.

[ ] 5. Remove duplicate integers from a list.

[ ] 6. Sort a list of integers in ascending order.

[ ] 7. Sort a list of strings in descending alphabetical order.

[ ] 8. Find the square of every number and collect the results into a List.

[ ] 9. Count how many numbers in a list are divisible by 5.

[ ] 10. Find the first number greater than 100 and return it as an Optional.

[ ] 11. Check whether any number is negative.

[ ] 12. Check whether all numbers are positive.

[ ] 13. Check whether no string in a list is blank.

[ ] 14. Retrieve the first five elements of a list using limit().

[ ] 15. Skip the first three elements and return all remaining elements.


Level 2 — Intermediate: Transformations and real data
Questions 16–30 · Focus: flatMap, reduce, primitive Streams, Optional, custom sorting and basic collectors.
Intermediate practice
0/15 completed



[ ] 16. Given a list of sentences, extract all words into a single List<String> using flatMap().

[ ] 17. Given a list of lists of integers, flatten it into a single list.

[ ] 18. Find the sum of all integers using reduce().

[ ] 19. Find the product of all integers using reduce().

[ ] 20. Find the maximum and minimum numbers using Stream terminal operations.

[ ] 21. Convert a list of numeric strings into integers and calculate their sum.

[ ] 22. Given a list of names, find the longest name using max() and a Comparator.

[ ] 23. Given a list of integers, return the squares of all odd numbers.

[ ] 24. Given a list of integers, calculate count, sum, minimum, maximum and average using summaryStatistics().

[ ] 25. Join a list of names into one comma-separated String using Collectors.joining().

[ ] 26. Convert a list of strings to a typed String array using toArray().

[ ] 27. Generate the first 20 multiples of 3 using Stream.iterate() and limit().

[ ] 28. Combine two lists into a single Stream using Stream.concat().

[ ] 29. Use takeWhile() to retrieve the initial sequence of numbers below 50, stopping at the first number that is 50 or greater.

[ ] 30. Use dropWhile() to discard the initial sequence of numbers below 50, retaining the rest.


Level 3 — Advanced: Grouping, partitioning and custom objects
Questions 31–45 · Focus: groupingBy, partitioningBy, mapping, counting, toMap, Optional, and comparators.

For Questions 31–45, use this sample model and create your own data:
class Employee {
private int id;
private String name;
private String department;
private double salary;
private int age;
private List<String> skills;

    // Constructor, getters and setters
}


Advanced practice
0/15 completed



[ ] 31. Group employees by department, returning Map<String, List<Employee>>.

[ ] 32. Count employees in each department using groupingBy() and counting().

[ ] 33. Calculate the average salary for each department.

[ ] 34. Find the highest-paid employee in the entire organization.

[ ] 35. Find the highest-paid employee in each department.

[ ] 36. Partition employees into two groups: salary above ₹800,000 and salary at or below ₹800,000.

[ ] 37. Return a Map<String, List<String>> containing employee names grouped by department, using Collectors.mapping().

[ ] 38. Calculate the total salary expenditure for each department.

[ ] 39. Find the second-highest distinct salary in the organization.

[ ] 40. Find the three highest-paid employees without modifying the original collection.

[ ] 41. Convert employees into a Map<Integer, Employee> keyed by employee ID.

[ ] 42. Create a Map<String, Long> that counts the occurrences of each word in a list, ignoring case.

[ ] 43. Find departments with more than three employees using grouping and filtering of the resulting map.

[ ] 44. Flatten all employees' skill lists and return a list of unique skills.

[ ] 45. Find the youngest employee in each department, handling empty results safely with Optional where appropriate.


Level 4 — Hard: Interview-level Stream challenges
Questions 46–60 · Focus: nested data, downstream collectors, merge functions, mapMulti, teeing, ordering and parallel processing.
Hard practice
0/15 completed



[ ] 46. Given a list of Orders, each containing multiple OrderItems, flatten the items and calculate the total revenue across all orders.

[ ] 47. Given a list of transactions, group them by customer ID and calculate each customer's total transaction amount using groupingBy() and summingDouble().

[ ] 48. Find the most frequently occurring word in a paragraph. If there is a tie, return the alphabetically first word.

[ ] 49. Find the top two highest-paid employees in each department, preserving department names even when fewer than two employees qualify.

[ ] 50. Given a list of employees with multiple skills, return a Map<String, Long> counting how many employees possess each distinct skill. Count each skill at most once per employee.

[ ] 51. Convert a list of employees into a Map<String, Employee> keyed by name. If names repeat, keep the employee with the higher salary using the toMap() merge function.

[ ] 52. Given a list of strings, split each string by commas using mapMulti() and collect all nonblank tokens after trimming whitespace.

[ ] 53. Use Collectors.teeing() to calculate both the sum and count of a list of integers in one collection pass, then produce their average safely for an empty input.

[ ] 54. Group employees by department and collect only their distinct job titles into a Set using groupingBy() and a suitable downstream collector.

[ ] 55. Given a list of orders, use nested grouping to produce Map<String, Map<String, Long>> representing the number of orders by country and then by status.

[ ] 56. Implement a custom Collector that collects integers into a TreeSet, removing duplicates while preserving sorted order. Test its behavior on a parallel Stream.

[ ] 57. Compare sequential and parallel Streams for summing a large dataset. Verify that the result is correct and explain how workload, boxing, ordering and shared mutable state affect performance.

[ ] 58. Given a list of strings, generate all distinct character values using flatMapToInt(), then return them in sorted order as characters.

[ ] 59. Given a list of transactions with timestamps, group them by calendar date and calculate daily totals, taking care to use the correct date type and currency precision.

[ ] 60. Build a complete employee analytics pipeline: filter active employees, group by department, calculate employee count and average salary, find the highest-paid employee in each department, and return an appropriate summary DTO per department.



Part 3: Make sure you've covered the methods
Use this checklist after the 60 questions. Some methods require a small separate experiment rather than a standalone problem.
API coverage tracker
0/18

[ ] filter, map, flatMap, mapMulti

Practice: 1, 3, 16, 17, 52


[ ] distinct, sorted, limit, skip

Practice: 5–7, 14–15, 40


[ ] takeWhile, dropWhile

Practice: 29–30


[ ] count, min, max, findFirst, findAny

Practice: 9–10, 20, 35


[ ] anyMatch, allMatch, noneMatch

Practice: 11–13


[ ] reduce, sum, average, summaryStatistics

Practice: 18–19, 24, 32–33, 53


[ ] groupingBy, partitioningBy, counting

Practice: 31–36, 44, 55–56


[ ] mapping, filtering, flatMapping

Practice: 37, 43–44


[ ] joining, toList, toSet, toCollection, toArray

Practice: 10, 25, 31, 44


[ ] toMap, toConcurrentMap, merge functions

Practice: 41, 52


[ ] teeing, collectingAndThen, reducing

Practice: 53; add separate experiments


[ ] IntStream, LongStream, DoubleStream

Practice: 8, 24, 58


[ ] iterate, generate, range, rangeClosed

Practice: 27; add separate experiments


[ ] concat, empty, ofNullable, builder

Practice: 28; add separate experiments


[ ] parallel, sequential, unordered, onClose

Practice: 57; add separate experiments


[ ] peek, forEach, forEachOrdered, iterator, spliterator

Practice: Add separate experiments


[ ] Comparator chaining and null handling

Practice: 22, 35, 48


[ ] Optional map, flatMap, orElse, orElseGet, orElseThrow

Practice: 10, 35; add separate experiments



A quick clarification: the 60 questions cover the major practical Stream API patterns, but they do not individually test every overload or every specialized method. The final checklist fills those gaps with short experiments.

My recommendation: solve Questions 1–15 first, then send me your code for review. I'll check correctness, edge cases, whether you're using the right Stream method, and whether your solution is interview-ready.