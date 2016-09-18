/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;


/**
 *
 * @author adryssonlima
 */
public class Conta extends Transferencia {
    
    protected int cod;
    protected Pessoa titular;
    protected double saldo = 0.0;
    private double chequeEspecial = 100.00;
    private double imposto = 0.8;
           
    public void sacar(double valor){
        
        double imposto = (valor * this.imposto);
        
        if((this.saldo + this.chequeEspecial + imposto) >= valor){
            
            this.saldo -= (valor + imposto);
            
        }else{
            
            System.out.println("Saldo insuficiente...");
            
        }
    }
    
    public void depositar(double valor){
        this.saldo += valor;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public Pessoa getTitular() {
        return titular;
    }

    public void setTitular(Pessoa titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
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
