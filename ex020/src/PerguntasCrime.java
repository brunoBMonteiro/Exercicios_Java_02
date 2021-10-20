import java.util.Scanner;

public class PerguntasCrime {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Responda essas 5 perguntas, com 's' para sim, e 'n' para não!");

        System.out.println("Telefonou para a vitima ?");
        String resp1 = input.next();

        System.out.println("Esteve no local do crime ?");
        String resp2 = input.next();

        System.out.println("Mora perto da vitima ?");
        String resp3 = input.next();

        System.out.println("Devia para a vitima ?");
        String resp4 = input.next();

        System.out.println("Já trabalhou com a vitima ?");
        String resp5 = input.next();

        int count = 0;

        if(resp1.equalsIgnoreCase("s")){
            count++;
        }
        if(resp2.equalsIgnoreCase("s")){
            count++;
        }
        if(resp3.equalsIgnoreCase("s")){
            count++;
        }
        if(resp4.equalsIgnoreCase("s")){
            count++;
        }
        if(resp5.equalsIgnoreCase("s")){
            count++;
        }

        if (count <= 1){
            System.out.println("Inocente");
        } else if(count == 2){
            System.out.println("Suspeito");
        } else if (count == 3 || count == 4) {
            System.out.println("Cumplice");
        } else if (count == 5 ) {
            System.out.println("Assasino");
        }
    }
}
