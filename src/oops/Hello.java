package oops;

public class Hello {
	String title;
	int value;
	public Hello(){
		title+="World";
	}
	public Hello(int value){
		this.value=value;
		title="Hello";
		Hello();
	}
}
Hello c = new Hello(5);
System.out.println(c.title);
//Compilation fails