package edu.pingpong.practica2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Logica {
    

    public static final App app = new App();
    public static List listt;
    public static List listt2;

    public static final Scanner input = new Scanner(System.in);
    private int valuespositivos = 0; //Si el valor es positivo se ira acumulando aqui
    private int valuesnegativos = 0; //Si el valor es negativo se ira acumulando aqui
    private int contadordeCeros = 0; //si es 0, los contara
    private int contadorNumPositivos = 0; // esta variable se encargara de contar las veces que se metieron un numero positivo
    private int contadorNumNegativos = 0; // esta variable se encargara de contar las veces que se metieron un numero negativo


    Logica(){
        this.listt = new ArrayList<>();
    }


    public static void method1() {
        
        while (listt.size() < 5) {   
            System.out.println("Please enter a positive number:");  
            listt.add(input.nextInt()); 
        }
            System.out.println("Result:"  + listt);
    }

    public void method2() {
        while (listt2.size() < 5) {   
            System.out.println("Please enter a positive number:");  
            listt2.add(input.nextInt());

        }
        Collections.reverse(listt2);
            System.out.println("Result:" +  listt2 );
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
    System.out.println("-Ceros:" +  contadordeCeros  + "\n" +
                       "-Positivos:" +  valuespositivos/contadorNumPositivos + "\n" + 
                       "-Negativos:" +  valuesnegativos/contadorNumNegativos + "\n" + "\n" + "\n" +
                       "*Type 0 to return to the \"MENU\""
                       );

    }


public void  method4(){
    
}


public void  method5(){
    
}


public void  method6(){
    
}


public void  method7(){
    
}


public void  method8(){
    
}



public void  method9(){
    
}








    

public int Switch() {
    
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
    }

}
