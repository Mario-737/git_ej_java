import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {
        double[] numeros = new double[5];
        double suma = 0;

        Scanner teclado = new Scanner(System.in);
        
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Introduce un número:");
            int numero = teclado.nextInt();
            numeros[i]=numero;
            suma += numero;
        }
        teclado.close();
        
        for (double i : numeros) {
            System.out.print(i+", ");
        }
        System.out.println();
        System.out.println("La suma es: "+suma);
        System.out.println("La media es: "+suma/5);


    }
}
