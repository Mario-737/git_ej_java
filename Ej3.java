import java.util.Random;

public class Ej3 {
    public static void main(String[] args) {
        Random rdm = new Random();
        int[] numeros = new int[10];
        int[] pares = new int[10];
        int[] impares = new int[10];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = rdm.nextInt(1, 101);
            
        }

        // Ordenar el array:
        for (int i = 0; i < numeros.length-1; i++) {
            for (int j = i+1; j < numeros.length ; j++) {
                if (numeros[j]>numeros[i]){
                    int aux = numeros[j];
                    numeros[j] = numeros[i];
                    numeros[i] = aux;
                }
            }
        }       

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i]%2==0) {
                System.out.print(numeros[i] + ", ");
                pares[i]=numeros[i];
            } else {
                impares[i]=numeros[i];
            }
        }
        

    }
}
