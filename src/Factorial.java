import java.util.Scanner;

public class Factorial {

    public static void main(String[] args){

        System.out.println("Introdueix un número per a calcular el seu factorial:");
        Scanner sc = new Scanner(System.in);
        int option = sc.nextInt();
        int resultado = 1;


        for (int contador = option; contador > 0; contador --){

            resultado = resultado * contador;
        }

        System.out.println("El factorial de " + option + " es: " + resultado);
    }

}
