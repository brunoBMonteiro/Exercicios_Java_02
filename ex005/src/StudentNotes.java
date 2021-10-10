import java.util.Scanner;

public class StudentNotes {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Digite a nota A do aluno");
        double notaA = input.nextDouble();
        System.out.println("Digite a nota A do aluno");
        double notaB = input.nextDouble();
        double media = (notaA + notaB) / 2;

        if(media >= 7 && media <= 9.9){
            System.out.println("Aprovado");
        } else if(media < 7){
            System.out.println("Reprovado");
        } else if(media == 10){
            System.out.println("Aprovado com distinção");
        }
    }
}
