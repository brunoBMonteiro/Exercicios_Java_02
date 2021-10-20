import java.util.Scanner;

public class PostoCombustiveis {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        double valorGasolina = 2.50;
        double valorAlcool = 1.50;
        double percentualDesconto = 0;
        double total = 0;
        double totalDesconto = 0;

        System.out.println("Você quer abastecer com alcool ou gasolina ?");
        String abastecer = input.next();

        if(abastecer.equalsIgnoreCase("gasolina")){
            System.out.println("Digite a quantidade de litros de gasolina!");
            double litrosGasolina = input.nextDouble();

            if(litrosGasolina <= 20){
                percentualDesconto = 4;
            }else{
                percentualDesconto =  6;
            }

            total = litrosGasolina * valorGasolina;


        } else if (abastecer.equalsIgnoreCase("alcool")){
            System.out.println("Digite a quantidade de litros alcool");
            double litrosAlcool = input.nextDouble();

            if(litrosAlcool <= 20){
                percentualDesconto = 3;
            } else if (litrosAlcool > 20){
                percentualDesconto = 5;
            }

            total = litrosAlcool * valorAlcool;

        }

        totalDesconto = (total / 100) * percentualDesconto;
        double precoAPagar = total - totalDesconto;

        System.out.println("Valor a ser pago: " + precoAPagar);
    }
}
