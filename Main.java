import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double hoursWorked, hourlyValue, percentageIncrease, grossSalary, newSalary;

        System.out.print("Digite as horas trabalhadas: ");
        hoursWorked = scanner.nextDouble();

        System.out.print("Digite o valor da hora: ");
        hourlyValue = scanner.nextDouble(); 

        System.out.print("Digite o percentual de aumento: ");
        percentageIncrease = scanner.nextDouble(); 

        grossSalary = hoursWorked * hourlyValue;
        newSalary = grossSalary + ((grossSalary * percentageIncrease) / 100);

        System.out.println("O novo salário é: " + newSalary);
    }
}
