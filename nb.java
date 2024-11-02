import java.util.Scanner;
class nb{
public static void main(String[] args){
Scanner n= new Scanner(System.in);
int a;
System.out.println("Enter the value :");
a=n.nextInt();
int i=0;
while(i<=a){
if (i%2==0){
System.out.println("The number is Even");
i++;
}
else{
System.out.println("The number is Odd");
i++;
}

}


}}
