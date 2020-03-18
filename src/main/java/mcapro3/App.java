package mcapro3;

public class App 
{
    public static void main( String[] args )
    {
       int year = 2004;
               /* w w  w.ja  v  a2  s .  c o m*/
                if((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)))
                        System.out.println("Year " + year + " is a leap year");
                else
                        System.out.println("Year " + year + " is not a leap year");
    }
}
