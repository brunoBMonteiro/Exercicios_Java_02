import java.util.Scanner;

public class personSex {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Digite uma letra F, M");
        char letter = input.next().charAt(0);

        if(letter == 'F' || letter == 'f'){
            System.out.println("Sexo Feminino");
        } else if(letter == 'M' || letter == 'm'){
            System.out.println("Sexo masculino");
        }



    }
}
