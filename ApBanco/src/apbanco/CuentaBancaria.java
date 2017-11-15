/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apbanco;

/**
 *
 * @author alumno
 */
public class CuentaBancaria {
    
    private String titular;
    private String entidad;
    private String oficina;
    private String digControl;
    private String numCuenta;
    private double saldo;

    
    public CuentaBancaria(String titular) {
        
      this.titular = titular;
      this.saldo = 0;
        
    }
    
    public CuentaBancaria(String titular, String entidad, String oficina, String digControl, String numCuenta) {
        
      this.titular = titular;
        this.entidad = entidad;
        this.oficina = oficina;
        this.digControl = digControl;
        this.numCuenta = numCuenta;          
        
    }
    
    public CuentaBancaria(String titular, String entidad, String oficina, String digControl, String numCuenta, double saldo) {
        this.titular = titular;
        this.entidad = entidad;
        this.oficina = oficina;
        this.digControl = digControl;
        this.numCuenta = numCuenta;
        this.saldo = saldo;
    }
    
    public boolean ingreso(double saldo){
    
        this.saldo+=saldo;
        
        return true;
    
    }
    
    public boolean retirarDinero(double saldo){
    
        if(saldo>this.getSaldo()){
        return false;
        }
        else{
            this.saldo-=saldo;
        return true;
        }
        
    
    }
    
    public static boolean cCcorrecto(String entidad, String oficina , String dc , String numCuenta){
        
      int total=0, primerNum, seconNum; 
      String DCCompleto="";
      
      total+=(Integer.parseInt(entidad.substring(0,1).trim()))*4;
      total+=(Integer.parseInt(entidad.substring(1,2).trim()))*8;
      total+=(Integer.parseInt(entidad.substring(2,3).trim()))*5;
      total+=(Integer.parseInt(entidad.substring(3,4).trim()))*10;
      
      
      total+=(Integer.parseInt(oficina.substring(0,1).trim()))*9;
      total+=(Integer.parseInt(oficina.substring(1,2).trim()))*7;
      total+=(Integer.parseInt(oficina.substring(2,3).trim()))*3;
      total+=(Integer.parseInt(oficina.substring(3,4).trim()))*6;
      
      total=total%11;
      total=11-total;
      
      if (total==10){
          primerNum=1;
      }
      else if (total==11){
          primerNum=0;
      }
      else{
          primerNum=total;
      }
      
      total=0;
      
      total+=(Integer.parseInt(numCuenta.substring(0,1).trim()))*1;
      total+=(Integer.parseInt(numCuenta.substring(1,2).trim()))*2;
      total+=(Integer.parseInt(numCuenta.substring(2,3).trim()))*4;
      total+=(Integer.parseInt(numCuenta.substring(3,4).trim()))*8;
      total+=(Integer.parseInt(numCuenta.substring(4,5).trim()))*5;
      total+=(Integer.parseInt(numCuenta.substring(5,6).trim()))*10;
      total+=(Integer.parseInt(numCuenta.substring(6,7).trim()))*9;
      total+=(Integer.parseInt(numCuenta.substring(7,8).trim()))*7;
      total+=(Integer.parseInt(numCuenta.substring(8,9).trim()))*3;
      total+=(Integer.parseInt(numCuenta.substring(9,10).trim()))*6;
      
      total=total%11;
      total=11-total;
      
      if (total==10){
          seconNum=1;
      }
      else if (total==11){
          seconNum=0;
      }
      else{
          seconNum=total;
      }
      
      DCCompleto=Integer.toString(primerNum) + Integer.toString(seconNum);
      
      if (dc.equalsIgnoreCase(DCCompleto)){
          return true;
      }
      else{
          return false;
      }
   
        
        
    }
    
   private boolean comprobarCCC(){
    
      int total=0, primerNum, seconNum; 
      String DCCompleto="";
      
      total+=(Integer.parseInt(getEntidad().substring(0,1).trim()))*4;
      total+=(Integer.parseInt(getEntidad().substring(1,2).trim()))*8;
      total+=(Integer.parseInt(getEntidad().substring(2,3).trim()))*5;
      total+=(Integer.parseInt(getEntidad().substring(3,4).trim()))*10;
      
      
      total+=(Integer.parseInt(getOficina().substring(0,1).trim()))*9;
      total+=(Integer.parseInt(getOficina().substring(1,2).trim()))*7;
      total+=(Integer.parseInt(getOficina().substring(2,3).trim()))*3;
      total+=(Integer.parseInt(getOficina().substring(3,4).trim()))*6;
      
      total=total%11;
      total=11-total;
      
      if (total==10){
          primerNum=1;
      }
      else if (total==11){
          primerNum=0;
      }
      else{
          primerNum=total;
      }
      
      total=0;
      
      total+=(Integer.parseInt(getNumCuenta().substring(0,1).trim()))*1;
      total+=(Integer.parseInt(getNumCuenta().substring(1,2).trim()))*2;
      total+=(Integer.parseInt(getNumCuenta().substring(2,3).trim()))*4;
      total+=(Integer.parseInt(getNumCuenta().substring(3,4).trim()))*8;
      total+=(Integer.parseInt(getNumCuenta().substring(4,5).trim()))*5;
      total+=(Integer.parseInt(getNumCuenta().substring(5,6).trim()))*10;
      total+=(Integer.parseInt(getNumCuenta().substring(6,7).trim()))*9;
      total+=(Integer.parseInt(getNumCuenta().substring(7,8).trim()))*7;
      total+=(Integer.parseInt(getNumCuenta().substring(8,9).trim()))*3;
      total+=(Integer.parseInt(getNumCuenta().substring(9,10).trim()))*6;
      
      total=total%11;
      total=11-total;
      
      if (total==10){
          seconNum=1;
      }
      else if (total==11){
          seconNum=0;
      }
      else{
          seconNum=total;
      }
      
      DCCompleto=Integer.toString(primerNum) + Integer.toString(seconNum);
      
      if (getDigControl().equalsIgnoreCase(DCCompleto)){
          return true;
      }
      else{
          return false;
      }
   
   }

    /**
     * @return the titular
     */
    public String getTitular() {
        return titular;
    }

    /**
     * @return the entidad
     */
    public String getEntidad() {
        return entidad;
    }

    /**
     * @return the oficina
     */
    public String getOficina() {
        return oficina;
    }

    /**
     * @return the digControl
     */
    public String getDigControl() {
        return digControl;
    }

    /**
     * @return the numCuenta
     */
    public String getNumCuenta() {
        return numCuenta;
    }

    /**
     * @return the saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * @param titular the titular to set
     */
    public void setTitular(String titular) {
        this.titular = titular;
    }

    /**
     * @param entidad the entidad to set
     */
    public void setEntidad(String entidad) {
        this.entidad = entidad;
    }

    /**
     * @param oficina the oficina to set
     */
    public void setOficina(String oficina) {
        this.oficina = oficina;
    }

    /**
     * @param digControl the digControl to set
     */
    public void setDigControl(String digControl) {
        this.digControl = digControl;
    }

    /**
     * @param numCuenta the numCuenta to set
     */
    public void setNumCuenta(String numCuenta) {
        this.numCuenta = numCuenta;
    }

    /**
     * @param saldo the saldo to set
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

  
   
   
   
}
