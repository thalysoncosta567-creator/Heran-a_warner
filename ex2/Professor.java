/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package escola;

/**
 *
 * @author thaly
 */


public class Professor extends Pessoa {
    private int nota;
    
    public Professor(){
        nota = 0;
    }
    
    public void setNota(int entraNota){
        this.nota = entraNota;
    }
    public int getNota(){
        return this.nota;
    }
    
}
    
