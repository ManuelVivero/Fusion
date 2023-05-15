/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fusionordenadacreciente;

import java.util.Scanner;

/**
 *
 * @author AulaVirtual
 */
public class FusionOrdenadaCreciente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arraySize1;
        int a = 2;
        int b = 4;
        int[] array1;

        int arraySize2;
        int[] array2;

        int[] array3;

        System.out.print("Introduzca tamaño vector 1: ");
        arraySize1 = sc.nextInt();
        array1 = new int[arraySize1];

        System.out.print("Introduzca el contenido del vector creciente 1 separados por espacios: ");
        for (int j = 0; j < array1.length; j++) {
            array1[j] = sc.nextInt();
        }

        System.out.print("Introduzca tamaño vector 2: ");
        arraySize2 = sc.nextInt();
        array2 = new int[arraySize2];

        System.out.print("Introduzca el contenido del vector creciente 2 separados por espacios: ");
        for (int j = 0; j < array2.length; j++) {
            array2[j] = sc.nextInt();
        }

        try {
            array3 = fusionOrdenadaCreciente(array1, array2);

            System.out.println("El vector resultante de la fusion ordenada es: ");
            for (int j = 0; j < array3.length; j++) {
                System.out.print(array3[j] + " ");
            }
            System.out.println();
        } catch (NullPointerException ex) {
            System.out.println("Alguno de los arrays era nulo");
        }

    }

    public static boolean estaOrdenadoCreciente(int[] vector) throws NullPointerException {
        boolean ordenadoAscendente = true;

        int i = 0;
        while (i < vector.length - 1 && ordenadoAscendente == true) {
            if (vector[i] > vector[i + 1]) {
                ordenadoAscendente = false;
            }
            i++;
        }
        return ordenadoAscendente;
    }

    public static int[] fusionOrdenadaCreciente(int[] array1, int[] array2) throws NullPointerException {
        int[] nuevoArray;

        int sizeNuevoArray;

        if (!estaOrdenadoCreciente(array1) || !estaOrdenadoCreciente(array2)) {
            throw new IllegalArgumentException();
        } else {

            sizeNuevoArray = array1.length + array2.length;

            nuevoArray = new int[sizeNuevoArray];

            int posArray1 = 0;
            int posArray2 = 0;
            int posNuevoArray = 0;

            while (posArray1 < array1.length && posArray2 < array2.length) {
                if (array1[posArray1] <= array2[posArray2]) {
                    nuevoArray[posNuevoArray] = array1[posArray1];
                    posArray1++;
                } else {
                    nuevoArray[posNuevoArray] = array2[posArray2];
                    posArray2++;
                }
                posNuevoArray++;
            }

            while (posArray1 < array1.length) {
                nuevoArray[posNuevoArray] = array1[posArray1];
                posArray1++;
                posNuevoArray++;
            }

            while (posArray2 < array2.length) {
                nuevoArray[posNuevoArray] = array2[posArray2];
                posArray2++;
                posNuevoArray++;
            }
        }
        return nuevoArray;
    }

}
