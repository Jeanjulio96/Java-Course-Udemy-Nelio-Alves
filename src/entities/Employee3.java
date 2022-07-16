package entities;

public class Employee3 implements Comparable<Employee3>{

    private String name;
    private Double salary;

    public Employee3(String name, Double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    @Override
    public int compareTo(Employee3 other) {
        return name.compareTo(other.getName());
    }
}

