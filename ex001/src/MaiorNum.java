import java.util.Scanner;

public class MaiorNum {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um numero :");
        int a = input.nextInt();
        System.out.println("Digite um numero :");
        int b = input.nextInt();

        if (a > b){
            System.out.println("O numero maior é o :" + a);
        } else {
            System.out.println("O numero maior é o :" + b);
        }

    }
}
