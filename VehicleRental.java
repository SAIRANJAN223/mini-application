import java.util.*;
public class VehicleRental
{
    static Scanner sc=new Scanner(System.in);
    static int ch,b,d,e,f,g,h,l,m,n,o,p,q,r,s,m1,r1,s1,m2,m3,r2,s2;
    static String a,c,x1,x2,x3;
    static boolean ans,ans1;
    static List<String>li=new ArrayList<>();
    static List<Integer>li1=new ArrayList<>();
    static List<Integer>li2=new ArrayList<>();
    static List<Integer>li3=new ArrayList<>();
    static List<Integer>seats1=new ArrayList<>();
    static List<Integer>seats2=new ArrayList<>();
    static List<Integer>seats3=new ArrayList<>();
    static List<Integer>seats4=new ArrayList<>();
    static List<Integer>seats5=new ArrayList<>();
    static List<String>waiting=new ArrayList<>();
    static List<String>waiting3=new ArrayList<>();
    static List<Integer>waiting1=new ArrayList<>();
    static List<Integer>waiting2=new ArrayList<>();
    static List<Integer>li4=new ArrayList<>();
    static List<Integer>li5=new ArrayList<>();
    static List<Integer>li6=new ArrayList<>();




    static List<String>name=new ArrayList<>();
    static List<Integer>start=new ArrayList<>();
    static List<Integer>end=new ArrayList<>();
    static List<String>status=new ArrayList<>();

