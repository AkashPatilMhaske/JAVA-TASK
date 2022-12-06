package Assignment;

public class Employee {
String name;
int yearofjoining;
int salary;
String adress;

    public static void main(String[] args) {
        Employee employee1=new Employee();
        employee1.name="Akash";
        employee1.adress="Pune";
        employee1.salary=45000;
        employee1.yearofjoining=2022;

        Employee employee2=new Employee();
        employee2.name="Prachi";
        employee2.adress="Dattwadi";
        employee2.salary=25000;
        employee2.yearofjoining=2021;

        Employee employee3=new Employee();
        employee3.name="Sakshi";
        employee3.adress="Nagpur";
        employee3.salary=35000;
        employee3.yearofjoining=2020;

        System.out.println(employee1.name +"\t"
                +employee1.adress +
                "\t"+employee1.salary
                +"\t"+employee1.yearofjoining);

        System.out.println(employee2.name +"\t"+employee2.adress +"\t"+employee2.salary+"\t"+employee2.yearofjoining);
        System.out.println(employee3.name +"\t"+employee3.adress +"\t"+employee3.salary +"\t"+employee3.yearofjoining);









    }









}
