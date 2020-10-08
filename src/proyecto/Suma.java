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
public class Suma {
   
    Scanner scanner=new Scanner(System.in);
    
    public void suma(){
        Long resultado=0l;
        int numeros;
        int numero;
        System.out.println("Cuantos numeros quieres sumar");
        numeros=Integer.parseInt(scanner.nextLine()); 
        int arreglo[]=new int[numeros];
        
        for(int i=1;i<numeros;i++){
            System.out.println("Ingresa el numero que deseas sumar");
            arreglo[i]=scanner.nextInt();
            resultado=resultado+arreglo[i];
        }
        System.out.println("El resultado de la suma es: "+resultado);
    }

   
}
