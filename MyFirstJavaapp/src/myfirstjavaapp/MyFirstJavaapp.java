
package myfirstjavaapp;

import java.util.Scanner;
public class MyFirstJavaapp {

    public static void main(String[] args) {

    System.out.println("enter the degri");
    double celsius=new Scanner(System.in).nextDouble();
    double fahrenheit=(9/5)*celsius+32;
    System.out.println(fahrenheit);

    }
}


