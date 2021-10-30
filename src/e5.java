import java.util.Arrays;

import javax.swing.JOptionPane;

public class e5 {
    static int[] addNum(int cantNums) {
        int arr[] = new int[cantNums];
        for (int i = 0; i < cantNums; i++) {
            arr[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero" + (i + 1) + ":"));
        }
        return arr;
    }

    public static void main(String[] args) {
        int cantNums = Integer
                .parseInt(JOptionPane.showInputDialog("ingrese la cantidad de números para el primer arreglo"));
        int arr1[] = addNum(cantNums);
        cantNums = Integer
                .parseInt(JOptionPane.showInputDialog("ingrese la cantidad de números para el segundo arreglo"));
        int arr2[] = addNum(cantNums);
        int arr3[] = new int[arr1.length + arr2.length];
        int position = 0;

        for (int b : arr1) {
            arr3[position] = b;
            position++;
        }

        for (int i : arr2) {

            arr3[position] = i;
            position++;
        }

        System.out.println(Arrays.toString(arr3));

    }
}
