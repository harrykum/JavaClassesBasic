
public class Bike {
int price;
String name;
String brand;
	public static void main(String[] args) {
		Bike b1=new Bike();
		b1.name="hayabhusa";
		b1.price=2500000;
		b1.brand="suzuki";
		System.out.println(b1.name+" "+b1.price+" "+b1.brand);
		
		Bike b2=new Bike();
		b2.name="R1";
		b2.price=2000000;
		b2.brand="Yamaha";
		System.out.println(b2.name+" "+b2.price+" "+b2.brand);
	}

}
