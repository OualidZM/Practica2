package edu.pingpong.practica2;
import java.util.Scanner;

public class App 
{


public static final Scanner startProgram = new Scanner(System.in);
public static final Scanner menu = new Scanner(System.in);
public static final Logica  logica = new Logica();
public static  boolean salir = false;



    public static void main( String[] args )
    {

        name();

    }

    public static void name() {

        try {

            System.out.println("\t" + "@||||||@ Practica 2 @||||||@"
            + "\n" + "\n" +"\t" + 

                "[0]" + " " + " " + "Run program"   
                        + "\n" +"\t" +

                "[99]" + " " + "Quit program" );

        do{

            int run = startProgram.nextInt();


                if(startProgram.hasNextLine()){

                System.out.println("\t" + "@||||||@ Practica 2 @||||||@"
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
                "[6]" +  " " +  "Ask for two texts and return it without spaces"
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
                
            }while(!salir);
        }


        catch (Exception e) {
            System.out.println("SOMETHING WENTTTTT WRONG");
        }
    }


}
