import java.util.Scanner;
class praveenfor_m{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int n;
int fact=1;
System.out.println("enter the num to find the factorial:");
n=sc.nextInt();
for (int x=1;x<=n;x++){
fact*=x;
}
System.out.println("Factorial of the num :"+fact);
}
}
