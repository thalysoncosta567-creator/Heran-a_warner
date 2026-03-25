package main;

public class ContaCorrente extends ContaBancaria{
    private double limite;
    
    public void setLimite(double entraLimite){
        this.limite = entraLimite;
    }
    public double getLimite(){
        return this.limite;
    }
    
    @Override
    public void sacar(double saiSaldo){
        
        if (saiSaldo>limite+super.verSaldo()){
            System.out.printf("\nErro, limite ultrapassado...");
        }
        else{
            super.sacar(saiSaldo);
        }
    }
}
