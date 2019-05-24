/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hazerta.proyectozoo;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class ClasePrincipal {
    public static void main(String[] args) {
        Caballo c=pedirDatosCaballo();
        Urraca u=pedirDatosUrraca();
        System.out.println("Caballo: "+c);
        System.out.println("Urraca: "+u);
    }
    public static Caballo pedirDatosCaballo()
    {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Introduzca el nombre del caballo");
        String nombre_caballo=sc.nextLine();
        Caballo caballo=new Caballo(nombre_caballo);
        return caballo;
    }
    private static Urraca pedirDatosUrraca()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduzca el nombre de la urraca");
        String nombre_caballo=sc.nextLine();
        Urraca urraca=new Urraca(nombre_caballo);
        return urraca;
    }
    
  
}
