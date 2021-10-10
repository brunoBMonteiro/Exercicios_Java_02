import java.util.Scanner;

public class TurnoTrabalho {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Digite uma letra correspondente ao turno (m-M)manhã, (v-V)Tarde, (n-N)noite");
        String turno = input.next();

        switch (turno) {
            case "m":
            case "M": System.out.println("Bom dia!"); break;
            case "v":
            case "V": System.out.println("Boa tarde"); break;
            case "n":
            case "N": System.out.println("Boa noite"); break;
            default: System.out.println("Turno inválido!");
        }
    }
}
