package pokemon;
import classesPokemons.Pikachu;
import classesPokemons.Blastoise;
import classesPokemons.Bulbassauro;
import classesPokemons.Charizard;
import classesPokemons.Charmander;
import classesPokemons.Flareon;
import classesPokemons.Gyrados;
import classesPokemons.Jolteon;
import classesPokemons.Onix;
import classesPokemons.Squirtle;
import classesPokemons.Venossauro;
import classesPokemons.Vaporeon;

import java.util.Scanner;
        
        
                

        
class trabalhoPokemon {
	public static void main(String[] args) {
            
            
            //IniciaJogo jogo = new IniciaJogo();
            
            
            Pokemon p1 = new Pikachu();
            Pokemon p2 = new Blastoise();
            Pokemon p3 = new Bulbassauro();
            Pokemon p4 = new Charizard();
            Pokemon p5 = new Charmander();
            Pokemon p6 = new Flareon();
            Pokemon p7 = new Gyrados();
            Pokemon p8 = new Jolteon();
            Pokemon p9 = new Onix();
            Pokemon p10 = new Venossauro();
            Pokemon p11 = new Vaporeon();
            Pokemon p12 = new Squirtle();
            Time t1 = new Time(p5,p11,p10);
            Time t2 = new Time(p12,p6,p7);
            Time t3 = new Time(p3,p8,p2);
            Time t4 = new Time(p1,p4,p9);
            Time escolhido1 = new Time();
            Time escolhido2 = new Time();
       

            System.out.println("Qual time você quer treinador 1 ? 1 - Time 1 2- Time 2 3- Time 3 4 - Time 4"); 
            Scanner reader = new Scanner(System.in);  // Reading from System.in
            Time timeA=t3;
            int i = reader.nextInt();
            if(i==1){
                timeA= t1; 
                System.out.println("Time1"); 
            }
            if(i==2){
                timeA= t2; 
                System.out.println("Time2"); 
            }
            if(i==3){
                timeA= t3; 
                System.out.println("Time3"); 
            }
            if(i==4){
                timeA= t4; 
                System.out.println("Time4"); 
            }
            
            System.out.println("Qual time você quer treinador 2 ? 1 - Time 1 2- Time 2 3- Time 3 4 - Time 4"); 
            Scanner readerB = new Scanner(System.in);  // Reading from System.in
            Time timeB=t2;
            int j = reader.nextInt();
            if(j==1){
                timeB= t1; 
                System.out.println("Time1"); 
            }
            if(j==2){
                timeB= t2; 
                System.out.println("Time2"); 
            }
            if(j==3){
                timeB= t3; 
                System.out.println("Time3"); 
            }
            if(j==4){
                timeB= t4; 
                System.out.println("Time4"); 
            }
            
             Treinador A = new Treinador(timeA);
             Treinador B = new Treinador(timeB);
             Batalha Bat = new Batalha(A,B);
             Bat.comecarBatalha();
             
	}
}
