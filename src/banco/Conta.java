/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

import java.util.Scanner;

/**
 *
 * @author adrysson
 */
public abstract class Conta {
    
    protected int cod;
    protected Pessoa titular;
    protected double saldo = 0.0;
    Scanner leia = new Scanner(System.in);
        
    public void sacar(double valor){
        this.saldo -= valor;
    }
    
    public void depositar(double valor){
        this.saldo += valor;
    }

    public int getCod() {
        return cod;
    }

    public Conta setCod() {
        System.out.println("Código da Conta: ");
        this.cod = leia.nextInt();
        return this;
    }

    public Pessoa getTitular() {
        return titular;
    }

    public Conta setTitular(Pessoa titular) {
        this.titular = titular;
        return this;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    
}
