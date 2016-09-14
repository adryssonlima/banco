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
public class Pessoa {
    
    private String nome;
    private String endereco;
    private String nascimento;
    Scanner leia = new Scanner(System.in);

    public String getNome() {
        return nome;
    }

    public Pessoa setNome() {
        System.out.println("Nome: ");
        this.nome = leia.next();
        return this;
    }

    public String getEndereco() {
        return endereco;
    }

    public Pessoa setEndereco() {
        System.out.println("Endereço: ");
        this.endereco = leia.next();
        return this;
    }

    public String getNascimento() {
        return nascimento;
    }

    public Pessoa setNascimento() {
        System.out.println("Data Nascimento: ");
        this.nascimento = leia.next();
        return this;
    }
        
}
