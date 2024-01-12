import java.util.*;
import movietickets.*; 
class NumException extends Exception
{
    String cnumber;
    NumException(String cnumber)
    {
       this.cnumber = cnumber;
    }
    public String toString()
    {
      return "Please Enter valid Phone Number";
    }
}
public class Main
{
    public static void main(String args[])
    { 
        Random random = new Random();
        String name,cnumber,moviename="",category="",timings="";
        int n,ch,mnch,cch,tch,randomint,c=0;
        Vector<display> v = new Vector<display>(); 
        Scanner sc=new Scanner(System.in); 
        System.out.println("\t 'Movie Ticket Booking System' \n");
        while(true)
        {
            System.out.println("1.Book Tickets");
            System.out.println("2.Cancel Tickets");
            System.out.println("3.Display All Records");
            System.out.println("4.Display a specific record");
            System.out.println("5.EXIT");
            System.out.println("Enter Choice: ");
            ch = sc.nextInt();
            switch(ch)
            {
                case 1: 
                    System.out.println("Enter name:  "); 
                    name = sc.next();
                    System.out.println("Enter contact number: "); 
                    cnumber = sc.next();
                    try 
                    {
                        if(cnumber.length() < 10)
                        throw new NumException(cnumber);
                        else
                        {
                            randomint = random.nextInt(2);
                            if (randomint == 0)
                            {
                                System.out.println("1.Wakanda Forever");
                                System.out.println("2.Black Adam");
                                System.out.println("3.Drishyam 2");
                                System.out.println("4.Enola Holmes 2");
                                System.out.println("5. Bhediya");
                                System.out.println("\nEnter Choice: ");
                                mnch = sc.nextInt();
                                if (mnch == 1)
                                moviename = "Wakanda Forever";
                                else if(mnch == 2)
                                    moviename = "Black Adam";
                                else if(mnch == 3)
                                    moviename = "Drishyam 2";
                                else if(mnch == 4)
                                    moviename = "Enola Holmes 2";
                                else if(mnch == 5)
                                    moviename = "Bhediya";
                                else 
                                {
                                    c = c + 1;
                                    System.out.println("Invalid Choice");
                                    break;
                                }
                            }
                            if (randomint == 1)
                            {
                                System.out.println("1.Thor: Love and Thunder");
                                System.out.println("2.Bones and All");
                                System.out.println("3.Glass Onion: A Knives Out");
                                System.out.println("4.Bullet Train");
                                System.out.println("5.Armageddon Time");
                                System.out.println("\nEnter Choice: ");
                                mnch = sc.nextInt();
                                if (mnch == 1)
                                moviename = "Thor: Love and Thunder";
                                else if(mnch == 2)
                                    moviename = "Bones and All";
                                else if(mnch == 3)
                                    moviename = "Glass Onion: A Knives Out";
                                else if(mnch == 4)
                                    moviename = "Bullet Train";
                                else if(mnch == 5)
                                    moviename = "Armageddon Time";
                                else 
                                {
                                    c = c + 1;
                                    System.out.println("Invalid Choice");
                                    break;
                                }
                            }
                            if (randomint == 2)
                            {
                                System.out.println("1.Strange World");
                                System.out.println("2.Top Gun Maverick");
                                System.out.println("3.The Batman");
                                System.out.println("4.Dune Part 1");
                                System.out.println("5.The Suicide Squad");
                                System.out.println("\nEnter Choice: ");
                                mnch = sc.nextInt();
                                if (mnch == 1)
                                moviename = "Thor: Love and Thunder";
                                else if(mnch == 2)
                                    moviename = "Top Gun Maverick";
                                else if(mnch == 3)
                                    moviename = "The Batman";
                                else if(mnch == 4)
                                    moviename = "Dune Part 1";
                                else if(mnch == 5)
                                    moviename = "The Suicide Squad";
                                else 
                                {
                                    c = c + 1;
                                    System.out.println("Invalid Choice");
                                    break;
                                }
                            }
                            System.out.println("1. 12pm");
                            System.out.println("2. 4pm");
                            System.out.println("3. 8pm");
                            System.out.println("4. 10pm");
                            System.out.println("\nEnter Choice: ");
                            tch = sc.nextInt();
                            if (tch == 1)
                                timings = "12pm";
                            else if(tch == 2)
                                timings = "4pm";
                            else if(tch == 3)
                                timings = "8pm";
                            else if(tch == 4)
                                timings = "10pm";
                            else 
                            {
                                c = c + 1;
                                System.out.println("Invalid Choice");
                                break;
                            }
                            System.out.println("\n\n");
                            System.out.println("Seat arrangement");
                            System.out.println("\n");
                            System.out.println("          Royal Recliner");
                            System.out.println("  * * * * * * * * * * * * * * *  Row A");
                            System.out.println("       * * * * * * * * * * Row B\n");
                            System.out.println("              Royal");
                            System.out.println("  * * * * * * * * * * * * * * *  Row C");
                            System.out.println("       * * * * * * * * * * Row D\n");
                            System.out.println("             Club");
                            System.out.println("  * * * * * * * * * * * * * * *  Row E");
                            System.out.println("       * * * * * * * * * * Row F\n");
                            System.out.println("            Executive");
                            System.out.println("  * * * * * * * * * * * * * * *  Row G");
                            System.out.println("       * * * * * * * * * * Row H\n");
                            System.out.println("\n");
                            System.out.println("_____________");
                            System.out.println("              Screen");
                            System.out.println("\n\n");
                            System.out.println("1. Royal Recliner (Rs.350)");
                            System.out.println("2. Royal (Rs.300)");
                            System.out.println("3. Club (Rs.200)");
                            System.out.println("4. Executive (Rs.170)");
                            System.out.println("\nEnter Choice: ");
                            cch = sc.nextInt();
                            System.out.println("Enter number of ticket: "); 
                            n=sc.nextInt();
                            if (cch == 1)
                                category = "Royal Recliner";
                            else if(cch == 2)
                                category = "Royal";
                            else if(cch == 3)
                                category = "Club";
                            else if(cch == 4)
                                category = "Executive";
                            else 
                            {
                                c = c + 2;
                                System.out.println("Invalid Choice");
                                break;
                            }
                            if(c!=3)
                            {
                                v.add(new display(name,cnumber,moviename,timings,category,n));
                                System.out.println("Booking Successful");
                                System.out.println(" ");
                            }
                        }
                    } 
                    catch(NumException e)
                    {
                        System.out.println(e.toString());
                    }
                    break;
                case 2:
                    String delname;
                    System.out.println("Enter name: ");
                    delname=sc.next();
                    display.compare(v,delname);
                    break;
                case 3:
                    for (int i=0;i<v.size();i++)
                    {
                        v.get(i).displaydetails();
                        System.out.println("Total Price:"+v.get(i).getPrice());
                        System.out.println("");
                    }
                    break;
                case 4:
                    String sname;
                    int c2=0,pos=0;
                    System.out.println("Enter name: ");
                    sname = sc.next();
                    pos = display.compare(sname,v);
                    v.get(pos).displaydetails();
                    System.out.println("Total Price:"+v.get(pos).getPrice());
                    System.out.println("");
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}