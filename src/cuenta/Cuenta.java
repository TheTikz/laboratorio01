/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cuenta;

/**
 *
 * @author victo
 */
public class Cuenta {

    /**
     * @param args the command line arguments
     */
    private String Ndelcliente;
    private String Ndecuenta;
    private double interes;
    private double saldo;
    
    public Cuenta(){
    }

    public Cuenta(String Ndelcliente, String Ndecuenta, double interes, double saldo) {
        this.Ndelcliente = Ndelcliente;
        this.Ndecuenta = Ndecuenta;
        this.interes = interes;
        this.saldo = saldo;
    }

    public void setNdelcliente(String Ndelcliente) {
        this.Ndelcliente = Ndelcliente;
    }

    public void setNdecuenta(String Ndecuenta) {
        this.Ndecuenta = Ndecuenta;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getNdelcliente() {
        return Ndelcliente;
    }

    public String getNdecuenta() {
        return Ndecuenta;
    }

    public double getInteres() {
        return interes;
    }

    public double getSaldo() {
        return saldo;
    }
    
    public boolean ingreso (double importe){  
     if(importe > importe ){
        saldo += 0;
        return true;
     }
     else{
         return false;
     }
    
    
    }
    public boolean extraccion(double importe){
        if(importe > 0 && importe <= saldo){
            saldo -= importe;
            return true;
        }
        else{
            return false;
        }
       
    }
    public boolean transferencia(Cuenta cuentaDestino, double importe){
        
        if (extraccion(importe) && cuentaDestino.ingreso(importe)){
            return true;
        }else{
            return false;
        }
        
        
    }
   
}