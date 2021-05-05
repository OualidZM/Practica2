package edu.pingpong.practica2;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Logica {
    

    public static final App app = new App(); // Creamos un objeto de App
    public static List listt; //Creamos una lista
    public static List listt2; //Creamos otra lista

    public static final Scanner input = new Scanner(System.in); // Creamos un objeto Scanner
    public static final Scanner firstphrase = new Scanner(System.in); // Creamos un objeto Scanner
    public static final Scanner secondphrase = new Scanner(System.in); // Creamos un objeto Scanner
    public static final Scanner vowel = new Scanner(System.in); // Creamos un objeto Scanner

    private int valuespositivos = 0; //Creamos una variable int que sumara los valores positivos
    private int valuesnegativos = 0; //Creamos una variable int que sumara los valores negativos
    private int contadordeCeros = 0; //si el valor dado es 0 entonces,se sumara +1 al contador
    private int contadorNumPositivos = 0;  //es un contador de números positivos
    private int contadorNumNegativos = 0; //es un contador de números negativos


    Logica(){
        this.listt = new ArrayList<>(); //Inicializamos el array
        this.listt2 = new ArrayList<>(); //Inicializamos el array

    }


    public static void getFiveNumbers() {
        
        while (listt.size() < 5) {   //si la lista es menor que 5, entonces seguirá el bucle
            System.out.println("Please enter a positive number:");  
            listt.add(input.nextInt()); //se añadirá a la lista
        }
            System.out.println("-Result:"  + listt +
            "\n" + "\n" + "\n" + "*Type 0 to return to the \"MENU\""
            );
    }

    public void getFiveNumbersInverted() {
        while (listt2.size() < 5) {  //si la lista es menor que 5, entonces seguirá el bucle
            System.out.println("Please enter a positive number:");  
            listt2.add(input.nextInt()); //se añadirá a la lista

        }
        Collections.reverse(listt2); //Devolverá los valores al revés
            System.out.println("Result:" +  listt2  +
            "\n" + "\n" + "\n" + "*Type 0 to return to the \"MENU\""
            );
    }


    public void getAverage() {
        
        for (int i=0;i<5;i++){
            System.out.println("Please enter a positive or negative number:");
            int val = input.nextInt();
            if( val == 0) { //si el valor es igual a 0, este añadirá +1 al contador contadorNumPostivos
                contadordeCeros++;
            }
            else if (val > 0){ //si el valor el mayor que 0 entonces este sumara el input a la variable valuespositivos y añadirá +1 al contador de contadorNumPositivos
                    valuespositivos += val;
                    contadorNumPositivos++;
            }

            else{
                if (val < 0){ //si el valor es menor que 0 entonces este sumara el input a la variable valuesnegativos y añadirá +1 al contador de contadorNumNegativos
                    valuesnegativos += val;
                    contadorNumNegativos++;
                }
            }
        } //para sacar la media tenemos que hacer la suma de todos los números % los números que hay

    System.out.println("-Positivos:" +  valuespositivos/contadorNumPositivos + "\n" + //para sacar la media
                       "-Negativos:" +  valuesnegativos/contadorNumNegativos + "\n" +
                       "-Ceros:" +  contadordeCeros  
                       + "\n" + "\n" + "\n" +
                       "*Type 0 to return to the \"MENU\""
                       );

    }


    public void getphraselenght() {

        System.out.println("Enter a phrase:"); //pedimos input
        String phrase = input.nextLine();
        String noSpace = phrase.replaceAll("\\s+", ""); //quitamos los espacios en blanco
        int count = noSpace.length(); //encontramos la longitud  de  este
        System.out.println(MessageFormat.format("La longitud de \"{0}\"", phrase) + " es de: " + "\n" +
        "-[" + count + "]"
        + "\n" + "\n" + "\n" +
        "*Type 0 to return to the \"MENU\""
        );
        
    }


    public void getPhraseInverted() {
        System.out.println("Enter a phrase:"); //pedimos input
        String phrase = input.nextLine();
        StringBuilder sb = new StringBuilder(phrase); //Creamos objeto de StringBuilder
        System.out.println(MessageFormat.format("The  reverse of \"{0}\"", phrase) + " is: " +  "\n" +
        "-" + sb.reverse() //revertimos el valor dado al inicio
        + "\n" + "\n" + "\n" +
        "*Type 0 to return to the \"MENU\""
        );
        
    }


    public void getPhraseNoSpace() {
        System.out.println("Enter a phrase:"); //pedimos input
        String phrase = input.nextLine();
        String noSpace = phrase.replaceAll("\\s+", ""); //quitamos los espacios en blanco
        System.out.println(MessageFormat.format("The phrase \"{0}\"", phrase) + " without space, will return this: " + "\n" +
        "-" + noSpace 
        + "\n" + "\n" + "\n" +
        "*Type 0 to return to the \"MENU\""
        );
        
    }

    public void concatenatePhrase() {
        System.out.println("Enter a phrase:"); //pedimos input
        String firstphras = firstphrase.nextLine(); //quitamos los espacios en blanco
        String noSpacefirst = firstphras.replaceAll("\\s+", "");
        System.out.println("Enter a phrase:"); //pedimos input
        String secondphras = secondphrase.nextLine();
        String noSpacesecond = secondphras.replaceAll("\\s+", ""); //quitamos los espacios en blanco
        System.out.println(
            MessageFormat.format("The concatenation of \"{0}\" and \"{1}\" without spaces will look like this:",firstphras,secondphras)  + "\n" +
            "-" + noSpacefirst + noSpacesecond + "\n" + "\n" + "\n" +
            "*Type 0 to return to the \"MENU\""
            );

    }


    public void replaceForVowel() {
        
        System.out.println("Enter a phrase:"); //pedimos input
        String phrase = input.nextLine();
        System.out.println("Enter a vowel :"); //pedimos input
        String vowell  = vowel.nextLine();
        String replace = phrase.replaceAll("[aeiouAEIOU]", vowell); //remplazar todas las vocales por la vocal que da es usuario
        System.out.println(MessageFormat.format("You want to change all the vowels that are located in \"{0}\" for \"{1}\".",phrase,vowell)  +  "\n" +
        "This would look like this: " +  "\n" +
        "-" + replace 
        + "\n" + "\n" + "\n" +
        "*Type 0 to return to the \"MENU\""
        
        );

    }



    public void getAscii() {

        System.out.println("Enter a phrase:"); // pedimos input
        String value = input.nextLine(); 
        char[] ascii = value.toCharArray(); //el valor dado, lo guardaremos en un char[]
        
        for (int i=0;i<ascii.length;i++){ //Recorreremos cada letra y de cada una devolveremos su ASCII

            System.out.println("-The ascii of the letter " + "\"" + ascii[i] + "\""  + " is: " + " " +  "[" + (int)value.charAt(i) + "]"
            ) ;
        }
        System.out.println("\n" + "\n" + "\n" + "*Type 0 to return to the \"MENU\"");
        
    }









    

public int switchh() {
    
    int menuu =  app.menu.nextInt();
    switch (menuu) {
        case 1:
        getFiveNumbers();
            break;

        case 2:
        getFiveNumbersInverted();
        break;

        case 3:
        getAverage();
        break;

        case 4:
        getphraselenght();
        break;

        case 5:
        getPhraseInverted();
        break;

        case 6:
        getPhraseNoSpace();
        break;

        case 7:
        concatenatePhrase();
        break;

        case 8:
        replaceForVowel();
        break;
        
        case 9:
        getAscii();
        break;

        default:
        System.out.println("wrong!");
            break;
        }
    return menuu;

    }

}
