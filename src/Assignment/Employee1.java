package Assignment;

public class Employee1 {
String name;
int salary;
int numberofHoursWorked;

void acceptEmpolyeeDetails(String n,int sal,int hours){
    name=n;
    salary=sal;
    numberofHoursWorked=hours;
}
void addSalery(){
    if(salary<500){
        salary=salary+10;

    }
}
void addwork(){
    if (numberofHoursWorked>6){
        salary=salary+5;
    }
}

    public static void main(String[] args) {
        Employee1 employee1=new Employee1();
        employee1.acceptEmpolyeeDetails("Akash",3000,16);
    employee1.addSalery();
        System.out.println("Salery"+employee1.salary);
    employee1.addwork();
        System.out.println("hours"+employee1.numberofHoursWorked);



    }


}
