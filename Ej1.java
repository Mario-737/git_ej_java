import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {
        int[] numeros = new int[5];

        Scanner teclado = new Scanner(System.in);
        
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Introduce un número:");
            int numero = teclado.nextInt();
            numeros[i]=numero;
        }


        for (int i : numeros) {
            System.out.print(i+", ");
        }
        System.out.println();
        
        teclado.close();
    }
}
