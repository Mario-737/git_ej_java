import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {
        double[] numeros = new double[5];
        double suma = 0;
        double mayor = 0;
        double menor = 9999999;
        int positivos = 0;
        int negativos = 0;

        Scanner teclado = new Scanner(System.in);
        
        int uno=0, dos=0, tres=0, cuatro=0, cinco=0;

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Introduce un número:");
            int numero = teclado.nextInt();
            numeros[i]=numero;
            suma += numero;
            if (numero>mayor) {
                mayor=numero;
            }
            if (numero<menor) {
                menor=numero;
            }
            if (numero>0) {
                positivos++;
            }
            if (numero<0) {
                negativos++;
            }

            // Para la frecuencia de cada número, suponemos que
            // se introducirán números del 1 al 5

            switch (numero) {
                case 1:
                    uno++;
                    break;
                case 2:
                    dos++;
                    break;
                case 3:
                    tres++;
                    break;
                case 4:
                    cuatro++;
                    break;
                case 5:
                    cinco++;
                    break;
                default:
                    break;
            }

        }

        
        for (double i : numeros) {
            System.out.print(i+", ");
        }
        System.out.println();
        System.out.println("La suma es: "+suma);
        System.out.println("La media es: "+suma/5);
        System.out.printf("El mayor es %.1f y el menor es %.1f\n",mayor,menor);
        System.out.printf("Hay %d positivos y %d negativos\n",positivos,negativos);
        System.out.printf("La frecuencia de los números del 1 al 5 es: %d %d %d %d %d \n", uno, dos, tres, cuatro, cinco);


        System.out.println("¿Qué número quieres eliminar (posición 0-4)?");
        int pos = teclado.nextInt();
        numeros[pos]=0;
        teclado.close();

        for (double i : numeros) {
            System.out.print(i+", ");
        }

    }
}
