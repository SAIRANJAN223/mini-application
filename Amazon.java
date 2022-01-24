import java.util.*;

class Addtocart
{
    String productname = "";
    String productid = "";
    String userid = "";
    String productprice = "";

    Addtocart (String productname,String productid,String userid,String productprice)
    {
        this.productname = productname;
        this.productid = productid;
        this.userid = userid;
        this.productprice = productprice;
    }
}
class OrderHistory 
{
    String userid = "";
    String productid = "";
    String productname = "";
    String productprice = "";

    OrderHistory (String productname,String productid,String userid,String productprice)
    {
        this.productname = productname;
        this.productid = productid;
        this.userid = userid;
        this.productprice = productprice;
    }
}
class User
{
    String name = "";
    String password = "";
    String walletbalance = "";
    String userid = "";

    User(String name,String password,String walletbalance,String userid)
    {
        this.name = name;
        this.password = password;
        this.walletbalance = walletbalance;
        this.userid = userid;
    }
}
class Merchantapproval
{
    String name = "";
    String productcategory = "";
    String password = "";
    String merchantid = "";
    String productname = "";
    String productid = "";
    String productprice = "";
    String quantity = "";
    String discount = "";

    Merchantapproval(String name, String productcategory, String password, String merchantid, String productname, String productid, String productprice, String quantity, String discount)
    {
        this.name = name;
        this.productcategory = productcategory;
        this.password = password;
        this.merchantid = merchantid;
        this.productname = productname;
        this.productid = productid;
        this.productprice = productprice;
        this.quantity = quantity;
        this.discount = discount;
    }
}
class Merchant
{
    String name = "";
    String password = "";
    String productcategory = "";
    String merchantid = "";
    String productname = "";
    Merchant(String name,String password,String productcategory, String merchantid, String productname)
    {
        this.name = name;
        this.password = password;
        this.productcategory = productcategory;
        this.merchantid = merchantid;
        this.productname  = productname;
    }
}
class Product
{
    String merchantid = "";
    String productcategory = "";
    String productid = "";
    String productname = "";
    String productprice = "";
    String quantity = "";
    String discount = "";
    String sold = "";

