/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author adrysson
 */
public class Agencia {
    
    Scanner leia = new Scanner(System.in);
    private ArrayList<Conta> contas = new ArrayList<>();
    
    public void criarConta(){
        
        System.out.println("Preencha os dados: ");
        Conta conta = new Conta();
        System.out.println("Código da conta: ");
        conta.setCod(leia.nextInt());
        Pessoa titular = new Pessoa().setNome().setEndereco().setNascimento();
        conta.setTitular(titular);
        this.contas.add(conta);
               
    }
    
    public void excluirConta(){
        
        int cod;
        System.out.println("Informe o código da conta que deseja excluir: ");
        cod = leia.nextInt();
        
        for (Conta conta : this.contas){
            if(conta.getCod() == cod){
                this.contas.remove(conta);
                break;
            }
        }
        
    }

    public ArrayList<Conta> getContas() {
        return contas;
    }
    
    public void listarContas(){
        
        System.out.println(">>> Contas <<<");
        for (Conta conta : this.contas  ){
            System.out.println("Titular: " + conta.getTitular().getNome());
        }
        
    }
        
}
