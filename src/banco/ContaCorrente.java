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
    protected static double imposto = 0.8;
    
    /*
     *  método sacar sobrescrito.
     *  verifica se o valor esta dentro do limite (saldo + chequeEspecial)
     *  debita o imposto
     */
    @Override
    public void sacar(double valor){
        if((this.saldo + this.chequeEspecial) >= valor){
            super.sacar(valor);
            super.sacar(valor * this.imposto);
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

    public static double getImposto() {
        return imposto;
    }

    public static void setImposto(double imposto) {
        ContaCorrente.imposto = imposto;
    }
    
    
}
