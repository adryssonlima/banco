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
public class ContaPoupanca extends Conta {
    
    /*
     *  método sacar sobrescrito.
     *  verifica se o valor esta dentro do limite
     *  debita o imposto
     */
    @Override
    public void sacar(double valor){
        if(this.saldo >= valor)
            super.sacar(valor);
        else
            System.out.println("Retirada não permitida...");
    }
    
}
