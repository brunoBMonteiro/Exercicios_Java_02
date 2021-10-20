import java.util.Scanner;

public class Fruteira {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        double desconto = 0;

        System.out.println("Digite a quantidade de kilo da maçã");
        double qtdKiloMaca = input.nextDouble();

        System.out.println("Digite a quantidade de kilo da morango");
        double qtdKiloMorango = input.nextDouble();

        double precoMorango = 0;
        if (qtdKiloMorango < 5){
            precoMorango = 2.5;
        }else {
            precoMorango = 2.2;
        }

        double precoMaca = 0;
        if(qtdKiloMaca < 5){
            precoMaca = 1.8;
        }else {
            precoMaca = 1.5;
        }

        double precoTotalMorango = qtdKiloMorango * precoMorango;
        double precoTotalMaca = qtdKiloMaca * precoMaca;

        double precoParcial = precoMaca + precoMorango;
        double precoTotal = precoParcial;

        if((qtdKiloMorango + qtdKiloMaca > 8) || (precoParcial > 25)){
            precoTotal = precoParcial - ((precoParcial / 100) / 10);
        }
        System.out.printf("Preco total: %.2f", precoTotal);
    }
}
