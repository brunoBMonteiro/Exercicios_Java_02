import java.util.Scanner;

public class OrdemDecrescente {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int num1 = input.nextInt();
        System.out.println("Digite um numero: ");
        int num2 = input.nextInt();
        System.out.println("Digite um numero: ");
        int num3 = input.nextInt();

        if(num1 < num2 && num1 < num3 && num2 < num3){
            // num1 + num2 + num3 decrescente
            System.out.println(num3 + "-" + num2 + "-" + num1);
        } else if(num1 < num2 && num1 < num3 && num3 < num2){
            // num1 + num3 + num2 decrescente
            System.out.println(num2 + "-" + num3 + "-" + num1);
        } else if(num2 < num1 && num2 < num3 && num1 < num2){
            // num1 + num3 + num2 decrescente
            System.out.println(num3 + "-" + num1 + "-" + num2);
        } else if(num2 < num1 && num2 < num3 && num1 < num2){
            // num3 + num1 + num2 decrescente
            System.out.println(num3 + "-" + num1 + "-" + num2);
        } else if(num3 < num1 && num3 < num2 && num2 < num1){
            // num3 + num2 + num1 decrescente
            System.out.println(num1 + "-" + num2 + "-" + num3);
        }
    }
}
