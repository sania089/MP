package movietickets;
import java.util.Vector;
public class display extends user
{
    private int total;
    public display(String name,String cnumber,String moviename,String timings,String category,int n)
    {
        super(name,cnumber,moviename,timings,category,n);

    }
    public void displaydetails()
    {
        System.out.println("Name: "+name);
        System.out.println("Contact Number: "+cnumber);
        System.out.println("Movie Name: "+moviename);
        System.out.println("Timings: "+timings);
        System.out.println("Category: "+category);
        System.out.println("Number of tickets: "+n);
    } 

    public static void compare(Vector <display> v,String name1)
    {
        int pos=0;
        for(int i=0;i<v.size();i++)
        {
            if(v.get(i).name.equals(name1))
            {
                v.remove(i);
                System.out.print("Cancellation Successful");
                System.out.println(" ");
                break;
            }
        }
    }

    public static int compare(String name1,Vector <display> v)
    {
        int pos=0;
        for(int i=0;i<v.size();i++)
        {
            if(v.get(i).name.equals(name1))
            {
                pos = i;
                break;
            }
        }
        return(pos);
    }

    public int getPrice()
    {
        if(category.equals("Royal Recliner"))
        {
            total= 350*n;
        }
        else if(category.equals("Royal"))
        {
            total= 300*n;
        }
        else if(category.equals("Club"))
        {
            total= 200*n;
        }
        else if(category.equals("Executive"))
        {
            total= 170*n;
        }
        return total;
    } 
}