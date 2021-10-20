import java.util.Scanner;

public class Hipermercado {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Entre com o tipo da carne: ");
        System.out.println("1 - Filé duplo ");
        System.out.println("2 - Alcatra ");
        System.out.println("3 - Picanha ");

        int tipo = input.nextInt();

        System.out.println("Entre com a quantidade (Kg): ");
        double qtd = input.nextDouble();
        double precoKg = 0;


        if (tipo == 1){

            System.out.println(qtd + "Kg Filé duplo");

            if (qtd < 5 ){
                precoKg = 15.9;
            }else {
                precoKg = 18.0;
            }
        } else if (tipo == 2){

            System.out.println(qtd + "Kg Alcatra");

            if (qtd < 5 ){
                precoKg = 12.9;
            }else {
                precoKg = 17.0;
            }
        } else if (tipo == 3){

            System.out.println(qtd + "Kg Picanha");

            if (qtd < 5 ){
                precoKg = 30.5;
            }else {
                precoKg = 50.5;
            }
        }

        double total = qtd * precoKg;
        System.out.println(qtd + "Kg *" + precoKg + " = " + total);

        System.out.println("Compra no cartão? Digite 1 para sim: ");
        int cartao = input.nextInt();

        if(cartao == 1){
            double desconto = (total / 100) * 5;

            System.out.println("Desconto de: " + desconto);
            System.out.println("Valor a pagar: " + (total - desconto));
        } else {
            System.out.println("Valor a pagar: " + total);
        }

    }
}
