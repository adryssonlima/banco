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
public abstract class Transferencia {
    
    public void transferir(Conta debitado, Conta creditado, double valor){
        
        if((debitado.getSaldo() + debitado.getChequeEspecial() + (debitado.getImposto() * valor)) >= valor){
            
            debitado.sacar(valor);
            creditado.depositar(valor);
            
        } else {
            
            System.out.println("Saldo insuficiente...");
            
        }
        
    }
    
}
