Class Book
{

private int id;
private String name;
private int pages;
private float price;
private String author:


Book(){
System.out.println("in default constructor");
this.id=id;
this.name=name;
this.pages=pages;
this.price=price;
this.author=author;
}
Book(int id,String name,int pages,float price,String author){
System.out.println("in parameter constructor");
this.id=id;
this.name=name;
this.pages=pages;
this.price=price;
this.author=author;
}

void setId(int id){
this.id=id;

}
void setName(String name){
this.name=name;
}
void setPages(int pages){
this.pages=pages;
}
void setPrice(float price){
this.price=price;
}
void setName(String author){
this.author=author;
}
String getId(){
 return this.id;
}

String getName(){
 return this.name
}
int getPages(){
 return this.pages;
}
float getPrice(){
 return this.id;
}
String getAuthor(){
 return this.author;
}
public String toString(){
return "Id:"+this.id+"\n Name:"+ this.name +"\n pages"+ this.pages+"\n price"+this.price+"\n author" +this.author;
}
}