    Product (String merchantid, String productcategory, String productid, String productname, String productprice, String quantity, String discount, String sold)
    {
        this.merchantid = merchantid;
        this.productcategory = productcategory;
        this.productid = productid;
        this.productname = productname;
        this.productprice = productprice;
        this.quantity = quantity;
        this.discount = discount;
        this.sold = sold;
    }
}
class Amazon
{
    static Scanner s = new Scanner (System.in);
    static ArrayList <Merchant> mer = new ArrayList <> ();
    static ArrayList <Product> pro = new ArrayList <> ();
    static ArrayList <Merchantapproval> merapp = new ArrayList <> ();
    static ArrayList <User> user = new ArrayList <> ();
    static ArrayList <Addtocart> addtocart = new ArrayList <>();
    static ArrayList <OrderHistory> orderhistory = new ArrayList <>();
    static ArrayList <String> procat = new ArrayList <> ();
    static int choicenumber = 0,c = 0,position = 0,proidindex = 0,useridindex = 0,dd = 0,amount = 0;
    static String name = "",password = "",npassword = "",procatname = "",proname = "",quantity = "",discount = "",productid = "",proprice = "",balance = "";
    static void mainpage()
    {
        clear();
        System.out.println ("        Welcome to Amazon");
        System.out.println ();
        System.out.println ("1. Admin Login");
        System.out.println ("2. Merchant Login");
        System.out.println ("3. User Login");
        System.out.println();
        System.out.print("Enter your choice : ");
        choicenumber = s.nextInt();
        
        switch (choicenumber)
        {
            case 1:
            {
                adminlogin();
                break;
            }
            case 2:
            {
                merchantlogin();
                break;
            }
            case 3:
            {
                userlogin();
                break;
            }
            default:
            {
                System.out.println("Invalid input");
                System.out.println();
                System.out.print("Press enter to continue");
                s.nextLine();
                s.nextLine();
                clear();
                merchantlogin();
            }
        }
    }
    static void userlogin()
    {
        clear();
        System.out.println("                 User Login");
        System.out.println();
        System.out.println("1. New User");
        System.out.println("2. Existing  User");
        System.out.println("3. Home");
        System.out.println();
        System.out.print("Enter your choice : ");
        choicenumber = s.nextInt();

        switch (choicenumber)
        {
            case 1: 
            {
                newuser();
                break;
            }
            case 2: 
            {
                existinguserlogin();
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
                System.out.println();
                System.out.print("Press enter to continue");
                s.nextLine();
                s.nextLine();
                clear();
                userlogin();
            }
        }
    }
    static void existinguserlogin()
    {
        clear();
        System.out.println("                Existing User");
        System.out.println();
        System.out.print("Enter your name     : ");
        name = s.next();
        System.out.print("Enter your password : ");
        password = s.next();

        for(int i = 0 ; i<user.size() ; i++)
        {
            if ((user.get(i).name).equals(name) && (user.get(i).password).equals(password))
            {
                c = 1;
                useridindex = i;
                existinguseroptions();
                break;
            }
        }
        if (c == 0)
        {
            System.out.println("Name or Password is incorrect");
            System.out.println("Press enter to continue");
            s.nextLine();
            s.nextLine();
            existinguserlogin();
        }

    }
    static void existinguseroptions()
    {
        clear();
        System.out.println("                Welcome "+name);
        System.out.println();
        System.out.println("1. Shopping");
        System.out.println("2. Your cart");
        System.out.println("3. Order History");
        System.out.println("4. Wallet");
        System.out.println("5. Password change");
        System.out.println("6. Home");
        System.out.println();
        System.out.print("Enter your choice : ");
        choicenumber = s.nextInt();

        switch (choicenumber)
        {
            case 1:
            {
                shopping();
                break;
            }
            case 2:
            {
                yourcart();
                break;
            }
            case 3:
            {
                orderhistory();
                break;
            }
            case 4:
            {
                wallet();
                break;
            }
            case 5:
            {
                userpasswordchange();
                break;
            }
            case 6:
            {
                mainpage();
                break;
            }
            default:
            {
                System.out.println("Invalid input");
                System.out.println();
                System.out.print("Press enter to continue");
                s.nextLine();
                s.nextLine();
                clear();
                existinguseroptions();
            }
        }
    }
    static void userpasswordchange()
    {
        System.out.println("              Change pasword");
        System.out.println();
        System.out.print("Enter new password : ");
        password = s.next();
        System.out.print("Re-type your new password to confirm : ");
        npassword = s.next();
        if (password.equals(npassword))
        {
            user.get(useridindex).password = npassword;
            System.out.println("Password changed sucessfully");
        }
        else
        {
            System.out.println("Password and Confirm password mismached");
            System.out.println();
            System.out.print("Press enter to continue");
            s.nextLine();
            s.nextLine();
            System.out.println("Password not changed");
        }
        System.out.println();
        System.out.print("Press enter to continue");
        s.nextLine();
        s.nextLine();
        existinguseroptions();
    }
    static void wallet()
    {
        clear();
        System.out.println("                 Wallet");
        System.out.println();
        System.out.println("         Wallet balance : "+user.get(useridindex).walletbalance);
        System.out.println();
        System.out.println("1. Add cash");
        System.out.println("2. Home");
        System.out.print("Enter your choice : ");
        choicenumber = s.nextInt();

        switch (choicenumber)
        {
            case 1:
            {
                addcash();
                break;
            }
            case 2:
            {
                existinguseroptions();
                break;
            }
            default:
            {
                System.out.println("Invalid input");
                System.out.println();
                System.out.print("Press enter to continue");
                s.nextLine();
                s.nextLine();
                clear();
                wallet();
            }
        }
    }
    static void addcash()
    {
        clear();
        System.out.println("          Add cash");
        System.out.println();
        System.out.print("Enter cash to be added : ");
        balance = s.next();
        
        user.get(useridindex).walletbalance = String.valueOf((Integer.parseInt(user.get(useridindex).walletbalance))+(Integer.parseInt(balance)));
        System.out.println();
        System.out.println("Cash added successfully");
        System.out.println();
        System.out.print("Press enter to continue");
        s.nextLine();
        s.nextLine();
        wallet();
    }
    static void orderhistory()
    {
        clear();
        c = 0;
        System.out.println("                    Your Order History");
        System.out.println();
        for (int i = 0 ; i<orderhistory.size() ; i++)
        {
            if ((orderhistory.get(i).userid).equals(user.get(useridindex).userid))
            {
                c = 1;
                System.out.println("Product ID    : "+orderhistory.get(i).productid);
                System.out.println("Product name  : "+orderhistory.get(i).productname);
                System.out.println("Product Price : "+orderhistory.get(i).productprice);
                for (int j = 0 ; j<pro.size() ; j++)
                {
                    if ((pro.get(j).productid).equals(orderhistory.get(i).productid))
                    {
                        if ((Integer.parseInt(pro.get(j).quantity))>0)
                        {
                            System.out.println("In Stock");
                            System.out.println("-------------------------------------");
                        }
                        else
                        {
                            System.out.println("No Stock");
                            System.out.println("-------------------------------------");
                        }
                    }
                }
            }
        }
        System.out.println();
        if (c == 1)
        {
            System.out.println("Enter 1 to buy or 0 to back");
            choicenumber = s.nextInt();
            if (choicenumber == 1)
            {
                shopping();
            }
            else
            {
                existinguseroptions();
            }
        }
        else
        {
            System.out.println("You have ordered nothing");
            System.out.println();
            System.out.print("Press enter to continue");
            s.nextLine();
            s.nextLine();
            existinguseroptions();
        }
    }
    static void yourcart()
    {
        clear();
        c = 0;
        System.out.println("                Your Cart");
        System.out.println();
        for (int i = 0 ; i<addtocart.size() ; i++)
        {
            if ((addtocart.get(i).userid).equals(user.get(useridindex).userid))
            {
                c = 1;
                System.out.println("Product ID    : "+addtocart.get(i).productid);;
                System.out.println("Product Name  : "+addtocart.get(i).productname);
                System.out.println("Product Price : "+addtocart.get(i).productprice);
                for (int j = 0 ; j<pro.size() ; j++)
                {
                    if ((pro.get(j).productid).equals(addtocart.get(i).productid))
                    {
                        if ((Integer.parseInt(pro.get(j).quantity))>0)
                        {
                            System.out.println("In Stock");
                            System.out.println("-------------------------------------");
                        }
                        else
                        {
                            System.out.println("No Stock");
                            System.out.println("-------------------------------------");
                        }
                    }
                }
            }
        }
        System.out.println();
        if (c == 1)
        {
            System.out.println("Enter 1 to buy or 0 to back");
            choicenumber = s.nextInt();
            if (choicenumber == 1)
            {
                shopping();
            }
            else
            {
                existinguseroptions();
            }
        }
        else
        {
            System.out.println("Your cart is empty");
            System.out.println();
            System.out.print("Press enter to continue");
            s.nextLine();
            s.nextLine();
            existingmerchantoptions();
        }
    }
    static void shopping()
    {
        clear();
        System.out.println("                  Products are waiting for you "+name);
        System.out.println();
        position = 1;
        for (int i = 0 ; i<procat.size() ; i++)
        {
            System.out.println(position + ". "+procat.get(i));
            position++;
        }
        System.out.println(position + ". Home");
        System.out.println();
        System.out.print("Enter your choice : ");
        choicenumber = s.nextInt();
        if (choicenumber<position)
        {
            userproductlist();
        }
        else if (choicenumber == position)
        {
            mainpage();
        }
        else
        {
            System.out.println("Invalid input");
            System.out.println();
            System.out.print("Press enter to continue");
            s.nextLine();
            s.nextLine();
            shopping();
        }
    }
    static void userproductlist()
    {
        clear();
        c = 0;
        for (int i = 0 ; i<pro.size() ; i++)
        {
            if((procat.get(choicenumber-1)).equals(pro.get(i).productcategory) && (Integer.parseInt(pro.get(i).quantity)>0))
            {
                c = 1;
                System.out.println ("Product Category : " + pro.get(i).productcategory);
                System.out.println ("Product Name     : " + pro.get(i).productname);
                System.out.println ("Product Price    : " + pro.get(i).productprice);
                System.out.println ("Product ID       : " + pro.get(i).productid);
                System.out.println ("Product Quantity : " + pro.get(i).quantity);
                System.out.println ("Product Discount : " + pro.get(i).discount);
                System.out.println ("------------------------------------------------------");
                System.out.println();
            }
            else
            {
                nostock();
            }
        }
        if (c == 1)
        {
            System.out.println();
            System.out.print("Enter Product ID : ");
            productid = s.next();
            for (int i = 0 ; i<pro.size() ; i++)
            {
                if ((pro.get(i).productid).equals(productid))
                {
                    proidindex = i;
                    System.out.println("              Your required product details");
                    System.out.println();
                    System.out.println ("Product Category : " + pro.get(proidindex).productcategory);
                    System.out.println ("Product Name     : " + pro.get(proidindex).productname);
                    System.out.println ("Product Price    : " + pro.get(proidindex).productprice);
                    System.out.println ("Product ID       : " + pro.get(proidindex).productid);
                    System.out.println ("Product Quantity : " + pro.get(proidindex).quantity);
                    System.out.println ("Product Discount : " + pro.get(proidindex).discount);
                    System.out.println ("------------------------------------------------------");
                    System.out.println();
                    userproductdo();
                    break;
                }
            }
        }
    }
    static void nostock()
    {
        System.out.println("Currently no stock in your required product");
        System.out.println();
        System.out.print("Press enter to continue");
        s.nextLine();
        s.nextLine();
        existinguseroptions();
    }
    static void userproductdo()
    {
        System.out.println("1. Add to cart");
        System.out.println("2. Buy");
        System.out.println("3. Back");
        System.out.println();
        System.out.print("Enter your choice : ");
        choicenumber = s.nextInt();
        switch(choicenumber)
        {
            case 1:
            {
                addtocart();
                break;
            }
            case 2:
            {
                buy();
                break;
            }
            case 3:
            {
                shopping();
                break;
            }
            default:
            {
                System.out.println("Invalid input");
                System.out.println();
                System.out.print("Press enter to continue");
                s.nextLine();
                s.nextLine();
                userproductdo();
            }
        }
    }
    static void buy()
    {
        clear();
        amount = Integer.parseInt(pro.get(proidindex).productprice);
        dd = Integer.parseInt(pro.get(proidindex).discount);
        c = 0;
        if (dd>0)
        {
            int z = dd*(Integer.parseInt(pro.get(proidindex).productprice));
            amount = amount - (z/100);
            System.out.println("You saved : " + (z/100));
        }
        if (Integer.parseInt(user.get(useridindex).walletbalance)>=amount)
        {
            System.out.println("Amount to be paid : "+ amount);
            c = 1;
            System.out.println();
            System.out.println("Press enter 1 to place your order or 0 to cancel");
            System.out.println();
            choicenumber = s.nextInt();
            System.out.println();
            if (choicenumber == 1)
            {
                System.out.println("Your order placed successfully");
                pro.get(proidindex).quantity = String.valueOf(Integer.valueOf(pro.get(proidindex).quantity)-1);
                pro.get(proidindex).sold = String.valueOf(Integer.valueOf(pro.get(proidindex).sold)+1);
                user.get(useridindex).walletbalance = String.valueOf(Integer.valueOf(user.get(useridindex).walletbalance)-amount);
                orderhistory.add(new OrderHistory(pro.get(proidindex).productname,pro.get(proidindex).productid,user.get(useridindex).userid,pro.get(proidindex).productprice));
            }
            else
            {
                System.out.println("Your order not placed");
            }
        }
        else
        {
            System.out.println("Insufficient funds in your wallet");
        }
        System.out.println();
        System.out.print("Press enter to continue");
        s.nextLine();
        s.nextLine();
        existinguseroptions();
    }
    static void addtocart()
    {
        addtocart.add(new Addtocart(pro.get(proidindex).productname,pro.get(proidindex).productid,user.get(useridindex).userid,pro.get(proidindex).productprice));
        System.out.println("Product added to Your cart");
        System.out.println();
        System.out.print("Press enter to continue");
        s.nextLine();
        s.nextLine();
        existinguseroptions();
    }
    static void newuser()
    {
        clear();
        System.out.println("                New User");
        System.out.println();
        System.out.print("Enter your name          : ");
        name = s.next();
        System.out.print("Create your password     : ");
        password = s.next();
        System.out.print("Enter amount to be added : ");
        balance = s.next();
        user.add(new User (name,password,balance,"u00"+String.valueOf(user.size()+1)));
        System.out.println();
        System.out.println("Your account created successfully and your id is u00" +String.valueOf(user.size()));
        System.out.println();
        System.out.print("Press enter to continue");
        s.nextLine();
        s.nextLine();
        userlogin();
    }
    static void clear()
    {
        System.out.print("\033[H\033[2J");  
        System.out.flush();
    }
    static void merchantlogin()
    {
        clear();
        System.out.println("            Merchant Login");
        System.out.println();
        System.out.println("1. New Merchant");
        System.out.println("2. Existing Merchant");
        System.out.println("3. Home");
        System.out.println();
        System.out.print("Enter your choice : ");
        choicenumber = s.nextInt();
        switch (choicenumber)
        {
            case 1:
            {
                newmerchant();
                break;
            }
            case 2:
            {
                existingmerchantlogin();
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
                System.out.println();
                System.out.print("Press enter to continue");
                s.nextLine();
                s.nextLine();
                clear();
                merchantlogin();
            }
        }
    }
    static void existingmerchantlogin()
    {
        clear();
        System.out.println("                Existing Merchant");
        System.out.println();
        System.out.print("Enter your name : ");
        name = s.next();
        System.out.print("Enter your password :");
        password = s.next();

        for(int i = 0 ; i<mer.size() ; i++)
        {
            if ((mer.get(i).name).equals(name) && (mer.get(i).password).equals(password))
            {
                proidindex = 1;
                position = i;
                existingmerchantoptions();
            }
        }
        if (proidindex == 0)
        {
            System.out.println("Name or Password is incorrect");
            System.out.println("Press enter to continue");
            s.nextLine();
            s.nextLine();
            existingmerchantlogin();
        }

    }
    static void existingmerchantoptions()
    {
        clear();
        System.out.println("              Welcome "+name);
        System.out.println();
        System.out.println("1. Add product");
        System.out.println("2. List My Product");
        System.out.println("3. Edit Product");
        System.out.println("4. Remove Product");
        System.out.println("5. View most sold product");
        System.out.println("6. View sales report");
        System.out.println("7. Home");
        System.out.println();
        System.out.print("Enter your choice : ");
        choicenumber = s.nextInt();

        switch (choicenumber)
        {
            case 1:
            {
                addproduct();
                break;
            }
            case 2:
            {
                listmyproduct();
                break;
            }
            case 3:
            {
                editproduct();
                break;
            }
            case 4:
            {
                removeproduct();
                break;
            }
            case 5:
            {
                //viewmostsoldproduct();
                break;
            }
            case 6:
            {
                //viewsalesreport();
                break;
            }
            case 7:
            {
                mainpage();
                break;
            }
            default:
            {
                System.out.println("Invalid input");
                System.out.println();
                System.out.print("Press enter to continue");
                s.nextLine();
                s.nextLine();
                existingmerchantoptions();
            }
        }
    }
    static void removeproduct()
    {
        clear();
        System.out.println("              Remove Product" );
        System.out.println();
        System.out.print("Enter product id : ");
        productid = s.next();
        System.out.println();
        proidindex = 0;
        for (int i = 0 ; i<pro.size() ; i++)
        {
            if ((pro.get(i).productid).equals(productid))
            {
                proidindex = 1;
                pro.remove(i);
                System.out.println("Product removed successfully");
                break;
            }
        }
        if (proidindex == 0)
        {
            System.out.println("Product not found");
        }
        System.out.println();
        System.out.print("Press enter to continue");
        s.nextLine();
        s.nextLine();
        existingmerchantoptions();
    }
    static void editproduct()
    {
        clear();
        System.out.println("              Edit Product" );
        System.out.println();
        System.out.print("Enter product id : ");
        productid = s.next();
        proidindex = 0;
        for (int i = 0 ; i<pro.size() ; i++)
        {
            if ((pro.get(i).productid).equals(productid))
            {
                proidindex = 1;
                System.out.println("Product name is " + pro.get(i).productname);
                System.out.println();
                System.out.println("Product price is " + pro.get(i).productprice);
                System.out.print("Enter new product price    : ");
                pro.get(i).productprice = s.next();
                System.out.println();
                System.out.println("Product quantity is " + pro.get(i).quantity);
                System.out.print("Enter new product quantity : " );
                pro.get(i).quantity = s.next();
                System.out.println();
                System.out.println("Product discount is " + pro.get(i).discount);
                System.out.print("Enter new product discount : " );
                pro.get(i).discount = s.next();
                System.out.println("Changes made successfully");
                break;
            }
        }
        if (proidindex == 0)
        {
            System.out.println("Product not found");
        }
        System.out.println();
        System.out.print("Press enter to continue");
        s.nextLine();
        s.nextLine();
        existingmerchantoptions();
    }
    static void listmyproduct()
    {
        clear();
        System.out.println("                Your Product List");
        c = 1;
        for (int i = 0 ; i<pro.size() ; i++)
        {
            if ((pro.get(i).merchantid).equals(mer.get(position).merchantid))
            {
                System.out.println(c + ". Product Name : "+ pro.get(i).productname);
                System.out.println("   Product ID : "+pro.get(i).productid);
                c++;
                choicenumber = 1;
            }
        }
        if (choicenumber == 0)
        {
            System.out.println("No products found");
        }
        System.out.println();
        System.out.print("Press enter to continue");
        s.nextLine();
        s.nextLine();
        existingmerchantoptions();
    }
    static void addproduct()
    {
        clear();
        System.out.println("             Add Product");
        System.out.println();
        System.out.print("Enter product category : ");
        procatname = s.next();
        System.out.print("Enter product name     : ");
        proname = s.next();
        System.out.println("Enter product price : ");
        proprice = s.next();
        System.out.print("Enter product Quantity : ");
        quantity = s.next();
        System.out.print("Enter product discount : ");
        discount = s.next();
        pro.add(new Product(mer.get(position).merchantid,procatname,"ama00"+String.valueOf(pro.size()+1),proname,proprice,quantity,discount,"0"));
        System.out.println();
        System.out.println("Product added successfully");
        System.out.println();
        System.out.print("Press enter to continue");
        s.nextLine();
        s.nextLine();
        existingmerchantoptions();
    }
    static void newmerchant()
    {
        clear();
        System.out.println("                New Merchant");
        System.out.println();
        System.out.print("Enter your name                 : ");
        name = s.next();
        System.out.print("Enter your product category     : ");
        procatname = s.next();
        System.out.print("Create your password            : ");
        password = s.next();
        System.out.print("Enter product name              : ");
        proname = s.next();
        System.out.println("Enter product price : ");
        proprice = s.next();
        System.out.print("Enter product quantity          : ");
        quantity = s.next();
        System.out.print("Enter discount for your product : ");
        discount = s.next();
        merapp.add(new Merchantapproval(name,procatname,password,"mer"+ (String.valueOf(mer.size()+1)),proname,"ama00"+String.valueOf(pro.size()+1),proprice,quantity,discount));
        System.out.println();
        System.out.println("Your request was successfully submit for admin approval");
        System.out.println();
        System.out.println("Press enter to continue");
        s.nextLine();
        s.nextLine();
        merchantlogin();
    }
    static void adminlogin()
    {
        clear();
        System.out.println("              Admin Login");
        System.out.println();
        System.out.print("Enter admin name : ");
        name = s.next();
        System.out.print("Enter Password : ");
        password = s.next();
        if (name.equals("admin") && password.equals("ad"))
        {
            adminoptions();
        }
        else
        {
            System.out.println("Admin name or password is in correct");
            System.out.println();
            System.out.print("Press enter to continue");
            s.nextLine();
            s.nextLine();
            clear();
            mainpage();
        }
    }
    static void adminoptions()
    {
        clear();
        System.out.println("            Welcome Admin");
        System.out.println();
        System.out.println("1. Merchant Approval");
        System.out.println("2. Merchant List");
        System.out.println("3. Product List");
        System.out.println("4. Product Category List");
        System.out.println("5. Add New Product Category");
        System.out.println("6. Home");
        System.out.println();
        System.out.print("Enter your choice : ");
        choicenumber = s.nextInt();
        System.out.println();
        switch (choicenumber)
        {
            case 1:
            {
                merchantapproval();
                break;
            }
            case 2:
            {
                merchantlist();
                break;
            }
            case 3:
            {
                productlist();
                break;
            }
            case 4:
            {
                productcategorylist();
                break;
            }
            case 5:
            {
                addproductcategory();
                break;
            }
            case 6:
            {
                mainpage();
                break;
            }
            default :
            {
                System.out.println("Invalid input");
                System.out.println();
                System.out.print("Press enter to continue");
                s.nextLine();
                s.nextLine();
                clear();
                adminoptions();
            }
        } 
    }
    static void merchantlist()
    {
        clear ();
        for (int i = 0 ; i<mer.size() ; i++ )
        {
            System.out.println("Merchant name : "+mer.get(i).name);
            System.out.println("Product category : "+mer.get(i).productcategory);
            System.out.println();
        }
        System.out.print("Press enter to continue");
        s.nextLine();
        s.nextLine();
        adminoptions();
    }
    static void productlist()
    {
        clear();
        System.out.println("              Product List");
        System.out.println();
        for (int i = 0 ; i<pro.size() ; i++)
        {
            System.out.println ("Product ID       : " + pro.get(i).productid);
            for (int j = 0 ; j<mer.size() ;j++)
            {
                if ((mer.get(j).merchantid).equals(pro.get(i).merchantid))
                {
                    name = mer.get(j).name;
                    break;
                }
            }
            System.out.println ("Merchant name    : " + name);
            System.out.println ("Product Category : " + pro.get(i).productcategory);
            System.out.println ("Product Name     : " + pro.get(i).productname);
            System.out.println ("Product Price    : " + pro.get(i).productprice);
            System.out.println ("Product Quantity : " + pro.get(i).quantity);
            System.out.println ("Product Discount : " + pro.get(i).discount);
            System.out.println ("Product Sold     : " + pro.get(i).sold);
            System.out.println ();
            System.out.println ("-------------------------------------------------------");
            System.out.println ();
        }
        System.out.print("Press enter to continue");
        s.nextLine();
        s.nextLine();
        adminoptions();
    }
    static void productcategorylist()
    {
        clear();
        for (int i = 0 ; i<procat.size() ; i++)
        {
            System.out.println((i+1) + ". " + procat.get(i));
        }
        System.out.println ();
        System.out.println ("-------------------------------------------------------");
        System.out.println ();
        System.out.print("Press enter to continue");
        s.nextLine();
        s.nextLine();
        adminoptions();
    }
    static void addproductcategory()
    {
        clear();
        System.out.print("Enter new product category name : ");
        name = s.next();
        procat.add(name);
        System.out.println();
        System.out.println("New product category added sucessfully");
        System.out.println();
        System.out.println("Press enter to continue");
        s.nextLine();
        s.nextLine();
        adminoptions();
    }
    static void merchantapproval()
    {
        clear();
        if (merapp.size() == 0)
        {
            System.out.println("No new merchants for approval");
        }
        else
        {
            //Merchantapproval(String name, String productcategory, String password, String merchantid, String productname, String productid, String quantity, String discount)
            for (int i = 0 ; i<merapp.size() ; i++)
            {
                System.out.println("Merchant name    : " + merapp.get(i).name);
                System.out.println("Product category : " + merapp.get(i).productcategory);
                System.out.println("Product Name     : " + merapp.get(i).productname);
                System.out.println("Press 1 for Approval or 0 for rejection");
                choicenumber = s.nextInt();
                if (choicenumber == 1)
                {
                    //Merchant(String name,String password,String productcategory, String merchantid)
                    //(String merchantid, String productcategory, String productid, String productname, String quantity, String discount, String sold)
                    mer.add(new Merchant(merapp.get(i).name,merapp.get(i).password,merapp.get(i).productcategory,"mer"+ (String.valueOf(mer.size())),merapp.get(i).productname));
                    pro.add(new Product("mer"+ (String.valueOf(mer.size())),merapp.get(i).productcategory,"ama00"+String.valueOf(pro.size()+1),merapp.get(i).productname,merapp.get(i).productprice,merapp.get(i).quantity,merapp.get(i).discount,"0"));
                    merapp.remove(i);
                    merchantapproval();
                }
                else
                {
                    merapp.remove(i);
                    merchantapproval();
                }
            }
        }
        System.out.println();
        System.out.println("Press enter to continue");
        s.nextLine();
        s.nextLine();
        adminoptions();
    }
    public static void main (String [] ll)
    {
        mer.add(new Merchant("sai","1234","Phone","mer"+String.valueOf(mer.size()+1),"VIVO"));
        mer.add(new Merchant("sairanjan","1234","Phone","mer"+String.valueOf(mer.size()+1),"OPPO"));
        pro.add(new Product("mer1","Phone","ama00"+String.valueOf(pro.size()+1),"VIVO","40000","2","10","0"));
        pro.add(new Product("mer2","Phone","ama00"+String.valueOf(pro.size()+1),"OPPO","35000","2","10","0"));
        user.add(new User("raj","12","140000","u00"+String.valueOf(user.size()+1)));
        user.add(new User("ram","12","140000","u00"+String.valueOf(user.size()+1)));
        addtocart.add(new Addtocart("vivo","ama001","u001","14000"));
        orderhistory.add(new OrderHistory("vivo","ama001","u001","14000"));
        procat.add("Phone");
        procat.add("Laptop");
        procat.add("Food");
        mainpage();
    }
}
