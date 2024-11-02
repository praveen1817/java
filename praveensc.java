import java.util.Scanner;
class praveensc{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int marks;
System.out.println("enter the mark of the student:");
marks=sc.nextInt();
switch (marks){
case (marks>80):
System.out.println("good");
break;
case (marks<25):
System.out.println("Poor");
break;
default:
System.out.println("Average");
}
}
}

