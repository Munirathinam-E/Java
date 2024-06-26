package Haviya;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
public class Circle implements Serializable {
private int radius;
private double diameter;
private double area;
public Circle() {
super();
this.radius =1;
this.diameter =2*Math.PI*radius;
this.area = Math.PI*radius*radius;
}
public int getRadius() {
return radius;
}
public void setRadius(int radius) {
this.radius = radius;
this.diameter =2*Math.PI*radius;
this.area = Math.PI*radius*radius;
}
@Override
public String toString() {
return "Circle [radius=" + radius + ", diameter=" + diameter + ", area=" + area + "]";
}
public static void main(String[] args) {
try{
FileOutputStream fos=new FileOutputStream("circle.dat");
ObjectOutputStream oos=new ObjectOutputStream(fos);
Circle c1=new Circle();
Circle c2=new Circle();
c2.setRadius(2);
Circle c3=new Circle();
c3.setRadius(3);
oos.writeObject(c1);
oos.writeObject(c2);
oos.writeObject(c3);
FileInputStream fis=new FileInputStream("circle.dat");
ObjectInputStream ois=new ObjectInputStream(fis);
Circle c4=(Circle)ois.readObject();
System.out.println(c4);
Circle c5=(Circle)ois.readObject();
System.out.println(c5);
Circle c6=(Circle)ois.readObject();
System.out.println(c6);
}
catch(ClassNotFoundException e){
System.out.println(e);
}
catch(IOException e){
System.out.println(e);
}

}
}
