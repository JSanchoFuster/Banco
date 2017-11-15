/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apbanco;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Menu {
    
    public static int menu(){
    
     int opc;
        
        System.out.println(" ");
        System.out.println("**********************************************");
        System.out.println("*  1-Ver el número de cuenta completo        *");
        System.out.println("*  2-Ver el titular de la cuenta             *");
        System.out.println("*  3-Ver el código de la entidad             *");
        System.out.println("*  4-Ver el código de la oficina             *");
        System.out.println("*  5-Ver el número de cuenta                 *");
        System.out.println("*  6-Ver los digitos de control de la cuenta *");
        System.out.println("*  7-Realizar un ingreso                     *");
        System.out.println("*  8-Retirar efectivo                        *");
        System.out.println("*  9-Consultar saldo                         *");
        System.out.println("* 10-Salir de aplicación                     *");
        System.out.println("**********************************************");
        System.out.println(" ");
        
        Scanner sc = new Scanner(System.in);
        opc=sc.nextInt();
        return opc;
        
    }
    
}
