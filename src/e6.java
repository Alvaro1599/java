import java.util.Arrays;

import javax.swing.JOptionPane;

public class e6 {
    public static void main(String[] args) {
        int len = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tamaño de la matriz ejm. (2 ---> 2x2)"));
        int arr[][] = new int[len][len];
        // añadiendo datos
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                arr[i][j] = Integer
                        .parseInt(JOptionPane.showInputDialog("ingrese el valor [" + i + "]" + "[" + j + "]"));
            }
        }
        // suma diagonal
        int sumPrin = 0;
        for (int b = 0; b < len; b++) {
            sumPrin += arr[b][b];
        }
        int sumSec = 0;
        int temp = len;
        System.out.println(Arrays.deepToString(arr));
        for (int c = 0; c < len; c++) {
            temp--;
            sumSec += arr[c][temp];
        }
        System.out.println("la suma de la diagonal principal es: " + sumPrin);
        System.out.println("la suma de la diagonal secundaria es: " + sumSec);
    }
}
