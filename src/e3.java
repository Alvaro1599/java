import java.util.Arrays;

import javax.swing.JOptionPane;

public class e3 {
    public static void main(String[] args) {
        int cantNums = Integer.parseInt(JOptionPane.showInputDialog("ingrese la cantidad de números"));
        double arr[] = new double[cantNums];
        double sum = 0;
        for (int i = 0; i < cantNums; i++) {
            arr[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero" + (i + 1) + ":"));
            sum += arr[i];
        }
        sum = (sum) / arr.length;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                arr[i] = sum;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
