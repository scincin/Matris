/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrisodv3.toplam;

/**
 *
 * @author selahattin
 */
public class MatTop {

    public static int[][] add(int[][] dizi1, int[][] dizi2) {
        int m = dizi1.length;
        int n = dizi2.length;
        int[][] C = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                C[i][j] = dizi1[i][j] + dizi2[i][j];
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("DiziToplama[%d][%d]: %d", dizi1.length, dizi2.length, C[i][j]);
                System.out.printf("\t");
            }
            System.out.print("\n");
        }
        return C;

    }
}
