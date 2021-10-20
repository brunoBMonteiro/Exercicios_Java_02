import java.util.Scanner;

public class LerNumeros {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um numero");
        int number1 = input.nextInt();

        System.out.println("Entre com o sinal da operação, somar +, multiplicar *, subtrair -, dividir /");
        String operacao = input.next();

        System.out.println("Digite um numero novamente");
        int number2 = input.nextInt();

        double total = 0;
        boolean isValida = true;

        switch (operacao){
            case "+": total = number1 + number2; break;
            case "-": total = number1 - number2; break;
            case "*": total = number1 * number2; break;
            case "/": total = number1 / number2; break;
            default: System.out.println("Operador inválido");
            isValida = false;
        }

        if (isValida) {

            System.out.println("Resultado: " + total);

            if (total > 0){
                System.out.println("Número positivo!");
            } else {
                System.out.println("Número negativo!");
            }
        }

        if (total % 2 == 0){
            System.out.println("Resultado par");
        }else {
            System.out.println("resultado impar");
        }


    }
}
