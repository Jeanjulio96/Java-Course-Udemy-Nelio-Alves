package entities;

public class Func {

    public String name;
    public double grossSalary;
    public double tax;

    public double netSalary() {

        return grossSalary - tax;
    }

    public double increasedSalary(double percentage) {

        percentage = (grossSalary * 10) / 100;
        return netSalary() + percentage;
    }

    public String toString() {

        return "Employee: " +
                name +
                " ," +
                " $  "
                + netSalary();

    }

    }