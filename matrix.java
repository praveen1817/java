class matrix{
public static void main(String[] args){
int[][] mat=new int[4][3];
mat[0][1]=1;
mat[0][0]=1;
mat[0][2]=3;
mat[3][2]=12;
for (int i=0;i<4;i++){
for(int j=0;j<3;j++){
System.out.print(mat[i][j]);
}
System.out.println();

}
}

}
