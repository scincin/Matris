/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrisodv3.carp;

/**
 *
 * @author selahattin
 */
public class MatCarp {

    public static int[][] multiply(int[][] dizi1, int[][] dizi2) {
        int mA = dizi1.length;
        int nA = dizi1[0].length;
        int mB = dizi2.length;
        int nB = dizi2[0].length;
        if (nA != mB) {
            throw new RuntimeException("Illegal matrix dimensions.");
        }
        int[][] C = new int[mA][nB];
        for (int i = 0; i < mA; i++) {
            for (int j = 0; j < nB; j++) {
                for (int k = 0; k < nA; k++) {
                    C[i][j] += dizi1[i][k] * dizi2[k][j];
                }
            }
        }
        for (int i = 0; i < mA; i++) {
            for (int j = 0; j < mB; j++) {
                System.out.printf("DiziCarpma[%d][%d]: %d", dizi1.length, dizi2.length, C[i][j]);
                System.out.printf("\t");
            }
            System.out.print("\n");

        }
        return C;
    }
}
