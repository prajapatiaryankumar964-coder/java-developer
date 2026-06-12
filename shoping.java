import java.util.*;

class shoping
{

public static void main(String args[])
{

Scanner sc=new Scanner(System.in);
int price,qty,total,di=0,ne;
String Name,product;


System.out.println("\nenter Your name=");
Name=sc.next();
System.out.println("product name");
product=sc.next();
System.out.println("product price:");
price=sc.nextInt();
System.out.println("product qty");
qty=sc.nextInt();

total=price*qty;
System.out.println("total amount="+total);


if (total>=1500)
{
    di=total*15/100;
    System.out.println("total discount="+di);
}


else if (total>=1000)
{
    di=total*10/100;

    System.out.println("total discount="+di);
}
else if (total>=500)
{
    di=total*5/100;
    System.out.println("total discount="+di);
}
else if(total<500)
{    
   di=total*0;
    System.out.println("total discount="+di);
}

ne=total-di;

System.out.println("net price "+ne);
System.out.println("\t\tthank you for shoping");


System.out.println("");


}

}
