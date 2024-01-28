public class Employee {

int employeeId;
int salary;
String dept;

Employee(int empid, int sal, String d) {

employeeId=empid;
salary=sal;
dept =d;
}
public static void main(String[] args) {

Employee shiva = new Employee (101,3000, "Testing");

Employee naga = new Employee (102,5000, "Engineering");

System.out.println(shiva.employeeId+" Salary "+shiva.salary+" Dept "+shiva.dept);

System.out.println(naga.employeeId+" Salary "+naga.salary+" Dept "+naga.dept);
}
}
