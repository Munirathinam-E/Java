package Haviya;

import java.util.Scanner;

class ThreadDemo2 extends Thread{
int num;
public void run()
{
	Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number:");
    num=sc.nextInt();
    if(num%2==0) {
    	System.out.println("The Given number "+num+" is Even:");
    }
    else {
    	System.out.println("The Given number "+num+" is Odd:");
        
    }
}
}


class ThreadDemo3 extends Thread{
int num1,num2,num3;
public void run(){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter three Numbers:");
	num1=sc.nextInt();
	num2=sc.nextInt();
	num3=sc.nextInt();
	if(num1>=num2 && num1>=num3) {
		if(num2>=num3) {
			System.out.println("The Ascending Order:"+num3+" "+num2+" "+num1);
			System.out.println("The Descending Order:"+num1+" "+num2+" "+num3);
		}
		else {
			System.out.println("The Ascending Order:"+num2+" "+num3+" "+num1);
			System.out.println("The Descending Order:"+num1+" "+num3+" "+num2);
		}
	}
	else if(num2>=num3 && num2>=num1) {
		if(num3>=num1) {
			System.out.println("The Ascending Order:"+num1+" "+num3+" "+num2);
			System.out.println("The Descending Order:"+num2+" "+num3+" "+num1);
		}else {
			System.out.println("The Ascending Order:"+num3+" "+num1+" "+num2);
			System.out.println("The Descending Order:"+num2+" "+num1+" "+num3);
		}
	}
	else {
		if(num2>=num1) {
			System.out.println("The Ascending Order:"+num1+" "+num2+" "+num3);
			System.out.println("The Descending Order:"+num3+" "+num2+" "+num1);
		}else {
			System.out.println("The Ascending Order:"+num2+" "+num1+" "+num3);
			System.out.println("The Descending Order:"+num3+" "+num1+" "+num2);
		}

	}
 }
}

public class MyThread2 {
public static void main(String[] args) throws InterruptedException {
	ThreadDemo2 t1=new ThreadDemo2();
	t1.start();
	t1.join();
	ThreadDemo3 t2=new ThreadDemo3();
	t2.start();
}
}
