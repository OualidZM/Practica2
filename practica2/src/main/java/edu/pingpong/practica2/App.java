package edu.pingpong.practica2;
import java.util.Scanner;

public class App 
{


public static final Scanner startProgram = new Scanner(System.in);
public static final Scanner menu = new Scanner(System.in);
public static final Logica  logica = new Logica();


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
        }

        catch (Exception e) {
            System.out.println("SOMETHING WENTTTTT WRONG");
        }
    }


}
