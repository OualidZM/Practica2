package edu.pingpong.practica2;
import java.util.Scanner;


public class App 
{


public static final Scanner startProgram = new Scanner(System.in); // Creamos un objeto Scanner
public static final Scanner menu = new Scanner(System.in); // Creamos un objeto Scanner
public static final Logica  logica = new Logica(); // Creamos un objeto Scanner
public static  boolean salir = false; //Creamos un booleano que servirá para mantener el bucle while activo



    public static void main( String[] args )
    {

        program();

    }

    public static void program() {

        try {

            System.out.println("\t" + "|||||| Practica 2 ||||||"
            + "\n" + "\n" +"\t" + 

                "[0]" + " " + " " + "Run program" );

        do{

            int run = startProgram.nextInt();

                if(startProgram.hasNextLine()){

                System.out.println("\t" + "|||||| Practica 2 ||||||"
                + "\n" + "\n" +"\t" + 
                "Elige la Opcion que quiere realizar:" 
                + "\n" + "\n" +"\t" +
                "[1]" +  " " +  "Ask 5 numbers and display them with the same order " 
                + "\n" +"\t" +
                "[2]" +  " " +  "Ask 5 numbers and display them in the reverse order " 
                + "\n" +"\t" +
                "[3]" +  " " +  "Ask 5 numbers and then make avarage of positives and negatives, and finally count all \"0\""
                + "\n" +"\t" +
                "[4]" +  " " +  "Ask for text and return the length of it without spaces"
                + "\n" +"\t" +
                "[5]" +  " " +  "ask for text and return it inverted"
                + "\n" +"\t" +
                "[6]" +  " " +  "Ask one text and return it without spaces"
                + "\n" +"\t" +
                "[7]" +  " " +  "Ask for two texts and concatenate them"
                + "\n" +"\t" +
                "[8]" +  " " +  "Ask for a text and a vowel, then replace all the vowels with the one that was asked"
                + "\n" +"\t" +
                "[9]" +  " " +  "Ask for a text and show it's ascii code"
                + "\n" +  "\n" + 
                "[99]" +  " " +  "-Quit program"
                );
                }

                int menuu = menu.nextInt();

                if(menuu != 99){  //si el input del usuario no equivale a 99, entonces se  cumple la condición

                    logica.switchh();
                        
                    }

                else{
                    if (menuu == 99){ //si el input del usuario es 99, entonces este saldrá del bucle y del programa
                        System.out.println("Thanks for using the program!");
                        break;
                    }
                }
                
            }while(!salir);
        }


        catch (Exception error) { //se ejecutará en caso de si hay algún error que no se pueda manejar
            System.out.println("Something went wrong!");
        }
    }


}
