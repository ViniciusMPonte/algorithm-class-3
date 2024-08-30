import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNum, secondNum;

        System.out.println("Primeiro Número: ");
        firstNum = scanner.nextInt(); 
        
        System.out.println("Segundo Número: ");
        secondNum = scanner.nextInt();

        System.out.println("Soma: " + (firstNum + secondNum));
        System.out.println("Subtração: " + (firstNum - secondNum));
        System.out.println("Multiplicação: " + (firstNum * secondNum));
        System.out.println("Divisão: " + (firstNum / secondNum));
        System.out.println("Resto da divisão: " + (firstNum % secondNum));
    }
}
