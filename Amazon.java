import java.util.*;

class UserList
{
    String name = "";
    String password = "";
    UserList(String name,String password)
    {
        this.name = name;
        this.password = password;
    }
}
class NewMerchantListToApprove
{
    String name;
    String password;
    String product;
    String dateofbirth;
    NewMerchantListToApprove (String name,String password,String product,String dateofbirth)
    {
        this.name = name;
        this.password = password;
        this.product = product;
        this.dateofbirth = dateofbirth;
    }
}
class MerchantList
{
    String name;
    String password;
    String product;
    String dateofbirth;
    public MerchantList(String name,String password,String product,String dateofbirth)
    {
        this.name = name;
        this.password = password;
        this.product = product;
        this.dateofbirth = dateofbirth;
    }
}
class ApproveList
{
    String name;
    String password;
    String product;
    ApproveList(String name, String password, String product)
    {
        this.name = name;
        this.password = password;
        this.product = product;
    }
}
class Amazon
{
    static ArrayList <UserList> us = new ArrayList <> ();
    static ArrayList <MerchantList> ml = new ArrayList <> ();
    static ArrayList <NewMerchantListToApprove> al = new ArrayList <> ();
    static Scanner s = new Scanner(System.in);
    static int n = 0 ,approvalcount = 2, flag = 1;
    static String mn = "",mp = "",pn = "" , dob = "" , adminpassword = "ad",adminsecetcode = "saidc12";
    
