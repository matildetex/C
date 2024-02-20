package C.block1.Ex1_01;
import java.util.Scanner;

public class Calculator {

    public static void main (String [] args){
        double total=0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Primeiro numero");
        double number1=scanner.nextDouble();
        System.out.println("Segundo numero");
        double number2=scanner.nextDouble();
        System.out.println("Operação");
        String operator=scanner.next();

        switch (operator) {
            case "+": 
                total = number1 + number2;
                break;
            case "-": 
                total = number1 - number2;
                break;
            case "*": 
                total = number1*number2;
                break;
            case "/": 
                total = number1 / number2;
                break;
            default:
                System.err.println("Operação não existe");
                scanner.close();
                return;
        }
        System.out.println("O total é " + total);
        scanner.close();
    }
}