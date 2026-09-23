/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.senac.contabancaria;

/**
 *
 * @author daniele62947876
 */
public class Conta_PF extends ContaBancaria{
    private int cpf;
    
    
    public int getCPF (){
        return cpf;
    }
    
    public void Conta_PF (int cpf){
        this.cpf = cpf;
    }
    
    public Conta_PF (int cpf, String titular) {
        super (titular);
        this.cpf = cpf;
    }
    @Override 
    public void imprimir() {
        System.out.println("Nome do titular" + this.getTitular());
        System.out.println("Saldo" + this.getSaldo());
        System.out.println("CPF" + cpf);
                System.out.println("---------------------------------");

    }
}

