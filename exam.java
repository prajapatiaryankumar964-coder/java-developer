import java.util.*;

class exam
{

public static void main(String args[])
{

Scanner sc=new Scanner(System.in);
int d=0,ut=0,r=0,w=0,at=0,yt=0;

String choice;

System.out.println("\n**************online exam***************");
System.out.println("que:1 > 5*2=");
System.out.println("(a)8 (b)9 (c)10 (d)skip");
choice=sc.next();
if (choice.equalsIgnoreCase("d"))
{
    yt= yt+1;
}
else if (choice.equalsIgnoreCase("c"))
{
    r=r+1;
    at=at+1;
}
else
{
    w=w+1;
    at=at+1;
}
System.out.println("que:2 > 5*2-2=");
System.out.println("(a)8 (b)9 (c)10 (d)skip");
choice=sc.next();
if (choice.equalsIgnoreCase("d"))
{
    ut=ut+1;
}
else if (choice.equalsIgnoreCase("a"))
{
    r=r+1;
    at=at+1;
}
System.out.println("que:3 > 72*2=");
System.out.println("(a)180 (b)150 (c)100 (d)skip");
choice=sc.next();

if (choice.equalsIgnoreCase("d"))
{
    ut=ut+1;
}
else if (choice.equalsIgnoreCase("b"))
{
    r=r+1;
    at=at+1;
}
else
{
    w=w+1;
    at=at+1;
}
System.out.println("que:4 > 55+20=");
System.out.println("(a)85 (b)90 (c)75 (d)skip");
choice=sc.next();
if (choice.equalsIgnoreCase("d"))
{
    ut=ut+1;
}
else if (choice.equalsIgnoreCase("c"))
{
    r=r+1;
    at=at+1;
}
else
{
    w=w+1;
    at=at+1;
}
System.out.println("que:5 > 5+2+6+7=");
System.out.println("(a)20 (b)19 (c)21 (d)skip");
choice=sc.next();
if (choice.equalsIgnoreCase("d"))
{
    ut=ut+1;
}
else if (choice.equalsIgnoreCase("a"))
{
    r=r+1;
    at=at+1;
}
else
{
    w=w+1;
    at=at+1;
}
System.out.println("\n**************online exam result***************");
System.out.println("attand ans="+at);
System.out.println("unattend ans="+ut);
System.out.println("right ans="+r);
System.out.println("wrong ans="+w);
System.out.println("total marks="+(r*5));
System.out.println("cut of marks="+(w*2));
System.out.println("obt marks="+(r*5-w*2));

}

}
