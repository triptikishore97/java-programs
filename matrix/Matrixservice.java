class MatrixService{

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

void transpose(int A[][N], int B[][N]) 
{ 
    int i, j; 
    for (i = 0; i < N; i++) 
        for (j = 0; j < N; j++) 
            B[i][j] = A[j][i]; 
 System.out.print("Result matrix is \n"); 
        for (i = 0; i < N; i++) 
        { 
            for (j = 0; j < N; j++) 
            System.out.print(B[i][j] + " "); 
            System.out.print("\n"); 
        } 
} 