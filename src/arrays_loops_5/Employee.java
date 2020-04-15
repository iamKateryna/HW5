package arrays_loops_5;

import java.util.Arrays;


public class Employee {
    private String name;
    private int departmentNumber;
    private int salary;

    public Employee(String name, int departmentNumber, int salary) {
        this.name = name;
        this.departmentNumber = departmentNumber;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDepartmentNumber() {
        return departmentNumber;
    }

    public void setDepartmentNumber(int departmentNumber) {
        this.departmentNumber = departmentNumber;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int compareTo(Object obj)
    {
        Employee tmp = (Employee)obj;
        if(this.salary < tmp.salary)
        {
            return -1;
        }
        else if(this.salary > tmp.salary)
        {
            return 1;
        }
        return 0;
    }
}
