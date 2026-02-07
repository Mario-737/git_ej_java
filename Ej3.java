import java.util.Random;

public class Ej3 {
    public static void main(String[] args) {
        Random rdm = new Random();
        int[] numeros = new int[10];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = rdm.nextInt(1, 101);
            System.out.print(numeros[i] + ", ");
        }
    }
}
