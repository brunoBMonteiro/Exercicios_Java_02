import java.util.Scanner;

public class BreakAndContinue {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Entre com um número");
        int num = input.nextInt();

        System.out.println("Entre com um número limite");
        int max = input.nextInt();

        for(int i = num; i <= max; i++){
            if(i % 7 ==0) {
                System.out.println("O valor de i é: " + i);
                break;
            }
        }


    }
}
