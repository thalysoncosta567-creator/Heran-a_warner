package main;

public class Main {

    public static void main(String[] args) {
        Carro novoCarro = new Carro();
        novoCarro.setmarca("Byd");
        novoCarro.setmodelo("Seal");
        novoCarro.abrirPortaMalas();
        novoCarro.ligarRadio();
        
        Moto novaMoto = new Moto();
        novaMoto.setmarca("Honda");
        novaMoto.setmodelo("Hornet");
        novaMoto.baixarDescanso();
        
        novaMoto.ligarmotor();
        novoCarro.ligarmotor();
        
        novoCarro.movimento("ir a frente");
        novaMoto.movimento("Ir a frente");
        
        
    }
    
}
