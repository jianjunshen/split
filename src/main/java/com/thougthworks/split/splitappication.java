package com.thougthworks.split;


import java.lang.*;
import java.util.Scanner;

public class splitappication {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        splitfunction splitfunction= new splitfunction();
        splitfunction.function(str);
    }

}
