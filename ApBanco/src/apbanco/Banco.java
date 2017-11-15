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
public class Banco {  
    
    public static void main(String[] args) {
         
        String titular,entidad,oficina,digcontrol,numcuenta;
        double ingreso,retiro;
        int opcion = 0;
        boolean salir=false;
        
        Scanner sc = new Scanner(System.in);
        Scanner leer = new Scanner(System.in);
        
        System.out.println("NOMBRE DEL TITULAR: ");
        titular=sc.nextLine();
        
        System.out.println("ENTIDAD-OFICINA-DC-NUMCUENTA");
        System.out.println(" ");
        System.out.print("Entidad-------->");entidad=sc.nextLine();
        System.out.println(" ");
        System.out.print("Oficina-------->");oficina=sc.nextLine();
        System.out.println(" ");
        System.out.print("DC------------->");digcontrol=sc.nextLine();
        System.out.println(" ");
        System.out.print("NumCuenta------>");numcuenta=sc.nextLine();
        System.out.println(" ");
        
  if (CuentaBancaria.cCcorrecto(entidad, oficina, digcontrol, numcuenta)==true){
          
      CuentaBancaria cb1 = new CuentaBancaria(titular, entidad, oficina, digcontrol, numcuenta);
      
      while(salir==false){
        
      opcion=Menu.menu();
      
       switch (opcion) {
            case 1: 
                System.out.println (cb1.getEntidad() + "-" + cb1.getOficina() + "-" + cb1.getDigControl() + "-" + cb1.getNumCuenta());
                break;
            case 2:
                System.out.println (cb1.getTitular()); 
                break;
            case 3: 
                System.out.println (cb1.getEntidad());
                break;
            case 4: 
                System.out.println (cb1.getOficina()); 
                break;
            case 5:
                System.out.println (cb1.getNumCuenta()); 
                break;
            case 6:
                System.out.println (cb1.getDigControl());
                break;
            case 7:
                System.out.println("Dime la cantidad que quieres ingresar");
                ingreso=leer.nextDouble();
                if (cb1.ingreso(ingreso)==true){
                    System.out.println("El ingreso se ha hecho correctamente");
                }else{
                    System.out.println("Algo ha fallado");
                } 
                break;
            case 8:
                System.out.println("Dime la cantidad que quieres retirar");
                retiro=leer.nextDouble();
                if (cb1.retirarDinero(retiro)==true){
                    System.out.println("El retiro se ha hecho correctamente");
                }else{
                    System.out.println("No tienes tanto dinero");
                } 
                break;
            case 9: 
                System.out.println (cb1.getSaldo()); 
                break;
            case 10: 
                salir=true;
                break;
            default: 
                System.out.println ("Opción no válida"); 
                break;
        
       }
      }
        }
  else{
      System.out.println("El CCC no es correcto");
  }
  
     
        
    }
    
}
