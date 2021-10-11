import java.util.Scanner;

public class Triangulo {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o lado A");
        double ladoA = input.nextDouble();

        System.out.println("Digite o lado B");
        double ladoB = input.nextDouble();

        System.out.println("Digite o lado C");
        double ladoC = input.nextDouble();

        if(((ladoA + ladoB) > ladoC) ||
                ((ladoA + ladoC) > ladoB) ||
                ((ladoB + ladoC) > ladoA)) {

            if (ladoA == ladoB && ladoA == ladoC && ladoB == ladoC) {
                System.out.println("Triangulo Equilátero!");
            } else if (ladoA != ladoB && ladoA != ladoC && ladoC != ladoB){
                System.out.println("Triangulo Escaleno");
            } else if (ladoA == ladoB || ladoA == ladoC || ladoC == ladoB){
                System.out.println("Triangulo Isóceles");
            }
        }
        else{
            System.out.println("Não é triangulo!");
        }
    }

}
