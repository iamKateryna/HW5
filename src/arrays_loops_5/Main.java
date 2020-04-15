package arrays_loops_5;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

	    int[] numbers;
	    numbers = new  int[10];
	    for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) Math.round((Math.random() * 200)-100) ;
            System.out.println(numbers[i]);
	    }
	    System.out.println("max " + maximum(numbers) + " \nsum "+ sumpos(numbers) + " \ncount " + countneg(numbers));


        Employee[] employees = new Employee[5];

        employees[0] = new Employee("Alice", 6, 9864);
        employees[1] = new Employee("Mike", 1, 15000);
        employees[2] = new Employee("Brad", 8, 98640);
        employees[3] = new Employee("Alex", 5, 3000);
        employees[4] = new Employee("Ien", 6, 50000);

        System.out.println("Enter deparnment number");
        int dn = scanner.nextInt();

        System.out.println("Employees in department number" + dn);

        for(int i = 0; i < employees.length; i++)
        { if (employees[i].getDepartmentNumber() == dn)
            System.out.println(employees[i].getName());
        }

        System.out.println("Sorted by salary");

        for (int i = 0; i < employees.length; i++)
        {

                for (int j = 0; j < employees.length-i-1; j++)
                    if (employees[j].getSalary() > employees[j+1].getSalary())
                    {
                        Employee temp = employees[j];
                        employees[j] = employees[j+1];
                        employees[j+1] = temp;
                    }
        }

        for(int i = 0; i < employees.length; i++)
        {
            System.out.println(employees[i].getName() + "    " +
                    employees[i].getSalary());
        }

    }

    static int maximum(int[] numbers){
        int max = 0;
        for (int i = 0;i < numbers.length; i++){
            if (numbers[i] > max){
                max = numbers[i];
            }
        }
        return max;
    }

    static int sumpos(int[] numbers){
        int sum = 0;
        for (int i = 0;i < numbers.length; i++){
            if (numbers[i] > 0){
                sum += numbers[i];
            }
        }
        return sum;
    }

    static int countneg(int[] numbers){
        int count = 0;
        for (int i = 0;i < numbers.length; i++){
            if (numbers[i] < 0){
                count += 1;
            }
        }
        return count;
    }
}
