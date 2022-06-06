import java.util.*;
class OverloadDemo 
{
void area(float x)
{
System.out.println(&quot;the area of the square is &quot;+Math.pow(x, 2)+&quot; sq units&quot;);
}
void area(float x, float y)
{
System.out.println(&quot;the area of the rectangle is &quot;+x*y+&quot; sq units&quot;);
}
void area(double x)
{
double z = 3.14 * x * x;

System.out.println(&quot;the area of the circle is &quot;+z+&quot; sq units&quot;);
}
public static void main(String args[])
{
OverloadDemo ob = new OverloadDemo();
ob.area(5);
ob.area(11,12);
ob.area(2.5);
}
}