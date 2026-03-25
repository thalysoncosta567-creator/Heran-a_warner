/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package escola;

/**
 *
 * @author thaly
 */

    
  
public class Aluno extends Pessoa{
    private String curso;
    private int periodo;
    
    public void setCurso(String entracurso){
        this.curso= entracurso;
    }
    
    public String getCurso(){
        return this.curso;
    }
    public void setPeriodo(int entraperiodo){
        this.periodo = entraperiodo;
    }
    public int getPeriodo(){
        return this.periodo;
    }
    
    public void pagarBoleto(){
        System.out.println("Boleto pago!!");
    }
}
    
