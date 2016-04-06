
import java.util.Random;
import java.util.Scanner;
import model.Juego;



public class Main {

   
    public static void main(String[] args) {
    
        
        Scanner leer = new Scanner(System.in);
        int numero;
        boolean seAdivinoElNumeroSecreto = false;
      Juego juego = new Juego(1, 5, 2);
        while(juego.puedeIntentarDeNuevo()== true && seAdivinoElNumeroSecreto == false){
            System.out.println("Adivina el numero secreto: ");
            numero = leer.nextInt();
            seAdivinoElNumeroSecreto = juego.esElNumeroSecreto(numero);
            if (seAdivinoElNumeroSecreto){
                System.out.println("Felicidades. Has adivinado el número secreto.");
            }
        else{
                System.out.println("Fallaste. El numero secreto es: " + juego.getTexoDeAyuda(numero) + " que el numero proporcionado");
             System.out.println("Intenta de nuevo.");
                
            }
            
           
    }
    
  System.out.println("El número secreto es " + juego.getNumeroSecreto()); 
        System.out.println("");       
    
    }



}
