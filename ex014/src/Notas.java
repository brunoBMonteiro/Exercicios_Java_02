import java.util.Scanner;

public class Notas {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Digite a nota A:");
        double notaA = input.nextDouble();

        System.out.println("Digite a nota B:");
        double notaB = input.nextDouble();

        double media = (notaA + notaB) / 2;
        String aproveitamento = "";

        if(media >= 9 && media <= 10){
            aproveitamento = "A";
        } else if(media >= 7.5  && media < 9){
            aproveitamento = "B";
        } else if(media >= 6  && media < 7.5){
            aproveitamento = "C";
        } else if(media >= 4  && media < 6){
            aproveitamento = "D";
        } else if(media >= 0  && media < 4){
            aproveitamento = "E";
        }

        System.out.println("A nota A foi:" + notaA + ", " + "A nota B foi:" + notaB + ", " + "A média foi:" + media + ", " + "Conceito: " + aproveitamento);
    }
}
