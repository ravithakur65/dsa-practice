package dsa.practice.array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmployeeComparable {
    private int id;
    private String name;

    public EmployeeComparable(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() { return id; }
    public String getName() { return name; }

//    @Override
    public int compareTo(EmployeeComparable other) {
        return Integer.compare(this.id, other.id); // Sort by ID
    }

    @Override
    public String toString() {
        return "Employee{id=" + id + ", name='" + name + "'}";
    }

    public static void main(String[] args) {
        List<EmployeeComparable> employees = new ArrayList<>();
        employees.add(new EmployeeComparable(3, "Alice"));
        employees.add(new EmployeeComparable(1, "Bob"));
        employees.add(new EmployeeComparable(2, "Charlie"));
//        employees.sort(new Comparator<EmployeeComparable>() {
//            @Override
//            public int compare(EmployeeComparable o1, EmployeeComparable o2) {
//                return o1.compareTo(o2);
//            }
//        });
//        Collections.sort(employees, Comparable::compareTo);
//        Collections.sort(employees, (o1, o2) -> o1.compareTo(o2)); // Uses compareTo
//        Collections.sort(employees, Comparable::compareTo); // Natural order
        employees.sort(EmployeeComparable::compareTo); // Natural order
//        Collections.sort(employees); // Sort using the interface in the Employee calss
        System.out.println(employees); // [Employee{id=1, name='Bob'}, ...]
    }
}