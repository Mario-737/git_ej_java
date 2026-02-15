import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        int[] edades = new int[5];
        int mayor = 0;
        int menor = 9999999;
        int mayorDeEdad = 0;
        int menorDeEdad = 0;
        int joven = 0;
        int adulto = 0;
        int anciano = 0;

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

            if (edad>18) {
                mayorDeEdad++;
            }
            if (edad<18) {
                menorDeEdad++;
            }

            if (edad>=19 && edad<30) {
                joven++;
            } else if (edad>=30 && edad<50) {
                adulto++;
            } else if (edad>=50) {
                anciano++;
            }

        }
        teclado.close();
        
        for (int i : edades) {
            System.out.print(i+", ");
        }
        System.out.println();
        System.out.printf("La mayor edad es %d y la menor es %d\n",mayor,menor);
        System.out.printf("Hay %d mayores de edad y %d menores de edad\n",mayorDeEdad,menorDeEdad);
        System.out.printf("0-17: %d\n", menorDeEdad);
        System.out.printf("18-30: %d\n", joven);
        System.out.printf("31-50: %d\n", adulto);
        System.out.printf("+51: %d\n", anciano);
    }
}
