import java.util.Arrays;

import javax.swing.JOptionPane;

public class e2 {

    public static void main(String[] args) throws Exception {
        int cantNums = Integer.parseInt(JOptionPane.showInputDialog("ingrese la cantidad de números"));
        int arr[] = new int[cantNums];
        int sumPar = 0;
        int sumImpar = 0;
        for (int i = 0; i < cantNums; i++) {
            arr[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero" + (i + 1) + ":"));
            if (arr[i] % 2 == 0) {
                sumPar += arr[i];
            } else {
                sumImpar += arr[i];
            }
        }
        System.out.println(Arrays.toString(arr));
        int mayor = 0;
        int menor = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[mayor]) {
                mayor = i;
            }
            if (arr[i] < arr[mayor]) {
                menor = i;
            }
        }
        System.out.println("el numero mayor es: " + arr[mayor]);
        System.out.println("el numero mayor es: " + arr[menor]);
        System.out.println("la suma par es: " + sumPar);
        System.out.println("la suma impar es: " + sumImpar);

        System.out.println(Arrays.toString(arr));
    }
}
