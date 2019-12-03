class TestBook{

public static void main(String[] args)
{
int count=0;
Book[] barr=new Book[50];
int choice;
do{
System.out.println("1.Add Book Details");
System.out.println("2.Search Book By author name");
System.out.println("3.display  Books with pages greater than given pages");
System.out.println("4.display  Books with price lesser than given price");
System.out.println("5.Modify bokk details");
System.out.println("6.Display data");
System.out.println("7.exit");
System.out.println("Choice is:");
Scanner sc=new Scanner(System.in);
choice=sc.nextInt();
switch(choice){

case 1:
	BookService.addBook(barr,count);
	count++;
        break;
case 2:
	System.out.println("Enter the Name");
	String anm=sc.next();
	int pos=BookService.searchByName(barr,nm,count);
	if(pos==-1){
	System.out.println(anm+"not found");
        }
	else{
	System.out.println(anm+"found")
	}
case 6:
	BookService.displayData(barr,count);


}




}while(choice!=7)


}


}