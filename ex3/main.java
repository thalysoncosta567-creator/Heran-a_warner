package main;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("\nDigite a opção correspondente.\n1-Primeira Classe\n2-Classe Executiva\n3-Classe economica\n");
        int escolha=0;
        while(true){
            escolha= s.nextInt();
            if (escolha==1){
                PrimeiraClasse novapass1 = new PrimeiraClasse();
                System.out.printf("\nTipo: Primeira Classe\nValor: %.2f\nPoltrona: 12(Escolha disponivel apenas para executiva)", novapass1.passagemPrimeiraClasse());
                break;
            }
            else if(escolha==2){
                ClasseExecutiva novapass2 = new ClasseExecutiva();
                System.out.println("Informe a poltrona desejada: ");
                novapass2.setPoltrona(s.nextInt());
                novapass2.classeExecutiva();
                break;
            }
            else if (escolha==3){
                ClasseEconomica novapass3 = new ClasseEconomica();
                novapass3.classeEconomica();
                break;
            }
            else{
                System.out.println("\nEntrada invalida\n");
            }
        }
        s.close();
    }
    
}
