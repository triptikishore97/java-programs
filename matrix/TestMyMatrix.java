class TestMyMatrix{

public static void main(String args[]){

int choice;
MyMatrix[][] marr=new MyMatrix[5];
do{
Sytem.out.println("1.Accept Matrix");
Sytem.out.println("2.Transpose Matrix");
Sytem.out.println("3.Find Sum of Matrix by rows");
Sytem.out.println("4.Find Sum of Matrix by columns");
Sytem.out.println("5.Display");
Sytem.out.println("6.Exit");
System.out.println("choice:");
Scanner sc=new Scanner(System.in);
switch(choice){
case 1:
	MyMatrix.acceptMatrix();
	break;
case 5:
	MyMatrix.displayMatrix(marr);
	break:



}


}while(choice!=6);



}