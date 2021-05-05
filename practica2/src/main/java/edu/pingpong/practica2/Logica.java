package edu.pingpong.practica2;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Logica {
    

    public static final App app = new App();
    public static List listt;
    public static List listt2;

    public static final Scanner input = new Scanner(System.in);
    public static final Scanner firstphrase = new Scanner(System.in);
    public static final Scanner secondphrase = new Scanner(System.in);
    public static final Scanner vowel = new Scanner(System.in);

    private int valuespositivos = 0;
    private int valuesnegativos = 0;
    private int contadordeCeros = 0;
    private int contadorNumPositivos = 0; 
    private int contadorNumNegativos = 0;


    Logica(){
        this.listt = new ArrayList<>();
        this.listt2 = new ArrayList<>();

    }


    public static void method1() {
        
        while (listt.size() < 5) {   
            System.out.println("Please enter a positive number:");  
            listt.add(input.nextInt()); 
        }
            System.out.println("-Result:"  + listt +
            "\n" + "\n" + "\n" + "*Type 0 to return to the \"MENU\""
            );
    }

    public void method2() {
        while (listt2.size() < 5) {   
            System.out.println("Please enter a positive number:");  
            listt2.add(input.nextInt());

        }
        Collections.reverse(listt2);
            System.out.println("Result:" +  listt2  +
            "\n" + "\n" + "\n" + "*Type 0 to return to the \"MENU\""
            );
    }


    public void method3() {
        
        for (int i=0;i<5;i++){
            System.out.println("Please enter a positive or negative number:");
            int val = input.nextInt();
            if( val == 0) {
                contadordeCeros++;
            }
            else if (val > 0){
                    valuespositivos += val;
                    contadorNumPositivos++;
            }

            else{
                if (val < 0){
                    valuesnegativos += val;
                    contadorNumNegativos++;
                }
            }
        }
    System.out.println("-Positivos:" +  valuespositivos/contadorNumPositivos + "\n" + 
                       "-Negativos:" +  valuesnegativos/contadorNumNegativos + "\n" +
                       "-Ceros:" +  contadordeCeros  
                       + "\n" + "\n" + "\n" +
                       "*Type 0 to return to the \"MENU\""
                       );

    }


    public void method4() {

        System.out.println("Enter a phrase:");
        String phrase = input.nextLine();
        String noSpace = phrase.replaceAll("\\s+", "");
        int count = noSpace.length();
        System.out.println(MessageFormat.format("La longitud de \"{0}\"", phrase) + " es de: " + "\n" +
        "-[" + count + "]"
        + "\n" + "\n" + "\n" +
        "*Type 0 to return to the \"MENU\""
        );
        
    }


    public void method5() {
        System.out.println("Enter a phrase:");
        String phrase = input.nextLine();
        StringBuilder sb = new StringBuilder(phrase);
        System.out.println(MessageFormat.format("The  reverse of \"{0}\"", phrase) + " is: " +  "\n" +
        "-" + sb.reverse() 
        + "\n" + "\n" + "\n" +
        "*Type 0 to return to the \"MENU\""
        );
        
    }


    public void method6() {
        System.out.println("Enter a phrase:");
        String phrase = input.nextLine();
        String noSpace = phrase.replaceAll("\\s+", "");
        System.out.println(MessageFormat.format("The phrase \"{0}\"", phrase) + " without space, will return this: " + "\n" +
        "-" + noSpace 
        + "\n" + "\n" + "\n" +
        "*Type 0 to return to the \"MENU\""
        );
        
    }

    public void method7() {
        System.out.println("Enter a phrase:");
        String firstphras = firstphrase.nextLine();
        String noSpacefirst = firstphras.replaceAll("\\s+", "");
        System.out.println("Enter a phrase:");
        String secondphras = secondphrase.nextLine();
        String noSpacesecond = secondphras.replaceAll("\\s+", "");
        System.out.println(
            MessageFormat.format("The concatenation of \"{0}\" and \"{1}\" without spaces will look like this:",firstphras,secondphras)  + "\n" +
            "-" + noSpacefirst + noSpacesecond + "\n" + "\n" + "\n" +
            "*Type 0 to return to the \"MENU\""
            );

    }


    public void method8() {
        
        System.out.println("Enter a phrase:");
        String phrase = input.nextLine();
        System.out.println("Enter a vowel :");
        String vowell  = vowel.nextLine();
        String replace = phrase.replaceAll("[aeiouAEIOU]", vowell);
        System.out.println(MessageFormat.format("You want to change all the vowels that are located in \"{0}\" for \"{1}\".",phrase,vowell)  +  "\n" +
        "This would look like this: " +  "\n" +
        "-" + replace 
        + "\n" + "\n" + "\n" +
        "*Type 0 to return to the \"MENU\""
        
        );

    }



    public void method9() {

        System.out.println("Enter a phrase:");
        String value = input.nextLine();
        char[] ascii = value.toCharArray();
        
        for (int i=0;i<ascii.length;i++){

            System.out.println("-The ascii of the letter " + "\"" + ascii[i] + "\""  + " is: " + " " +  "[" + (int)value.charAt(i) + "]"
            ) ;
        }
        System.out.println("\n" + "\n" + "\n" + "*Type 0 to return to the \"MENU\"");
        
    }









    

public int switchh() {
    
    int menuu =  app.menu.nextInt();
    switch (menuu) {
        case 1:
            method1();
            break;

        case 2:
        method2();
        break;

        case 3:
        method3();
        break;

        case 4:
        method4();
        break;

        case 5:
        method5();
        break;

        case 6:
        method6();
        break;

        case 7:
        method7();
        break;

        case 8:
        method8();
        break;
        
        case 9:
        method9();
        break;

        default:
        System.out.println("wrong!");
            break;
        }
    return menuu;

    }

}
