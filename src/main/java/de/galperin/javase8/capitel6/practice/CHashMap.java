package de.galperin.javase8.capitel6.practice;

import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
public class CHashMap {

    public static void main(String[] args) {
        Employee e1 = new Employee(1);
        Employee e2 = new Employee(2);
        Map<Employee,String> map = new ConcurrentHashMap<>();
        map.put(e1,"hunny");
        map.put(e2,"anshul");
        map.putIfAbsent(e1,"shalu");  // wont get pushed
        System.out.println(map.size());
        map.computeIfAbsent(new Employee(3), emp -> String.valueOf(emp.getId()));
        System.out.println(map);
    }
}

class Employee {
    private int id;
    public Employee(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        System.out.println("equal called");
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id;
    }

    @Override
    public int hashCode() {
        // return 1;
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                '}';
    }
}

// Learning..if hashCode is different,equals doesnt get called
// If hashcode is same,than equals get called