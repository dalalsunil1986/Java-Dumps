package topics;

class Student000{  
	 int rollno;  
	 String name;  
	 String city;  
	  
	 Student000(int rollno, String name, String city){  
	 this.rollno=rollno;  
	 this.name=name;  
	 this.city=city;  
	 }  
	  
	 public static void main(String args[]){  
	   Student000 s1=new Student000(101,"Raj","lucknow");  
	   Student000 s2=new Student000(102,"Vijay","ghaziabad");  
	     
	   System.out.println(s1);//compiler writes here s1.toString()  
	   System.out.println(s2);//compiler writes here s2.toString()  
	 }  
	}  
