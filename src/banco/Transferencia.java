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
public class Transferencia {
    
    private ContaCorrente debitado;
    private ContaCorrente creditado;
    
    public void transferir(ContaCorrente debitado, ContaCorrente creditado, double valor){
        if((debitado.getSaldo() + debitado.getChequeEspecial() + debitado.getImposto() * valor) >= valor){
            debitado.sacar(valor);
            creditado.depositar(valor);
        }
    }
    
}
