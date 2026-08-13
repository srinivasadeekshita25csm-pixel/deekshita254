package inheritance;


class First{
	int x =10;
	float cal_si(float p, int t,float roi) {
		float si = (p*t*roi)/100;
		return si;
	}
}
class Second extends First {
	@Override
	float cal_si(float p, int t,float roi) {
		float si = (p*t*roi)/10;
		return si;
		}
	void access() {
		float result = cal_si(10000,3,23.2f);
		System.out.println("Si value is:" + result);
	
}}
class Three extends Two {
	@Override
	float cal_si(float p, int t,float roi) {
		float si = (p*t*roi)/1000;
		return si;
		}
	void access() {
		float result = cal_si(10000,3,23.2f);
		System.out.println("Si value is:" + result);
	
}}


public class Multiple2 {public static void main(String[] args) {
	Three three = new Three();
	three.access();
}

}
