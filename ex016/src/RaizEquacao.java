import java.util.Scanner;

public class RaizEquacao {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o valor de A :");
        int a = input.nextInt();

        if(a == 0){
            System.out.println("Não é equeção de segundo grau");
        } else {

            System.out.println("Digite o valor de B :");
            int b = input.nextInt();

            System.out.println("Digite o valor de C :");
            int c = input.nextInt();

            double delta = Math.pow(b, 2) - (4 * a * c);
            if (delta < 0){
                System.out.println("Delta negativo!");
            } else {
                System.out.println("Delta: " + delta);

                double x1 = ((-b) + Math.sqrt(delta)) / (2*a);
                double x2 = ((-b) - Math.sqrt(delta)) / (2*a);

                System.out.println("x1 = " + x1);
                System.out.println("x2 = " + x2);
            }

        }

    }
}
