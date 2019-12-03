class MyMatrix{

public static void acceptMatrix(MyMatrix[][] marr,int count){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the no of rows");
int row=sc.nextInt();
System.out.println("Enter the no of columns");
int cols=sc.nextInt();
for(int i=0;i<marr.length;i++){

for(int j=0;j<marr[1].length;j++){

marr[i][j]=sc.nextInt();

}
}

}





}