package edu.pingpong.practica2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Logica {
    

    public static final App app = new App();
    public static List listt;
    public static final Scanner input = new Scanner(System.in);


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

public void  method2(){
    
}


public void  method3(){
    
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
