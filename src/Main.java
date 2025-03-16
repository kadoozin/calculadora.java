import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("DIGITE O PRIMEIRO NÚMERO");
        double num1 = scanner.nextDouble();

        System.out.println("ESCOLHA O OPERADOR DESEJADO (+, -, *, /)");
        char operador = scanner.next().charAt(0);

        System.out.println("DIGITE O SEGUNDO NÚMERO");
        double num2 = scanner.nextDouble();

        double resultado;

        switch (operador) {
            case '+':
                resultado = num1 + num2;
                System.out.println("RESULTADO: " + resultado);
                break;
            case '-':
                resultado = num1 - num2;
                System.out.println("RESULTADO: " + resultado);
                break;
            case '*':
                resultado = num1 * num2;
                System.out.println("RESULTADO: " + resultado);
                break;
            case '/':
                if (num2 != 0) {
                    resultado = num1 / num2;
                    System.out.println("RESULTADO: " + resultado);
                } else {
                    System.out.print("ERROR: DIVISÃO POR ZERO É INVÁLIDA");
                }
                break;
            default:
                System.out.println("ERROR: OPERADOR INVÁLIDA!");
        }
        scanner.close();
    }
}