    static void mainpage()
    {
        System.out.println("1.Admin login");
        System.out.println("2.User login");
        System.out.println("3.Merchant login");
        System.out.println("4.Exit");
        System.out.print("Enter your choice : "); 
        n = s.nextInt();
        switch(n)
        {
            case 1:
            {
                adminlogin();
                break;
            }
            case 2:
            {
                customerlogin();
                break;
            }
            case 3:
            {
                merchantlogin();
                break;
            }
            case 4:
            {
                System.exit(0);
                break;
            }
            default:
            {
                System.out.println("Invalid input");
                System.out.println("Press enter to continue");
                s.nextLine();
                s.nextLine();
                mainpage();
            }
        }
    }
    static void adminlogin()
    {
        String aname = "";
        String apass = "";
        System.out.println("Admin Login");
        System.out.print("Enter name : ");
        aname = s.next();
        System.out.print("Enter password : ");
        apass = s.next();
        if (aname.equals("Admin") && apass.equals(adminpassword))
        {
            adminmain();
        }
        else
        {
            System.out.println("Incorrect password or user name");
            System.out.println("Press enter to continue");
            s.nextLine();
            s.nextLine();
            backtoadminlogin();
        }
    }
    static void changeadminpassword()
    {
        System.out.print("Enter admin name : ");
        mn = s.next();
        System.out.print("Enter produt developer and admin name with code : ");
        mp = s.next();
        if (mp.equals(adminsecetcode))
        {
            System.out.print("Type your new password : ");
            adminpassword = s.next();
            System.out.println("Pasword changed successfully");
            System.out.println("Press enter to continue");
            s.nextLine();
            s.nextLine();
            adminlogin();
        }
        else
        {
            System.out.println("Invalid code");
            System.out.print("Press enter to continue");
            s.nextLine();
            s.nextLine();
            backtochangeadminpassword();
        }
    }
    static void backtochangeadminpassword()
    {
        System.out.println("Press 1 to try again");
        System.out.println("Press 0 adminlogin");
        System.out.println("Enter your choice : ");
        n = s.nextInt();
        if (n == 1) 
        {
            changeadminpassword(); 
        }
        else if (n == 0) 
        {
            adminlogin();
        }
        else 
        {
            System.out.println("Invalid input to proceed");
            System.out.print("Press enter to continue");
            s.next();
            s.next();
            backtochangeadminpassword();
        }
    }
    static void adminmain()
    {
        System.out.println("1.Show merchant List");
        System.out.println("2.Approve");
        System.out.println("3.Remove Merchant");
        System.out.println("4.Exit");
        System.out.print("Enter your choice : ");
        n = s.nextInt();
        switch(n) 
        {
            case 1:
            {
                showmerchantlist();
                break;
            }
            case 2:
            {
                approval();
                break;
            }
            case 3:
            {
                removemerchant();
                break;
            }
            case 4:
            {
                mainpage();
                break;
            }
            default:
            {
                System.out.println("Enter valid input");
                adminmain();
            }
        }
    }
    static void backtoadminlogin()
    {
        System.out.println("If you forgot password");
        System.out.println("Press 1 to change it");
        System.out.println("Press 0 to try again");
        System.out.println("Enter your choice : ");
        n = s.nextInt();
        switch (n)
        {
            case 0:
            {
                adminlogin();
                break;
            }
            case 1:
            {
                changeadminpassword();
                break;
            }
            default:
            {
                System.out.println("Invalid input");
                System.out.println("Press enter to continue");
                s.nextLine();
                s.nextLine();
                backtoadminlogin();
            }
        }
    }
    static void showmerchantlist()
    {
        System.out.println("Merchant name        Product");
        for (int i = 0 ; i<ml.size() ; i++)
        {
            System.out.println(i+1+". "+ml.get(i).name + "         " + ml.get(i).product);
        }
        System.out.println("Press enter to continue");
        //System.out.println();
        s.nextLine();
        s.nextLine();
        adminmain();
    }
    static void approval()
    {
        if (al.size() > 0)
        {
            for (int i = 0 ; i <al.size() ; i++)
            {
                System.out.println(al.get(i).name + " " + al.get(i).product);
                System.out.println("Enter 1 for approval or 0 for rejection");
                approvalcount = s.nextInt();
                if (approvalcount == 1)
                {
                    String hname = al.get(i).name;
                    String hpassword = al.get(i).password;
                    String hproduct = al.get(i).product;
                    String hdob = al.get(i).dateofbirth;
                    //ml.add(hname,hpassword,hproduct);
                    ml.add(new MerchantList(hname,hpassword,hproduct,hdob));
                    //ml.add(new MerchantList(al.get(i)));
                    al.remove(i);
                    approval();
                }
                else
                {
                    al.remove(i);
                    approval();
                }
            }
        }
        else
        {
            System.out.println("Nothing to give approval");
            System.out.print("Press enter to continue");
            s.nextLine();
            s.nextLine();
            adminmain();
        }
    }
    static void removemerchant()
    {
        System.out.print("Enter the Merchant name to be removed : ");
        mn = s.next();
        for (int i = 0 ; i<ml.size() ; i++)
        {
            if (mn.equals(ml.get(i).name))
            {
                ml.remove(i);
                System.out.println("Merchant removed successfully");
                System.out.print("Press Enter to continue");
                s.nextLine();
                s.nextLine();
                backtoremovemerchantagain();
                break;
            }
        }
    }
    static void backtoremovemerchantagain()
    {
        System.out.println("Press 1 to remove anothor user");
        System.out.println("Press 0 to exit");
        System.out.print("Enter your choice : ");
        n = s.nextInt();
        switch (n)
        {
            case 0:
            {
                adminmain();
                break;
            }
            case 1:
            {
                removemerchant();
                break;
            }
            default:
            {
                System.out.println(n + "is not a valid option");
                System.out.println();
                System.out.println("Enter valid option");
                System.out.print("Press enter to continue");
                s.nextLine();
                s.nextLine();
                backtoremovemerchantagain();
            }
        }
    }
    static void userlogin()
    {
        System.out.println("User Login");
        System.out.print("Enter your name : ");
        mn = s.next();
        System.out.print("Enter your password : ");
        mp = s.next();
        for (int i = 0 ; i<us.size() ; i++)
        {
            if (us.get(i).name.equals(mn) && us.get(i).password.equals(mp))
            {
                System.out.println("Logged in successfully");
                System.out.println("Welcome back "+ us.get(i).name + " !");
                System.out.print("Enter product name you are looking for ");
                s.nextLine();
                s.nextLine();
                break;
            }
            else if (us.get(i).name.equals(mn) && !us.get(i).password.equals(mp))
            {
                System.out.println("Password is incorrect");
                System.out.print("Press enter to continue");
                s.next();
                s.next();
                System.out.println("To try once again");
                System.out.print("Press enter to continue");
                s.next();
                s.next();
                userlogin();
                break;
            }
            else 
            {
                System.out.println("User does not exist");
                System.out.print("Press enter to continue");
                s.next();
                s.next();
                customerlogin();
            }
        }
    }
    static void customerlogin()
    {
        System.out.println("Customer Login");
        System.out.println("1.Login");
        System.out.println("2.Sign up");
        System.out.println("3.Exit");
        System.out.println("Enter your choice : ");
        n = s.nextInt();
        switch(n)
        {
            case 1:
            {
                userlogin();
                break;
            }
            case 2:
            {
                //usersignup();
                break;
            }
            case 3:
            {
                mainpage();
                break;
            }
            default:
            {
                System.out.println("Invalid input");
                System.out.println("Press enter to continue");
                s.nextLine();
                s.nextLine();
                merchantlogin();
            }
        }
    }
    static void merchantlogin()
    {
        System.out.println("Merchant Login");
        System.out.println("1.New Merchant");
        System.out.println("2.Existing Merchant");
        System.out.println("3.Exit");
        System.out.print("Enter your choice : ");
        n = s.nextInt();
        switch(n)
        {
            case 1:
            {
                addmerchant();
                break;
            }
            case 2:
            {
                existingmerchant();
                break;
            }
            case 3:
            {
                mainpage();
                break;
            }
            default:
            {
                System.out.println("Invalid input");
                System.out.println("Press enter to continue");
                s.nextLine();
                s.nextLine();
                merchantlogin();
            }
        }
    }
    static void addmerchant()
    {
        System.out.println("Add Merchant");
        System.out.print("Enter name : ");
        mn = s.next();
        System.out.print("Create your password : ");
        mp = s.next();
        System.out.print("Enter product name : ");
        pn = s.next();
        System.out.println("Enter your product lanuched date in ddmmyyyy format ");
        System.out.println("For example : If product launched date id 12/11/2001");
        System.out.println("Then enter date as 12112001");
        System.out.print("Enter your product lanuched date :");
        pn = s.next();
        al.add(new NewMerchantListToApprove(mn,mp,pn,dob));
        System.out.println("Your request for adding account is Sucess and it will get approved soon");
        System.out.println("Press enter to continue");
        s.nextLine();
        s.nextLine();
        adminmain();
    }
    static void existingmerchant()
    {
        System.out.println("Existing Merchant Login");
        System.out.print("Enter Merchant name : ");
        mn = s.next();
        System.out.print("Enter your password : ");
        mp = s.next();
        for (int i = 0 ; i<ml.size() ; i++)
        {
            if (ml.get(i).name.equals(mn) && ml.get(i).password.equals(mp))
            {
                flag = 0;
                System.out.println("Logged in successfully");
                System.out.println("Your product is "+ml.get(i).product);
                System.out.println("Press Enter to continue");
                s.nextLine();
                s.nextLine();
                break;
            }
        }
        if (flag == 1)
        {
            System.out.println("User does not exist");
            System.out.print("Press enter to continue");
            s.next();
            s.next();
            merchantlogin();
        }
        mainpage();
    }
    public static void main (String [] ll)
    {
        us.add(new UserList("sai","1"));
        us.add(new UserList("raja","2"));
        us.add(new UserList("pathi","3"));
        us.add(new UserList("vel","4"));
        
        ml.add(new MerchantList("Sai","1","Laotop","12122001"));
        ml.add(new MerchantList("Flatmaker","2","Laptop","12122009"));
        ml.add(new MerchantList("Udhayam","3","Ghee","14122003"));
        mainpage();
    }
}