import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        int[] edades = new int[5];

        Scanner teclado = new Scanner(System.in);
        
        for (int i = 0; i < edades.length; i++) {
            System.out.println("Introduce una edad:");
            int edad = teclado.nextInt();
            edades[i]=edad;
        }
        teclado.close();
        
        for (double i : edades) {
            System.out.print(i+", ");
        }
        System.out.println();

    }
}
