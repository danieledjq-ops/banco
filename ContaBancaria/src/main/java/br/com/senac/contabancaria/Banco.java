/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.senac.contabancaria;

import java.util.Scanner;

/**
 *
 * @author daniele62947876
 */
public class Banco {
    
    public static void main (String[] args){
        
        Scanner entrada = new Scanner (System.in);
        String nome;
        
        System.out.println("Nome do titular: ");
        nome= entrada.nextLine();
        
        System.out.println("CPF do titular: ");
        cpf = entrada.nextLine();
       
        
    ContaBancaria conta1 = new ContaBancaria("ELIE");
            
    conta1.depositar(100);
    
   // conta1.extratoBancario();
    
    conta1.sacar(10);
    
    conta1.extratoBancario();
    
    System.out.println(conta1.getTitular());
    System.out.println(conta1.getSaldo());
    
    conta1.setTitular("Dani");
    
    System.out.println(conta1.getTitular());
    
    Conta_PF conta_pf = new Conta_PF(123445678, "Vicente");
    
    conta_pf.imprimir();
        
 
    }
    
    
}
