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
public class CaixaEletronico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leia = new Scanner(System.in);
        Pessoa adrysson = new Pessoa().setNome().setEndereco().setNascimento();
        ContaCorrente cc = new ContaCorrente();
        
        cc.setCod(1);
        cc.setTitular(adrysson);
        cc.setChequeEspecial(200);
        
        System.out.println("Código: " + cc.getCod());
        System.out.println("Titular: " + cc.getTitular().getNome());
        System.out.println("Cheque Especial: " + cc.getChequeEspecial());
        
    }
    
}
