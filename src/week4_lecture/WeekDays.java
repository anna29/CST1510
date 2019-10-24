/*
 *
 */
package week4_lecture;

/**
 *
 * @author Anna29
 */
class WeekDays
{
    public static void main(String s[])
    {
        int day = 100;
        
        switch(day)
        {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            default:
                System.out.println("Weekend");
                break;
        }
    }
}
