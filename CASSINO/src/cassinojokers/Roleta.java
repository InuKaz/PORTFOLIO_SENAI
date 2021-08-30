package cassinojokers;
import java.util.Random;
import java.util.Scanner;

public class Roleta { 
        double resultado = 0; 
        int cor; 
        String corEsc = null; 
        String corRan = null; 
        int aposta; 
        int numeroRandom;
        int corRandom;

    public double Apostar(Scanner semValor,double valorAposta){
        Scanner console = new Scanner(System.in);
        Random r = new Random();
        this.numeroRandom = r.nextInt(36);
        this.corRandom = r.nextInt(1);
        System.out.print("Escolha um número entre 0 e 36:");
        this.aposta = console.nextInt();
        System.out.print("Voce quer Apostar no: \n0) Vermelho\n1) Preto");
        this.cor = console.nextInt();
        if(this.cor == 0){
            this.corEsc = "VERMELHO";
        }else{
            this.corEsc = "PRETO";
        }
         if(this.corRandom == 0){
             this.corRan = "VERMELHO";
         }else{
             this.corRan = "PRETO";
         }
   
        if((this.aposta == 0)&&( this.numeroRandom == 0)||(this.aposta == this.numeroRandom)){
            this.resultado = valorAposta * 5;
            this.corEsc = "";
            this.corRan = "";
            System.out.println("Parabéns! Você ganhou 5x o valor de aposta: R$" + resultado);
        }
        else if((cor == corRandom)||(numeroRandom != aposta)){
                resultado = valorAposta - valorAposta ; 
            System.out.println("Que pena! Você perdeu!");
        }
        else if((cor == corRandom)||(numeroRandom == aposta)){
                resultado = valorAposta * 3;  
             System.out.println("Parabéns! Você ganhou 3x o valor de aposta: R$" + resultado);
        }
        else if((cor != corRandom)&&(numeroRandom != aposta)){
                resultado = valorAposta - valorAposta ; 
            System.out.println("Que pena! Você perdeu!");
        }
        else if((cor != corRandom)||(numeroRandom == aposta)){
                resultado = valorAposta + valorAposta;  
             System.out.println("Parabéns! Você ganhou 1x o valor de aposta: R$" + resultado);
        }
        return resultado;
    }
    public void Imprimir(){
        System.out.println("");
 System.out.println("============================================================");
        System.out.println("\nCor Apostada -> " + corEsc + "    Cor Gerada   -> " + corRan);
        System.out.println("\nValor Apostado -> "+ aposta + " Valor Gerado -> " + numeroRandom);
 System.out.println("============================================================");
    }
}
