import java.util.*;
class Main1
{  
public static void main(String args[])
{  
PriorityQueue cities_queue=new PriorityQueue();  
cities_queue.add("Sydney");  
cities_queue.add("Venice");  
cities_queue.add("New York");  
cities_queue.add("California");  
cities_queue.add("Melbourne");  
System.out.println("PriorityQueue Head:"+cities_queue.element());  
System.out.println("\nPriorityQueue contents:");  
Iterator iter=cities_queue.iterator();  
while(iter.hasNext())
{ 
System.out.print(iter.next() + " ");  
}  
}  
}

output
======

LinkedList: [Java, Python, JavaScript, Kotlin]