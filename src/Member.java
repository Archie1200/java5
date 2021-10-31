import java.util.Scanner;

public class Member {
    public String Name;
    public int age;
    public int phno;
    public String address;
    public int sal;
    public void printSalary(){
        System.out.println(sal);
    }
}
class Employee extends Member{
    public String specialisation;
    public String department;
    Employee(){
        specialisation="Artificial Intelligence";
        department="Computer Science";
    }
    public void display1(){
        System.out.println(Name+","+age+","+phno+","+address+","+specialisation+","+department);
    }
}
class Manager extends Member{
    public String specialisation;
    public String department;
    Manager(){
        specialisation="Machine Learning";
        department="Software engineering";
    }
    public void display2(){
        System.out.println(Name+","+age+","+phno+","+address+","+specialisation+","+department);
    }
}
class Test{
    public static void main(String[] args) {
        Employee obj1 = new Employee();
        obj1.Name="Abc";
        obj1.address="Radhika Vihar";
        obj1.sal=450000;
        obj1.phno=98378299;
        obj1.age=20;
        obj1.display1();
        obj1.printSalary();
        Manager obj2= new Manager();
        obj2.Name="Xyz";
        obj2.address="Pratap Nagar";
        obj2.sal=500000;
        obj2.phno=8839943;
        obj2.age=24;
        obj2.display2();
        obj2.printSalary();
    }
}