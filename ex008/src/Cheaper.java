import java.util.Scanner;

public class Cheaper {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o valor do produto para ver o mais barato: ");
        System.out.println("Digite o valor do produto A: ");
        double produtoA = input.nextDouble();
        System.out.println("Digite o valor do produto B: ");
        double produtoB = input.nextDouble();
        System.out.println("Digite o valor do produto C: ");
        double produtoC = input.nextDouble();

        if (produtoA <= produtoB && produtoA <= produtoC){
            System.out.println("O produto A é o mais barato: ");
        } else if (produtoB <= produtoA && produtoB <= produtoC){
            System.out.println("O produto B é o mais barato: ");
        } else if (produtoB <= produtoA && produtoB <= produtoC){
            System.out.println("O produto C é o mais barato: ");
        }
    }
}
