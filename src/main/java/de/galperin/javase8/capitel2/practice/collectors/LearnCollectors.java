package de.galperin.javase8.capitel2.practice.collectors;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LearnCollectors {
    public static void main(String[] args) {
        System.out.println("******Collectors usage********");
        Stream<Character> strm = Stream.of('a','b','c');
        List<Character> result = strm.collect(Collectors.toList());
        System.out.println(result);

        System.out.println("******map creation using streams*********");
        Employee e1 = new Employee(1,"anshul");
        Employee e2 = new Employee(2,"anshu");
        Employee e3 = new Employee(3,"ansh");
        List<Employee> employees = Arrays.asList(e1,e2,e3);
        Map<Object,Employee> myMap = employees.stream().collect(Collectors.toMap(emp -> emp.getId(), Function.identity()));
        System.out.println(myMap);
    }
}

class Employee {
    private int id;
    private String name;
    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}