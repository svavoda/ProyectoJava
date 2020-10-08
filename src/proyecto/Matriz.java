/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

import java.util.Scanner;

/**
 *
 * @author EFREN.PEREZ
 */
public class Matriz {
    Scanner scanner=new Scanner(System.in);
    public void llenaMatriz(int f, int c){
        int matriz[][]=new int[f][c];
        for(int i=0;i<f;i++){
            for(int j=0;j<c;j++){
                System.out.println("Introduce el valor de la matriz en la fila "+(i+1)+" y en la columna "+(j+1));
                matriz[i][j]=scanner.nextInt();
            }//for
        }//for
        System.out.println("La matriz que introduciste fue: ");
        for(int k=0;k<f;k++){
            for(int l=0;l<c;l++){
                System.out.print(+matriz[k][l]+" ");
            }//for
            System.out.println(" ");
        }//for
    }//llenaMatriz
}
