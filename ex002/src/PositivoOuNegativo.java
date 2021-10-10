import java.util.Scanner;

public class PositivoOuNegativo {
        public static void main(String[] args){
            Scanner input = new Scanner(System.in);

            System.out.println("Digite um numero :");
            int a = input.nextInt();

            if (a < 0){
                System.out.println("O numero é negativo :" + a);
            } else if(a > 0) {
                System.out.println("O numero é positivo:" + a);
            } else if(a == 0) {
                System.out.println("O numero é 0: ");
            }
    }
}
