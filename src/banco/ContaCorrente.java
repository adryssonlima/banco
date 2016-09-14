/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

/**
 *
 * @author adrysson
 */
public class ContaCorrente extends Conta{
    
    protected double chequeEspecial;
    protected double imposto = 0.8;
    
    /*
     *  método sacar sobrescrito.
     *  verifica se o valor esta dentro do limite (saldo + chequeEspecial)
     *  debita o imposto
     */
    @Override
    public void sacar(double valor){
        
        double imposto = (valor * this.imposto);
        
        if((this.saldo + this.chequeEspecial + imposto) >= valor){
            
            super.sacar(valor + (valor * this.imposto));
            
        }else{
            
            System.out.println("Retirada não permitida...");
            
        }
    }

    public double getChequeEspecial() {
        return chequeEspecial;
    }

    public void setChequeEspecial(double chequeEspecial) {
        this.chequeEspecial = chequeEspecial;
    }

    public double getImposto() {
        return imposto;
    }

    public void setImposto(double imposto) {
        this.imposto = imposto;
    }
    
    
}
