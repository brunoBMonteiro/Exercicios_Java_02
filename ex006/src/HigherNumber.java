import java.util.Scanner;

public class HigherNumber {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um numero");
        int num1 = input.nextInt();
        System.out.println("Digite um numero");
        int num2 = input.nextInt();
        System.out.println("Digite um numero");
        int num3 = input.nextInt();

        if(num1 >= num2 && num1 >= num3){
            System.out.println("O maior numero é: " + num1);
        } else if(num2 >= num1 && num2 >= num3){
            System.out.println("O maior numero é: " + num2);
        } else if(num3 >= num1 && num3 >= num2){
            System.out.println("O maior numero é: " + num3);
        }
    }
}
