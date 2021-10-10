import java.util.Scanner;

public class VogalOuConsoante {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Digite a letra para saber se é vogal ou consoante: ");
        String letra = input.next();

        // if else
        if (letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("e") ||
                letra.equalsIgnoreCase("i") || letra.equalsIgnoreCase("o") ||
                        letra.equalsIgnoreCase("u")){
                    System.out.println("Vogal");
        } else {
                    System.out.println("Consoante");
        }

        // switch case
        /*  switch(letra){
              case "a":
              case "e":
              case "i":
              case "o":
              case "u": System.out.println("vogal"); break;
              default: System.out.println("Consoante");

              }
        *
        *
        * */

    }
}
