import java.util.Scanner;

public class NumeroParImpar {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int number = input.nextInt();

        if(number % 2 == 0){
            System.out.println("O numero é par");
        }else {
            System.out.println("O numero é impar");
        }
    }
}
