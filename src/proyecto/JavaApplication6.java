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
public class JavaApplication6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int opcion,n,m,horas;
        double pagoPorHoras,sueldo=0.0, totalEmpresa=0.0;
        Scanner scanner=new Scanner(System.in); 
        Suma suma=new Suma();
        arreglo arreglo=new arreglo();
        Matrices matriz=new Matrices();
        System.out.println("1. Realizar la suma de n numeros");
        System.out.println("2. Ordenar un vector proporcionado poe el usuario");
        System.out.println("3. Crear y llenar una matriz");    
        System.out.println("4. Calcular el sueldo de N trabajadores y mostrar cuanto gasto en nómina");
        System.out.println("Elige una opcion");
        System.out.println("");
        opcion=Integer.parseInt(scanner.nextLine());
        switch(opcion){
            case 1: 
                suma.suma(); 
                break; 
            case 2: 
                System.out.println("Cuantos numeros tendra tu vector");
                n=Integer.parseInt(scanner.nextLine());
                arreglo.ordena(n);
                break; 
            case 3: 
                System.out.println("Introduce el total de filas que tendra tu matriz ");
                n=Integer.parseInt(scanner.nextLine());
                System.out.println("Introduce el total de columnas que tendra tu matriz ");
                m=Integer.parseInt(scanner.nextLine());
                matriz.llenaMatriz(n, m);
                break; 
            case 4: 
                System.out.println("Cuantos trabajadores tiene tu empresa");
                n=Integer.parseInt(scanner.nextLine()); 
                System.out.println("Cuanto pagas la hora");
                pagoPorHoras=Float.parseFloat(scanner.nextLine());
                for(int i=1;i<=n;i++){
                    System.out.println("Cuantas horas a trabajado el empleado no. "+i);
                    horas=Integer.parseInt(scanner.nextLine()); 
                    sueldo=pagoPorHoras*horas; 
                    System.out.println("El sueldo del trabajador no."+i+" es de $"+sueldo);
                    totalEmpresa=totalEmpresa+sueldo;
                }//for
                  System.out.println("Lo que gasto la empresa en la nomina de "+n+" empleados fue $"+totalEmpresa);      
                break; 
            default: 
                System.out.println("No elejiste una opcion correcta");
                
        }
    }

 }
