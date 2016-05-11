/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrisodv3;

import java.util.Scanner;
import matrisodv3.Bol.MatBol;
import matrisodv3.carp.MatCarp;
import matrisodv3.cikar.MatCikar;
import matrisodv3.toplam.MatTop;

/**
 *
 * @author selahattin
 */
public class Matrisodv3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a, b, c, d;
        
        Scanner veriAl = new Scanner(System.in); //Dışarıdan veri al.
        System.out.printf("1. matris kaça kaçlık  olsun  ");
        a = veriAl.nextInt();
        b = veriAl.nextInt();
        System.out.printf("2. matris kaça kaçlık  olsun ");
        c = veriAl.nextInt();
        d = veriAl.nextInt();
        
        int[][] dizi1 = new int[a][b];
        int[][] dizi2 = new int[c][d];//Dizi oluştur.

        // Aşağıdaki döngü diziye değer girmek için.
        for (int i = 0; i < dizi1.length; i++) {
            for (int j = 0; j < dizi1.length; j++) {
                System.out.printf("Dizi[%d][%d]: ", i, j);
                dizi1[i][j] = veriAl.nextInt();
            }
        }
        for (int i = 0; i < dizi2.length; i++) {
            for (int j = 0; j < dizi2.length; j++) {
                System.out.printf("Dizi[%d][%d]: ", i, j);
                dizi2[i][j] = veriAl.nextInt();
            }
        }

        // Dizi elemanlarını ekrana yaz.
        for (int i = 0; i < dizi1.length; i++) {
            for (int j = 0; j < dizi1.length; j++) {
                System.out.printf("Dizi1[%d][%d]: %d", dizi1.length, dizi2.length, dizi1[i][j]);
                System.out.printf("\t");
            }
            System.out.print("\n");
        }
        
        for (int i = 0; i < dizi2.length; i++) {
            for (int j = 0; j < dizi2.length; j++) {
                System.out.printf("Dizi2[%d][%d]: %d", dizi1.length, dizi2.length, dizi2[i][j]);
                System.out.printf("\t");
            }
            System.out.print("\n");
        }
        MatTop.add(dizi1, dizi2);
        MatCikar.add(dizi1, dizi2);
        MatCarp.multiply(dizi1, dizi2);
        MatBol.Bol();
        
    }    
}
