package lab7;

public class studentApp {
    public static void main(String[] args) {
        student s1 = new student();
        s1.setName("Mit");
        s1.setAge(22);
        s1.setGender("Male");
        s1.setHeight(180);
        System.out.println(s1.toString());

        student s2 = new student("safe", 90, "female", 190);
        System.out.println(s2.toString());
    }//main

}//class
