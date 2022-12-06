package Assignment;

public class Student {
String name;
int rollno;
int phone;
String address;

    public static void main(String[] args) {
        Student student1 = new Student();
        student1.name = "Akash";
        student1.address = "pune";
        student1.rollno = 25;
        student1.phone = 999999;

        Student student2 = new Student();
        student2.name = "Amol";
        student2.address = "pune2";
        student2.rollno = 26;
        student2.phone = 888888;

        Student student3 = new Student();
        student3.name = "nilesh";
        student3.address = "pune";
        student3.rollno = 27;
        student3.phone = 777777;

        System.out.println(student1.name + "\t" + student1.address + "\t" + student1.rollno + "\t" + student1.phone);
        System.out.println(student2.name + "\t" + student2.address + "\t" + student2.rollno + "\t" + student2.phone);
        System.out.println(student1.name + "\t" + student3.address + "\t" + student3.rollno + "\t" + student3.phone);


    }}
