package lab7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class studentAppArrayList {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("How many data you do have ? :");
        int val = Integer.parseInt(reader.readLine());
        ArrayList<student>myList =new ArrayList<student>();
     myList=inputData(myList,val);
    }//main

    private static ArrayList inputData(ArrayList<student> myList, int val) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 1; i <= val; i++) {
            student s = new student();
            System.out.println("Enter student info "+i+":");
            System.out.println("Name");
            s.setName(reader.readLine());
            System.out.println("age");
            s.setAge(Integer.parseInt(reader.readLine()));
            System.out.println("gender");
            s.setGender(reader.readLine());
            System.out.println("hight");
            s.setHeight(Double.parseDouble(reader.readLine()));
            myList.add(s);
        }
        return  myList;

    }


}//class
