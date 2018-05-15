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
        showData(myList);
    }//main

    private static void showData(ArrayList<student> myList) {
        for (int i = 0; i < myList.size(); i++) {
            System.out.println("student info " + (i+1)+":");
            System.out.println("name :"+ myList.get(i).getName());
            System.out.println("age :" + myList.get(i).getAge());
            System.out.println("gender:" + myList.get(i).getGender());
            System.out.println("hight :" + myList.get(i).getHeight());
        }


    }

    private static ArrayList inputData(ArrayList<student> myList, int val) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 1; i <= val; i++) {
            student s = new student();
            System.out.println("Enter student info "+i+":");
            System.out.print("Name");
            s.setName(reader.readLine());
            System.out.print("age");
            s.setAge(Integer.parseInt(reader.readLine()));
            System.out.print("gender");
            s.setGender(reader.readLine());
            System.out.print("hight");
            s.setHeight(Double.parseDouble(reader.readLine()));
            myList.add(s);
        }
        return  myList;

    }


}//class
