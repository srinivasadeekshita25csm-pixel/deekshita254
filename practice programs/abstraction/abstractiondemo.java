package inheritance;
abstract class Base {
	int x=9;
	
	void SayName( ) {
		System.out.println("My name is deekshita");
	}
	abstract void SayAge();
}
public class AbstractDemo extends Base {

	@Override
	void SayAge() {
		System.out.println("age from AbstractDemo is 19");
	}
public static void main(String[] args) {
	AbstractDemo ad = new AbstractDemo();
	System.out.println("value of x from Base is:" + ad.x);
	ad.SayName();
	ad.SayAge();
}
}
