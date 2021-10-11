import java.util.Scanner;

public class FolhaPagamento {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o valor da sua hora de trabalho:");
        double valorHoraTrabalhada = input.nextDouble();
        System.out.println("Digite a quantidade de horas trabalhadas mês:");
        double qtdHorasTrabalhadaMes = input.nextDouble();

        double salarioLiquido = valorHoraTrabalhada * qtdHorasTrabalhadaMes;
        double descontoIR = 5;
        double descontoINSS = 10;
        double descontoFGTS = 11;
        double descontos = descontoIR + descontoINSS + descontoFGTS;
        double salarioBruto = salarioLiquido - descontos;

        if(salarioBruto < 900){
            salarioBruto = salarioBruto;
        } else if (salarioBruto < 1500){
            double valor1 = 5;
            salarioBruto -= (valor1 * salarioBruto) / 100;
            System.out.println(salarioBruto);
        } else if (salarioBruto < 2500){
            double valor2 = 10;
            salarioBruto -= (valor2 * salarioBruto) / 100;
            System.out.println(salarioBruto);
        } else if (salarioBruto >= 2500){
            double valor2 = 20;
            salarioBruto -= (valor2 * salarioBruto) / 100;
            System.out.println(salarioBruto);
        }

        System.out.println("O salario Liquido é :" + salarioLiquido);
        System.out.println("O total de Descontos é :" + descontos);
        System.out.println("O salario Bruto é :" + salarioBruto);
    }
}
