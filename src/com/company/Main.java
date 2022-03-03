package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	 System.out.println("Введите x:");
     int num1=new Scanner(System. in).nextInt();
     System.out.println("Введите y:");
     int num2=new Scanner(System. in).nextInt();
     System.out.println("Введите z:");

     int num3=new Scanner(System. in). nextInt();
        Formula Formm = new Formula(num1, num2, num3);
        Formm.displayFormula();
        System.out.println("Введите x:");
        int num4=new Scanner(System. in).nextInt();
        System.out.println("Введите y:");
        int num5=new Scanner(System. in).nextInt();
        System.out.println("Введите z:");
        int num6=new Scanner(System. in).nextInt();

        Formula Formm2 = new Formula(num4, num5, num6);
        Formm2.y=6;
        Formm2.displayFormula();
        Formm.z=7;

    }
}
class Formula {
    float x;
    float y;
    float z;

    public Formula(float x, float y, float z) {
        this.x = x;
        this.y = y;
        this.z = z;


    }

    public void displayFormula() {
        double l = Math.sqrt(x * x + y * y + z * z);

        System.out.println(l);
    }
}
