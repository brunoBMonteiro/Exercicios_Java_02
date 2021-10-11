import java.util.Scanner;

public class FolhaPagamento {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o valor da sua hora de trabalho:");
        double valorHoraTrabalhada = input.nextDouble();
        System.out.println("Digite a quantidade de horas trabalhadas mês:");
        double qtdHorasTrabalhadaMes = input.nextDouble();

        double salarioBruto = valorHoraTrabalhada * qtdHorasTrabalhadaMes;
        double descontoIR = 0;


        if(salarioBruto <= 900){
            descontoIR = 0;
        } else if (salarioBruto > 900 && salarioBruto <= 1500){
            descontoIR = 5;
        } else if (salarioBruto > 1500 && salarioBruto < 2500){
            descontoIR = 10;
        } else if (salarioBruto >= 2500){
            descontoIR = 20;
        }

        double ir = (salarioBruto / 100) * descontoIR;
        double inss = (salarioBruto / 100) * 10;
        double fgts = (salarioBruto / 100) * 11;
        double totalDescontos = ir + inss;
        double salarioLiquido = salarioBruto - totalDescontos;


        System.out.println("O valor hora trabalhada :" + valorHoraTrabalhada + " , " + "A quantidade horas trabalhadas :" + qtdHorasTrabalhadaMes + " , " + "O salario bruto :" + salarioBruto );
        System.out.println("O valor do IR é :" + descontoIR + ", " + ir );
        System.out.println("O valor do INSS (10%) :" + inss);
        System.out.println("O valor do FGTS (11%) é :" + fgts);
        System.out.println("O total de desconto é :" + totalDescontos);
        System.out.println("O valor do IR é :" + salarioLiquido);
    }
}
