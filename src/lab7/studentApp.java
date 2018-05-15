package lab7;

import java.util.Scanner;

public class studentApp {
    public static void main(String[] args) {
        // s1
        student s1 = new student();
        s1.setName("Mit");
        s1.setAge(22);
        s1.setGender("Male");
        s1.setHeight(180);
        System.out.println(s1.toString());
        // s2
        student s2 = new student("safe", 90, "female", 190);
        System.out.println(s2.toString());

        // input data form user s3
        student s3 = new student();
        s3 = inputdata(s3);
        System.out.println(s3.toString());


    }//main

    // ค่าของ s3
    private static student inputdata(student s3) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your information :");

        System.out.println("Name");
        s3.setName(sc.nextLine());

        System.out.println("age");
        s3.setAge(sc.nextInt());

        System.out.println("gender");
        s3.setGender(sc.nextLine());

        System.out.println("height");
        s3.setHeight(sc.nextDouble());

        return s3;
    }

}//class
