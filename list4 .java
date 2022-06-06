import java.util.*;
import java.io.*; 
class A extends Thread 
{ 
public void run() 
{ 
for (int i = 1; i <= 5; i++) 
{ 
System.out.println(i + "*"+5+ "="+(i * 5)); 
} 
System.out.println("END OF THE 1st THREAD");
 } }
 class B extends Thread 
{ 
public void run() 
{
 for (int j = 1; j <= 7; j++)
 {
 System.out.println(j + "*" +7+ "=" +(j * 7)); 
} 
System.out.println("END OF THE 2st THREAD");
 } } 
class C extends Thread 
{
 public void run() 
{
 for (int k = 1; k <= 13; k++)
 { 
System.out.println(k + "*" +13+ "=" +(k * 13)); 
}
 System.out.println("END OF THE 3st THREAD"); 
} }
 public class list4 
{ 
public static void main(String args[])throws IOException
 {
 A ThreadA=new A(); B ThreadB=new B();
 C ThreadC=new C(); 
ThreadA.setPriority(Thread.MAX_PRIORITY); ThreadB.setPriority(Thread.NORM_PRIORITY); ThreadC.setPriority(Thread.MIN_PRIORITY);
 ThreadA.start(); 
ThreadB.start(); 
ThreadC.start(); 
} } 
