import java.util.Arrays;

import javax.swing.JOptionPane;

public class e7 {
    public static void main(String[] args) {
        int len = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tamaño de la matriz ejm. (2 ---> 2x2)"));
        int arr[][] = new int[len][len];
        // añadiendo datos
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                arr[i][j] = Integer
                        .parseInt(JOptionPane.showInputDialog("ingrese el valor  [" + i + "]" + "[" + j + "]"));
            }
        }
        // suma diagonal
        int temp = len;
        for (int c = 0; c < len; c++) {
            temp--;
            arr[c][temp] = 5;
        }
        System.out.println(Arrays.deepToString(arr));
    }
}
