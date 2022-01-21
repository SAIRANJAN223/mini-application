import java.util.*;

class UserList
{
    String name = "";
    String password = "";
    String code = "";
    String bal = "";
    String statement = "";
    UserList(String name,String password,String code,String bal,String statement)
    {
        this.name = name;
        this.password = password;
        this.code = code;
        this.bal = bal;
        this.statement = statement;
    }
}
class ATM
{
    static ArrayList <UserList> us = new ArrayList <> ();
    static Scanner s = new Scanner (System.in);
    static int e = 0 , tth = 10 , fh = 11, th = 12, h = 13 , g = 0, w = 0 , b= 0, cashinatm = (2000*tth)+(500*fh)+(100*h)+(200*th),ch = 0 , pp = 0 , dat = 0, index = 0,index2 = 0, flag = 0,ad = 0;
    static String k = "",k1 = "", c = "" ,d = "",q = "";
    static void mainpage()
    {
        System.out.println();
        System.out.println("           CANARA BANK");
        System.out.println();
        System.out.println("1.Admin Login");
        System.out.println("2.User Login");
        System.out.println("3.Exit");
        System.out.println();
        System.out.print("Enter your choice : ");
        ch = s.nextInt();
        String c = "";
        int d = 0;
        switch(ch)
        {
            case 1:
            {
                adminlogin();
                break;
            }
            case 2:
            {
                userlogin();
                break;
            }
            case 3:
            {
                System.out.print("\033[H\033[2J");  
                System.out.flush();
                System.exit(0);
                break;
            }
            default:
            {
                System.out.print("\033[H\033[2J");  
                System.out.flush();
                System.out.println("Invalid Input");
            }
        }
    }
    static void adminlogin()
    {
        System.out.println();
        System.out.print("Admin Name : ");
        c = s.next();
        System.out.print("Admin password: ");
        e = s.nextInt();
        System.out.println();
        
        if (c.equals("S") && e == 1)
        {
            System.out.println("             Logged in Successfully");
            System.out.println();
            adminoption();
        }
        else
        {
            System.out.println("admin id or Password incorrect");
            System.out.println();
            s.nextLine();
            s.nextLine();
            mainpage();
        }
    }
    static void adminoption()
    {
        System.out.println("1.Add Amount");
        System.out.println("2.Show");
        System.out.println("3.Exit");
        System.out.println();
        System.out.print("Enter choice : ");
        g = s.nextInt();
        switch(g)
        {
            case 1:
            {
                add();
                break;
            }
            case 2:
            {
                show();
                break;
            }
            case 3:
            {
                System.out.print("\033[H\033[2J");  
                System.out.flush();
                mainpage();
                break;
            }
            default:
            {
                System.out.println ("Enter valid input");
            }
        }
        System.out.println();
    }
    static void add()
    {
        System.out.print("\033[H\033[2J");  
        System.out.flush();
        System.out.println("         Enter the Amount");
        System.out.print("2000 : ");
        tth = tth + s.nextInt();
        System.out.print("500  : ");
        fh = fh + s.nextInt();
        System.out.print("200  : ");
        th = th + s.nextInt();
        System.out.print("100  : ");
        h = h + s.nextInt();
        cashinatm = (2000*tth)+(500*fh)+(100*h)+(200*th);
        System.out.println();
        System.out.println("Amount added Sucessfully");
        System.out.println();
        adminoption();
    }
    static void show()
    {
        System.out.print("\033[H\033[2J");  
        System.out.flush();
        System.out.println("No of 2000 : " + tth);
        System.out.println("No of 500 : " + fh);
        System.out.println("No of 200 : " + th);
        System.out.println("No of 100 : " + h);
        System.out.println();
        System.out.println("Amount in ATM :" + ((2000*tth)+(500*fh)+(100*h)+(200*th)));
        System.out.println();
        adminoption();
    }
    static void userlogin()
    {
        System.out.println();
        System.out.println("              USER LOGIN");
        System.out.println();
        System.out.print("User Name : ");
        c = s.next();
        System.out.print("User password : ");
        d = s.next();
        System.out.println();
        for (int i = 0 ; i<us.size() ; i++)
        {
            index = i;
            if (us.get(i).name.equals(c) && us.get(i).password.equals(d))
            {
                flag = 1;
                System.out.println("Welcome "+ us.get(i).name + " !");
                useroption();
                break;
            }
        }
        if (flag == 0)
        {
            System.out.println("User does not exist");
            System.out.println("Press enter to continue");
            s.nextLine();
            s.nextLine();
            mainpage();
        }
    }
    static void useroption()
    {
        System.out.println();
        System.out.println("           USER OPTIONS");
        System.out.println();
        System.out.println("1.Withdraw Amount");
        System.out.println("2.Balance");
        System.out.println("3.Deposit");
        System.out.println("4.Mini statement");
        System.out.println("5.Funds in ATM");
        System.out.println("6.Amount transfer");
        System.out.println("7.Exit");
        System.out.println();
        System.out.print("Enter choice : ");
        g = s.nextInt();
        System.out.println();
        switch(g)
        {
            case 1:
            {
                withdrawal();
                break;
            }
            case 2:
            {
                balance();
                break;
            }
            case 3:
            {
                deposit();
                break;
            }
            case 4:
            {
                ministatement();
                break;
            }
            case 5:
            {
                fundsinatm();
                break;
            }
            case 6:
            {
                transfer();
                break;
            }
            case 7:
            {
                System.out.print("\033[H\033[2J");  
                System.out.flush();
                mainpage();
                break;
            }
            default:
            {
                System.out.println ("Enter valid input");
                s.nextLine();
                s.nextLine();
                useroption();
                break;
            }
        }
        System.out.println();
    }
    static void withdrawal()
    {
        int ytth = 0, yfh = 0 , yh = 0 , yth = 0;
        System.out.print("Enter withdraw Amount : ");
        w = s.nextInt();
        ad = w;
        System.out.println();
        if (w<10000)
        {
            b = Integer.parseInt(us.get(index).bal);
            if (w>b)
            {
                System.out.println("       Low balance in your account");
                System.out.println("       Press Enter to go to Useroptions");
                System.out.println();
                s.nextLine();
                s.nextLine();
                useroption();
            }
            else if (cashinatm<w)  
            {
                System.out.println("       Insufficient funds in ATM");
                System.out.println();
                System.out.println("       Press Enter to go to Useroptions");
                System.out.println();
                s.nextLine();
                s.nextLine();
                useroption();
            }
            else
            {
                while (w>0)
                {
                    //System.out.print(b + "b");
                    //System.out.print(w + "w");
                    if (w%2000 == 0 && tth>0)
                    {
                        tth--;
                        ytth++;
                        w = w - 2000;
                        //System.out.println(tth +  ytth);
                    }
                    else if(w%500 == 0 && fh>0)
                    {
                        fh--;
                        yfh++;
                        w = w - 500;
                    }
                    else if (w%200 == 0 && th>0)
                    {
                        th--;
                        yth++;
                        w = w - 200;
                    }
                    else if (w%100 == 0 && h>0)
                    {
                        h--;
                        yh++;
                        w = w - 100;
                    }
                    else 
                    {
                        System.out.println("Enter values in 100's or enter amount according to amount in machine");
                        System.out.println();
                        System.out.println("Press enter to continue");
                        s.nextLine();
                        s.nextLine();
                        useroption();
                        break;
                    }
                }
                b = b - ad;
                us.get(index).bal = String.valueOf(b);
                cashinatm  = cashinatm - w;
                us.get(index).statement = us.get(index).statement + "Withdrawed-" + ad + " ";
                System.out.println("Collect 2000 : " + ytth);
                System.out.println("Collect 500  : " + yfh);
                System.out.println("Collect 200  : " + yth);
                System.out.println("Collect 100  : " + yh);
                System.out.println();
                System.out.println("Press enter to continue");
                s.nextLine();
                s.nextLine();
                useroption();
            }
        }
        else
        {
            System.out.println("Maximum amount to be withdraw at a time is 10000");
            System.out.println("Press enter to continue");
            s.nextLine();
            s.nextLine();
            useroption();
        }
        
    }
    static void balance()
    {
        b = Integer.parseInt(us.get(index).bal);
        System.out.println("Your current balance is : " + b);
        //System.out.println("Press enter to continue");
        System.out.println();
        s.nextLine();
        s.nextLine();
        useroption();
    }
    static void deposit()
    {
        int da = 0;
        int utth = 0 , ufh = 0 , uth = 0 , uh = 0;
        System.out.print("Enter no of 2000 : ");
        utth = s.nextInt();
        tth = tth + utth;
        System.out.print("Enter no of 500 : ");
        ufh = s.nextInt();
        fh = fh + ufh;
        System.out.print("Enter no of 200 : ");
        uth = s.nextInt();
        th = th + uth;
        System.out.print("Enter no of 100 : ");
        uh = s.nextInt();
        h = h + uh;
        da = (2000*utth) + (500*ufh) + (200*uth) + (100*uh);
        b = b + da;
        cashinatm = cashinatm + da;
        us.get(index).bal = String.valueOf(b);
        us.get(index).statement = us.get(index).statement + "Deposited-" + da + " ";
        System.out.println(da + "is added to your account");
        System.out.println ("Amount added Successfully");
        balance();
    }
    static void ministatement()
    {
        System.out.println("MINI STATEMENT");
        String x = us.get(index).statement;
        String [] t = new String[x.length()];
        t = x.split("\\s");
        if(t.length == 0)
        {
            System.out.print("You havn't done any traction.");
        }
        else if (t.length > 5)
        {
            for (int i = t.length-1 ; i>=(t.length-1)-5 ; i--)
            {
                System.out.println(t[i]);
            }
        }
        else
        {
                for (int i = t.length-1 ; i>=0 ; i--)
                {
                    System.out.println(t[i]);
                }
        }
        s.nextLine();
        s.nextLine();
        useroption();
    }
    static void fundsinatm()
    {
        cashinatm = ((2000*tth)+(500*fh)+(100*h)+(200*th));
        System.out.print("Funds in ATM : "+ cashinatm);
        System.out.println();
        System.out.println("Press enter to continue");
        s.nextLine();
        s.nextLine();
        useroption();
    }
    static void transfer()
    {
        //System.out.print("Enter the amount to be transfered : ");
        //g = s.next();
        System.out.println("          AMOUNT TRANSFER");
        System.out.println();
        System.out.print("Enter the receiver account code : ");
        c = s.next();
        System.out.println();
        for (int i = 0 ; i<us.size() ; i++)
        {
            index2 = i;
            if (us.get(i).code.equals(c))
            {
                flag = 1;
                String ahn  = us.get(i).name;
                System.out.println("Account holder name is " + ahn );
                System.out.println();
                System.out.print("Enter the amount to be transfered : ");
                g = s.nextInt();
                System.out.println();
                System.out.println(g + " will be transfer from your account");
                System.out.println();
                System.out.println("To proceed the transaction press 1 else press any key to exit");
                int r = s.nextInt();
                b = Integer.parseInt(us.get(index).bal);
                k = us.get(index).code;
                q = k.substring(0,3);
                k1 = us.get(index2).code;
                if(r == 1)
                {
                    if (g<=10000)
                    {
                        if (b>g)
                        {
                            if (k1.contains(q))
                            {
                                us.get(index2).bal = String.valueOf(Integer.parseInt(us.get(index2).bal) + g);
                                us.get(index).bal = String.valueOf(Integer.parseInt(us.get(index).bal) - g);
                                System.out.println("Amount transfered sucessfully");
                                s.nextLine();
                                s.nextLine();
                            }
                            else
                            {
                                us.get(index2).bal = String.valueOf(Integer.parseInt(us.get(index2).bal) + g);
                                us.get(index).bal = String.valueOf(Integer.parseInt(us.get(index).bal) - g - 10);
                                System.out.println("Amount transfered sucessfully");
                                s.nextLine();
                                s.nextLine();
                            }
                        }
                        else
                        {
                            System.out.print("Insufficient funds in your account for.");
                            s.nextLine();
                            s.nextLine();
                        }
                    }
                    else
                    {
                        System.out.println("Maximum amount to be transfered at a time is 10000");
                        s.nextLine();
                        s.nextLine();
                    }
                }
                useroption();
            }
        }
        if (flag == 0)
        {
            System.out.println("Account not found");
            System.out.println("Press enter to continue");
            s.nextLine();
            s.nextLine();
        }
        System.out.print("\033[H\033[2J");  
        System.out.flush();
        useroption();
    }
    public static void main (String [] ll)
    {
        us.add(new UserList("sai","1","SBI001","30000"," "));
        us.add(new UserList("raja","2","IOB001","40000"," "));
        us.add(new UserList("pathi","3","SBI002","10000"," "));
        us.add(new UserList("vel","4","IOB002","3000"," "));
        mainpage();
    }
}