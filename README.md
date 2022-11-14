# java7 Features
- try with resource statement
- Suppressed Exception
- Catching multiple Exceptions
- java.util.Objects class & null check
- @SafeVarargs indicates will not couse the heap polution
- The new interfaces & classes from java.nio.file.*
- String in switch statement
- Type inference or Diamond operator

# Java8 Features

### Terminal Operations - groupingBy()
- groupingBy collector is equivalent to the groupby clause in sql
- used to group the elements based on a property
- The ouput of groupingBy() is going to be a Map<K, V>
- There are three different version of groupingBy()
  - goupingBy(classifier)
  - groupingBy(classifier, downstream)

``` ruby
Map<Integer, Integer> deptSalaryMap = employees.stream()
                .collect(groupingBy(Employee::getDepartmentId, summingInt(Employee::getSalary)));
```
  - groupingBy(classifier, supplier, downstream)

### Stream API - Short Circuiting

``` ruby
Examples of Short Circuiting:
Example 1:
if(boolean1 && boolean2){ //AND
//body
}

If the first expression evaluates to false then the second expression
wont even execute.
Example 2:
if(boolean1 || boolean2){ //OR
//body
}

If the first expression evaluates to true then the second expression
wont even execute.
```

#### Stream API short circuit functions

  - limit()
  - findFirst()
  - findAny()
  - anyMatch()
  - allMatch()
  - noneMatch()

<p>All these functions does not have to iterate the whole stream to evaluate the result.</p>

