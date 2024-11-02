class recursion{
public static void fact(int n,int i ,int fac){
if(i==n){
fac*=i;
System.out.println(fac);
}
else{
fac*=i;
fact(n,i+1,fac);
}
}
public static void main(String[]args){
fact(10,1,1);
}

}
