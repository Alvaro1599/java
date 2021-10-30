import java.util.Arrays;

import javax.swing.JOptionPane;

public class e1 {
    public static void main(String[] args) {
        int cantNums = Integer.parseInt(JOptionPane.showInputDialog("ingrese la cantidad de números"));
        int arr[] = new int[cantNums];
        int sum = 0;
        for (int i = 0; i < cantNums; i++) {
            arr[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero" + (i + 1) + ":"));
            sum += arr[i];
        }
        System.out.println(Arrays.toString(arr));
        int mayor = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[mayor]) {
                mayor = i;
            }
        }
        arr[mayor] = sum;
        System.out.println(Arrays.toString(arr));
    }
}
