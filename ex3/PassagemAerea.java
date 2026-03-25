 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author lucas e thalyson
 */
public class PassagemAerea {
    private double preco;
    
    public PassagemAerea(){
        preco=1000;
    }
    
    public double getPreco(){
        return preco;
    }
    
    public void imprimeValor(){
        System.out.println("\n Valor referente a passagen: " + preco);
    }
    
}
