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
public class arreglo {
    Scanner scanner=new Scanner(System.in);
    
    public void ordena(int n){
        int arreglo[]=new int[n];
        int auxiliar; 
        for(int i=0;i<n;i++){
            System.out.println("Ingresa el valor de la posición "+i+" del vector");
            arreglo[i]=scanner.nextInt();
        }//for
        System.out.println("El vector que introduciste fue: ");
        for(int j=0; j<n;j++){
            System.out.print(" "+arreglo[j]);
        }//for
        System.out.println("\n El arreglo ordenado sería de la siguientemanera: ");
        for( int k=1;k<arreglo.length;k++){
            for(int l=0;l<arreglo.length-k;l++){
                if(arreglo[l]>arreglo[l+1]){
                    auxiliar=arreglo[l];
                    arreglo[l]=arreglo[l+1];
                    arreglo[l+1]=auxiliar;
                }//if
            }//for
        }//for
          for(int j=0; j<n;j++){
            System.out.print(" "+arreglo[j]);
        }//for
    }
}
