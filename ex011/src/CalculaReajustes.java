import java.util.Scanner;

public class CalculaReajustes {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o salário: ");
        double salario = input.nextDouble();

        if(salario <= 280){
            System.out.println("Salario atual :" + salario);
            System.out.println("Aumento de 20:");
            double valor1 = 20;
            salario += (valor1 * salario) / 100;
            System.out.println("Salario com ajuste de 20%: " + salario);
        } else if (salario > 280 && salario < 700){
            double valor2 = 15;
            salario += (valor2 * salario) / 100;
            System.out.println("Salario com ajuste de 15%: " + salario);
        } else if (salario >= 700 && salario < 1500) {
            double valor3 = 10;
            salario += (valor3 * salario) / 100;
            System.out.println("Salario com ajuste de 15%: " + salario);
        } else if (salario >= 1500) {
            double valor4 = 5;
            salario += (valor4 * salario) / 100;
            System.out.println("Salario com ajuste de 5%: " + salario);
        }
    }
}
