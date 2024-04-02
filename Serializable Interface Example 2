package Haviya;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Employee implements Serializable{

private int id;
private String firstName;
private String lastName;
private int salary;
public Employee(int id, String firstName, String lastName, int salary) {
super();
this.id = id;
this.firstName = firstName;
this.lastName = lastName;
this.salary = salary;
}
public int getId() {
return id;
}
public String getFirstName() {
return firstName;
}
public String getLastName() {
return lastName;
}
public String getName(){
return firstName+" "+lastName;
}

public int getSalary() {
return salary;
}
public int getAnnualSalary(){
return this.salary*12;
}
public void setSalary(int salary) {
this.salary = salary;
}
public int raisesalary(int percent){
return salary+((salary/100)*percent);
}
@Override
public String toString() {
return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", salary=" + salary + "]";
}
public static void main(String[] args){
try{
FileOutputStream fos=new FileOutputStream("result.txt");
ObjectOutputStream oos=new ObjectOutputStream(fos);
Employee e1=new Employee(233,"Diya","Shree",100000);
oos.writeObject(e1);
FileInputStream fis=new FileInputStream("result.txt");
ObjectInputStream ois=new ObjectInputStream(fis);
Employee e2=(Employee)ois.readObject();
System.out.println(e2.getId()+" "+e2.getName()+" "+e2.getSalary());
}
catch(ClassNotFoundException e){
System.out.println(e);
}
catch(IOException e)
{
System.out.println(e);
}

}

}
