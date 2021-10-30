import java.util.Arrays;

import javax.swing.JOptionPane;

public class e8 {
    public static void main(String[] args) {
        int par = 0;
        int impar = 0;
        int filas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tamaño de la matriz ejm. (2 ---> 2x2)"));
        int columnas = Integer
                .parseInt(JOptionPane.showInputDialog("Ingrese el tamaño de la matriz ejm. (2 ---> 2x2)"));
        int arr[][] = new int[filas][columnas];
        // añadiendo datos
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                arr[i][j] = Integer
                        .parseInt(JOptionPane.showInputDialog("ingrese el valor  [" + i + "]" + "[" + j + "]"));
                if (arr[i][j] % 2 == 0) {
                    par += arr[i][j];
                } else {
                    impar += arr[i][j];
                }
            }
        }

        System.out.println(Arrays.deepToString(arr));
        System.out.println("la suma de los números pares es: " + par);
        System.out.println("la suma de los números impares es: " + impar);
    }
}
