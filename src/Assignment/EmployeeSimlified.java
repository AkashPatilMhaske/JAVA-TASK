package Assignment;

public class EmployeeSimlified {
   String employeeName;
   int yearofjoining;
   String adress;
   int Salery;

   void setEmployeeDetails(String en,int yj,String add,int sal){
       employeeName=en;
       yearofjoining=yj;
       adress=add;
       Salery=sal;
   }
void printemployeedetails(){
    System.out.println(employeeName+
            "\t"+
            yearofjoining +"\t"
            +adress+"\t"
            +Salery);
}

    public static void main(String[] args) {
        EmployeeSimlified employee1 = new EmployeeSimlified();
        employee1.setEmployeeDetails("Akash", 2022, "Pune", 36000);
        employee1.printemployeedetails();

        EmployeeSimlified employee2 = new EmployeeSimlified();
        employee2.setEmployeeDetails("Prachi", 2021, "Dattwadi", 30000);
        employee2.printemployeedetails();

        EmployeeSimlified employee3 = new EmployeeSimlified();
        employee3.setEmployeeDetails("Amol", 2020, "Shivajinagar", 40000);
        employee3.printemployeedetails();

        EmployeeSimlified employee4 = new EmployeeSimlified();
        employee4.setEmployeeDetails("Sakshi", 2022, "Warje", 60000);
        employee4.printemployeedetails();

        EmployeeSimlified employee5 = new EmployeeSimlified();
        employee5.setEmployeeDetails("Anisa", 2012, "Dattawdi2", 65000);
        employee5.printemployeedetails();


    }}
