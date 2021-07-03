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

