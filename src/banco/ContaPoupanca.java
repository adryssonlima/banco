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
public final class ContaPoupanca extends Conta {
       
    /*
     *  implementaçõa do método sacar.
     *  verifica se o valor esta dentro do limite
     *  debita o imposto
     */
    @Override
    public void sacar(double valor){
        
        if(this.saldo >= valor)
            this.saldo -= valor;
        else
            System.out.println("Saldo insuficiente...");
    }
    
}
