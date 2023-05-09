package com.display;
import javafx.application.Application;


public class App{
    public static void main(String[] args) throws Exception {

        //Formatting in terminal. Yes it bothers me
        System.out.println("");
        System.out.println("-------------------------");
        System.out.println("----------Start----------");
        System.out.println("-------------------------");
        System.out.println("");     

        Application.launch(Display_App.class, args);

        //Formatting in terminal. Yes it Bothers me
        System.out.println("");
        System.out.println("-------------------------");
        System.out.println("-----------End-----------");
        System.out.println("-------------------------");
        System.out.println("");

        //block.printBlock();
        //block.turnNotModular("F");
        //block.printBlock();


    }

    
}
