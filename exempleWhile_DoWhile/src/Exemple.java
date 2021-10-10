import java.util.Scanner;

public class Exemple {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        //while
        int i = 1;
        int max = 10;

        System.out.println("Contando até " + max);

        while (i <= 10){
            System.out.println("Valor de i :" + i);
            i++;
        }

        System.out.println(i);

        do {
            i++;
            System.out.println("Valor de i :" + i);
        } while (i < 15);
        //System.out.println(i);
    }
}
