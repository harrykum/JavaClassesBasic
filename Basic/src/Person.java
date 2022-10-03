public class Person {
	String name;
	int age;
	String place;

	public static void main(String[] args) {
	Person p1=new Person();
	p1.name="ajay";
	p1.age=12;
	p1.place="punjab";
	System.out.println("s1.object");
	System.out.println(p1.name);
	System.out.println(p1.age);
	System.out.println(p1.place);

	Person p2=new Person();
	p2.name="Raj";
	p2.age=22;
	System.out.println();
	p2.place="banglore";
	System.out.println("s2.object");
	System.out.println(p2.name+" "+p2.age+" "+p2.place);
	System.out.println(p2.age);
	System.out.println(p2.place);
	}

}