    static void user(){


		    System.out.println("1.Book Ticket");
		    System.out.println("2.Review Ticket");
		    System.out.println("3.Delete Ticket");
		    int f=sc.nextInt();
		    sc.nextLine();
		    if(f==1){
		        System.out.print("\033[H\033[2J");  
                System.out.flush(); 
		        System.out.println("Boarding From :");
		        System.out.println("1.Coimbatore");
		        System.out.println("2.Tirupur");
		        System.out.println("3.Erode");
		        System.out.println("4.Salem");
		        System.out.println("5.Chennai");
		        int g=sc.nextInt();
		        sc.nextLine();
		        System.out.println("Going To :");
		        System.out.println("1.Coimbatore");
		        System.out.println("2.Tirupur");
		        System.out.println("3.Erode");
		        System.out.println("4.Salem");
		        System.out.println("5.Chennai");
		        int h=sc.nextInt();
		        sc.nextLine();
		        for(int i=g;i<h-1;i++){
		           // li2.clear();
		            li2.add(i);
		        }
		        System.out.println("Press 1 to confirm your vehicle");
		        int l=sc.nextInt();
		        sc.nextLine();
		        if(seats1.get(g-1)==0 && seats1.get(h-1)==0){
		            System.out.println("Vehicle 1");
		            seats1.set(g-1,1);
		            seats1.set(h-1,1);
		            for(int i=0;i<li2.size();i++){
		                m=li2.get(i);
		                seats1.set(m,1);
		            }
		            li2.clear();
		            name.add(c);
		            start.add(g);
		            end.add(h);
		            status.add("Confirmed");
		        }else {
		            if(seats2.get(g-1)==0 && seats2.get(h-1)==0){
		            System.out.println("Vehicle 2");
		            seats2.set(g-1,1);
		            seats2.set(h-1,1);
		            for(int i=0;i<li2.size();i++){
		                m=li2.get(i);
		                seats2.set(m,1);
		            }
		            li2.clear();
		            name.add(c);
		            start.add(g);
		            end.add(h);
		            status.add("Confirmed");
		        }else {
		            if(seats3.get(g-1)==0 && seats3.get(h-1)==0){
		            System.out.println("Vehicle 3");
		            seats3.set(g-1,1);
		            seats3.set(h-1,1);
		            for(int i=0;i<li2.size();i++){
		                m=li2.get(i);
		                seats3.set(m,1);
		            }
		            li2.clear();
		            name.add(c);
		            start.add(g);
		            end.add(h);
		            status.add("Confirmed");
		        }else {
		            if(seats4.get(g-1)==0 && seats4.get(h-1)==0){
		            System.out.println("Vehicle 4");
		            seats4.set(g-1,1);
		            seats4.set(h-1,1);
		            for(int i=0;i<li2.size();i++){
		                m=li2.get(i);
		                seats4.set(m,1);
		            }
		            li2.clear();
		            name.add(c);
		            start.add(g);
		            end.add(h);
		            status.add("Confirmed");
		        }else {
		            if(seats5.get(g-1)==0 && seats5.get(h-1)==0){
		            System.out.println("Vehilce 5");
		            seats5.set(g-1,1);
		            seats5.set(h-1,1);
		            for(int i=0;i<li2.size();i++){
		                m=li2.get(i);
		                seats5.set(m,1);
		            }
		            li2.clear();
		            name.add(c);
		            start.add(g);
		            end.add(h);
		            status.add("Confirmed");
		        
		        }else {
		            if(waiting.size()<3){
		            waiting.add(c);
		            waiting1.add(g);
		            waiting2.add(h);
		            waiting3.add("Waiting");}
		            else {
		            System.out.println("No Tickets Available Right Now,Come Again Later");
		        }
		        }
		        }
		        }
		        }
		        }
		    }else if(f==2){
		        for(int i=0;i<name.size();i++){
		            if((name.get(i)).equals(c)){
		                System.out.println(c);
		                System.out.println("From "+start.get(i));
		                System.out.println("TO "+end.get(i));
		                System.out.println("STSTUS "+status.get(i));
		            }
		        }
		        for(int i=0;i<waiting.size();i++){
		            if((waiting.get(i)).equals(c)){
		                System.out.println(c);
		                System.out.println("FROM "+waiting1.get(i));
		                System.out.println("TO "+waiting2.get(i));
		                System.out.println("FROM "+waiting3.get(i));
		            }
		        }
		    }else if(f==3){
		        System.out.println("Enter your Ticket Number");
		        n=sc.nextInt();
		        sc.nextLine();
		        System.out.println("Enter your Boarding Point");
		        //System.out.println("Going To :");
		        System.out.println("1.Coimbatore");
		        System.out.println("2.Tirupur");
		        System.out.println("3.Erode");
		        System.out.println("4.Salem");
		        System.out.println("5.Chennai");
		        o=sc.nextInt();
		        sc.nextLine();
		       // System.out.println("Enter your Boarding Point");
		        System.out.println("Going To :");
		        System.out.println("1.Coimbatore");
		        System.out.println("2.Tirupur");
		        System.out.println("3.Erode");
		        System.out.println("4.Salem");
		        System.out.println("5.Chennai");
		        p=sc.nextInt();
		        sc.nextLine();
		        for(int i=o;i<p-1;i++){
		            li3.add(i);
		        }
		        if(n==1){
		            seats1.set(o-1,0);
		            seats1.set(p-1,0);
		            for(int i=0;i<li3.size();i++){
		                q=li3.get(i);
		                seats1.set(q,0);
		                li3.clear();
		            }
		            for(int i=0;i<name.size();i++){
		    for(int j=0;j<start.size();j++){
		        for(int k=0;k<end.size();k++){
		            if((name.get(i)).equals(c) && (start.get(o)).equals("b1") && (end.get(p)).equals("b2")){
		                status.set(j,"Deleted");
		            }
		        }
		    }
		}
		        }else if(n==2){
		            seats2.set(o-1,0);
		            seats2.set(p-1,0);
		            for(int i=0;i<li3.size();i++){
		                q=li3.get(i);
		                seats2.set(q,0);
		                li3.clear();
		            }
		            for(int i=0;i<name.size();i++){
		    for(int j=0;j<start.size();j++){
		        for(int k=0;k<end.size();k++){
		            if((name.get(i)).equals(c) && (start.get(o)).equals("b1") && (end.get(p)).equals("b2")){
		                status.set(j,"Deleted");
		            }
		        }
		    }
		}
		        }else if(n==3){
		            seats3.set(o-1,0);
		            seats3.set(p-1,0);
		            for(int i=0;i<li3.size();i++){
		                q=li3.get(i);
		                seats3.set(q,0);
		                li3.clear();
		            }
		            for(int i=0;i<name.size();i++){
		    for(int j=0;j<start.size();j++){
		        for(int k=0;k<end.size();k++){
		            if((name.get(i)).equals(c) && (start.get(o)).equals("b1") && (end.get(p)).equals("b2")){
		                status.set(j,"Deleted");
		            }
		        }
		    }
		}
		        }else if(n==4){
		            seats4.set(o-1,0);
		            seats4.set(p-1,0);
		            for(int i=0;i<li3.size();i++){
		                q=li3.get(i);
		                seats4.set(q,0);
		                li3.clear();
		            }
		            for(int i=0;i<name.size();i++){
		    for(int j=0;j<start.size();j++){
		        for(int k=0;k<end.size();k++){
		            if((name.get(i)).equals(c) && (start.get(o)).equals("b1") && (end.get(p)).equals("b2")){
		                status.set(j,"Deleted");
		            }
		        }
		    }
		}
		        }else if(n==5){
		            seats5.set(o-1,0);
		            seats5.set(p-1,0);
		            for(int i=0;i<li3.size();i++){
		                q=li3.get(i);
		                seats5.set(q,0);
		                li3.clear();
		            }
		            for(int i=0;i<name.size();i++){
		    for(int j=0;j<start.size();j++){
		        for(int k=0;k<end.size();k++){
		            if((name.get(i)).equals(c) && (start.get(o)).equals("b1") && (end.get(p)).equals("b2")){
		                status.set(j,"Deleted");
		            }
		        }
		    }
		}
		        }
		        if(waiting.size()==1){
		        waitinga();}
		        if(waiting.size()==2){
		            waitinga1();
		        }
		        if(waiting.size()==3){
		        waitinga2();}
		    }
		    
		}
		public static void waitinga(){
	x1=waiting.get(0);
    r=waiting1.get(0);
    s=waiting2.get(0);
   // r1=waiting1.get(1);
    //s1=waiting2.get(1);
    //r2=waiting1.get(2);
    //s2=waiting2.get(2);
    for(int i=r;i<s-1;i++){
   for(int i=r;i<s-1;i++){
        li4.add(i);
      }
    if(seats1.get(r-1)==0 && seats1.get(s-1)==0){
        
		//System.out.println("1");
		seats1.set(r-1,1);
		            seats1.set(s-1,1);
		            for(int i=0;i<li4.size();i++){
		                m1=li4.get(i);
		                seats1.set(m1,1);
		            }
		            li4.clear();
		            waiting.remove(0);
		            waiting1.remove(0);
		            waiting2.remove(0);
		            waiting3.remove(0);
		            name.add(x1);
		            start.add(r);
		            end.add(s);
		            status.add("Confirmed");
		        }else {
		            if(seats2.get(r-1)==0 && seats2.get(s-1)==0){
		            System.out.println("22222");
		            seats2.set(r-1,1);
		            seats2.set(s-1,1);
		            for(int i=0;i<li4.size();i++){
		                m1=li4.get(i);
		                seats2.set(m1,1);
		            }
		            li4.clear();
		            waiting.remove(0);
		            waiting1.remove(0);
		            waiting2.remove(0);
		            waiting3.remove(0);
		            name.add(x1);
		            start.add(r);
		            end.add(s);
		            status.add("Confirmed");
		        }else {
		            if(seats3.get(r-1)==0 && seats3.get(s-1)==0){
		            System.out.println("3");
		            seats3.set(r-1,1);
		            seats3.set(s-1,1);
		            for(int i=0;i<li4.size();i++){
		                m1=li4.get(i);
		                seats3.set(m1,1);
		            }
		            li4.clear();
		            waiting.remove(0);
		            waiting1.remove(0);
		            waiting2.remove(0);
		            waiting3.remove(0);
		            name.add(x1);
		            start.add(r);
		            end.add(s);
		            status.add("Confirmed");
		        }else {
		            if(seats4.get(r-1)==0 && seats4.get(s-1)==0){
		            System.out.println("4");
		            seats4.set(r-1,1);
		            seats4.set(s-1,1);
		            for(int i=0;i<li4.size();i++){
		                m1=li4.get(i);
		                seats4.set(m1,1);
		            }
		            li4.clear();
		            waiting.remove(0);
		            waiting1.remove(0);
		            waiting2.remove(0);
		            waiting3.remove(0);
		            name.add(x1);
		            start.add(r);
		            end.add(s);
		            status.add("Confirmed");
		        }else {
		            if(seats5.get(r-1)==0 && seats5.get(s-1)==0){
		            System.out.println("5");
		            seats5.set(r-1,1);
		            seats5.set(s-1,1);
		            for(int i=0;i<li4.size();i++){
		                m1=li4.get(i);
		                seats5.set(m1,1);
		            }
		            li4.clear();
		            waiting.remove(0);
		            waiting1.remove(0);
		            waiting2.remove(0);
		            waiting3.remove(0);
		            name.add(x1);
		            start.add(r);
		            end.add(s);
		            status.add("Confirmed");
		        
		        }
		        }
		        }
		        }
		        }
}
public static void waitinga1(){
   // r=waiting1.get(0);
    //s=waiting2.get(0);
    x2=waiting.get(1);
   r1=waiting1.get(1);
   s1=waiting2.get(1);
    //r2=waiting1.get(2);
    //s2=waiting2.get(2);
    for(int i=r1;i<s1-1;i++){
        li5.add(i);
      }
    if(seats1.get(r1-1)==0 && seats1.get(s1-1)==0){
        
		//System.out.println("1");
		seats1.set(r1-1,1);
		            seats1.set(s1-1,1);
		            for(int i=0;i<li5.size();i++){
		                m2=li5.get(i);
		                seats1.set(m2,1);
		            }
		            li5.clear();
		            waiting.remove(1);
		            waiting1.remove(1);
		            waiting2.remove(1);
		            waiting3.remove(1);
		            name.add(x2);
		            start.add(r1);
		            end.add(s1);
		            status.add("Confirmed");
		        }else {
		            if(seats2.get(r1-1)==0 && seats2.get(s1-1)==0){
		            System.out.println("21111");
		            seats2.set(r1-1,1);
		            seats2.set(s1-1,1);
		            for(int i=0;i<li5.size();i++){
		                m2=li5.get(i);
		                seats2.set(m2,1);
		            }
		            li5.clear();
		            waiting.remove(1);
		            waiting1.remove(1);
		            waiting2.remove(1);
		            waiting3.remove(1);
		            name.add(x2);
		            start.add(r1);
		            end.add(s1);
		            status.add("Confirmed");
		        }else {
		            if(seats3.get(r1-1)==0 && seats3.get(s1-1)==0){
		            System.out.println("3");
		            seats3.set(r1-1,1);
		            seats3.set(s1-1,1);
		            for(int i=0;i<li5.size();i++){
		                m2=li5.get(i);
		                seats3.set(m2,1);
		            }
		            li5.clear();
		            waiting.remove(1);
		            waiting1.remove(1);
		            waiting2.remove(1);
		            waiting3.remove(1);
		            name.add(x2);
		            start.add(r1);
		            end.add(s1);
		            status.add("Confirmed");
		        }else {
		            if(seats4.get(r1-1)==0 && seats4.get(s1-1)==0){
		            System.out.println("4");
		            seats4.set(r1-1,1);
		            seats4.set(s1-1,1);
		            for(int i=0;i<li5.size();i++){
		                m2=li5.get(i);
		                seats4.set(m2,1);
		            }
		            li5.clear();
		            waiting.remove(1);
		            waiting1.remove(1);
		            waiting2.remove(1);
		            waiting3.remove(1);
		            name.add(x2);
		            start.add(r1);
		            end.add(s1);
		            status.add("Confirmed");
		        }else {
		            if(seats5.get(r1-1)==0 && seats5.get(s1-1)==0){
		            System.out.println("5");
		            seats5.set(r1-1,1);
		            seats5.set(s1-1,1);
		            for(int i=0;i<li5.size();i++){
		                m2=li5.get(i);
		                seats5.set(m2,1);
		            }
		            li5.clear();
		            waiting.remove(1);
		            waiting1.remove(1);
		            waiting2.remove(1);
		            waiting3.remove(1);
		            name.add(x2);
		            start.add(r1);
		            end.add(s1);
		            status.add("Confirmed");
		        
		        }
		        }
		        }
		        }
		        }
}





public static void waitinga2(){
   // r=waiting1.get(0);
    //s=waiting2.get(0);
   //r1=waiting1.get(1);
   //s1=waiting2.get(1);

	
	
	
   x3=waiting.get(2);
    r2=waiting1.get(2);
    s2=waiting2.get(2);
    for(int i=r2;i<s2-1;i++){
        li6.add(i);
      }
    if(seats1.get(r2-1)==0 && seats1.get(s2-1)==0){
        
		//System.out.println("1");
		seats1.set(r2-1,1);
		            seats1.set(s2-1,1);
		            for(int i=0;i<li6.size();i++){
		                m3=li6.get(i);
		                seats1.set(m3,1);
		            }
		            li6.clear();
		            waiting.remove(2);
		            waiting1.remove(2);
		            waiting2.remove(2);
		            waiting3.remove(2);
		            name.add(x3);
		            start.add(r2);
		            end.add(s2);
		            status.add("Confirmed");
		        }else {
		            if(seats2.get(r2-1)==0 && seats2.get(s2-1)==0){
		            System.out.println("2");
		            seats2.set(r2-1,1);
		            seats2.set(s2-1,1);
		            for(int i=0;i<li6.size();i++){
		                m3=li6.get(i);
		                seats2.set(m3,1);
		            }
		            li6.clear();

		            waiting.remove(2);
		            waiting1.remove(2);
		            waiting2.remove(2);
		            waiting3.remove(2);


		            name.add(x3);
		            start.add(r2);
		            end.add(s2);
		            status.add("Confirmed");
		        }else {
		            if(seats3.get(r2-1)==0 && seats3.get(s2-1)==0){
		            System.out.println("3");
		            seats3.set(r2-1,1);
		            seats3.set(s2-1,1);
		            for(int i=0;i<li6.size();i++){
		                m3=li6.get(i);
		                seats3.set(m3,1);
		            }
		            li6.clear();
		            waiting.remove(2);
		            waiting1.remove(2);
		            waiting2.remove(2);
		            waiting3.remove(2);
		            name.add(x3);
		            start.add(r2);
		            end.add(s2);
		            status.add("Confirmed");
		        }else {
		            if(seats4.get(r2-1)==0 && seats4.get(s2-1)==0){
		            System.out.println("4");
		            seats4.set(r2-1,1);
		            seats4.set(s2-1,1);
		            for(int i=0;i<li6.size();i++){
		                m3=li6.get(i);
		                seats4.set(m3,1);
		            }
		            li6.clear();
		            waiting.remove(2);
		            waiting1.remove(2);
		            waiting2.remove(2);
		            waiting3.remove(2);
		            name.add(x3);
		            start.add(r2);
		            end.add(s2);
		            status.add("Confirmed");
		        }else {
		            if(seats5.get(r2-1)==0 && seats5.get(s2-1)==0){
		            System.out.println("5");
		            seats5.set(r2-1,1);
		            seats5.set(s2-1,1);
		            for(int i=0;i<li6.size();i++){
		                m3=li6.get(i);
		                seats5.set(m3,1);
		            }
		            li6.clear();
		            waiting.remove(2);
		            waiting1.remove(2);
		            waiting2.remove(2);
		            waiting3.remove(2);
		            name.add(x3);
		            start.add(r2);
		            end.add(s2);
		            status.add("Confirmed");
		        
		        }
		        }
		        }
		        }
		        }
}
	public static void main(String[] args) {


	    seats1.add(0);
	    seats1.add(0);
	    seats1.add(0);
	    seats1.add(0);
	    seats1.add(0);
	    
	    seats2.add(0);
	    seats2.add(0);
	    seats2.add(0);
	    seats2.add(0);
	    seats2.add(0);
	    
	    seats3.add(0);
	    seats3.add(0);
	    seats3.add(0);
	    seats3.add(0);
	    seats3.add(0);
	    
	    seats4.add(0);
	    seats4.add(0);
	    seats4.add(0);
	    seats4.add(0);
	    seats4.add(0);
	    
	    seats5.add(0);
	    seats5.add(0);
	    seats5.add(0);
	    seats5.add(0);
	    seats5.add(0);

		do{


		    System.out.println("Welcome to Vehicle Booking :");

		    System.out.println("1.New User");
		    System.out.println("2.Existing User ");
		    System.out.println("3.Exit");

		    ch=sc.nextInt();
		    sc.nextLine();
		    System.out.print("\033[H\033[2J");  
            System.out.flush();  
		    switch(ch) {
		case 1:
		    System.out.println("Enter Your Username:");
		    a=sc.nextLine();
		    li.add(a);
		    System.out.println("Enter your Password :");
		    b=sc.nextInt();
		    sc.nextLine();
		    li1.add(b);
		    System.out.println("Thank You For Registering");
		    System.out.print("\033[H\033[2J");  
            System.out.flush(); 
		    break;
		case 2:
		    System.out.println("Enter Your Username:");
		    c=sc.nextLine();
		    ans=li.contains(c);
		    if(ans){
		        System.out.println("Enter your Password :");
		        d=li.indexOf(c);
		        
		        e=sc.nextInt();
		        sc.nextLine();
		        if(li1.get(d)==e){
		            System.out.println("Thank You For Registering");
		            System.out.print("\033[H\033[2J");
		            System.out.println("Welcome "+c);
		            user();
		        }else{
		            System.out.println("Enter a Valid Password :");
		        }
		    }else{
		        System.out.println("Enter a Valid Username :");
		    }
		    break;
		case 3:
		    
		    break;
		case 4:
		    System.out.println("Thank You");
		    break;
			
			
		}
		}while(ch!=3);

	}
} 
}