import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        int[] edades = new int[5];
        int mayor = 0;
        int menor = 9999999;

        Scanner teclado = new Scanner(System.in);
        
        for (int i = 0; i < edades.length; i++) {
            System.out.println("Introduce una edad:");
            int edad = teclado.nextInt();
            edades[i]=edad;
            if (edad>mayor) {
                mayor=edad;
            }
            if (edad<menor) {
                menor=edad;
            }
        }
        teclado.close();
        
        for (double i : edades) {
            System.out.print(i+", ");
        }
        System.out.println();
        System.out.printf("La mayor edad es %d y la menor es %d\n",mayor,menor);

    }
}
