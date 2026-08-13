package javacore;

     public class ConDemoEx {
	    // class or instance variables
		int rollNo;
	    String name;          // string always starts with capital as it is not datatype but a class in java
	    float fee;
		
		// constructor
		public ConDemoEx(int i,String n, float f) {
		 this.rollNo = i;
		 this.name= n;
		 this.fee= f;
		}
		void sample(){
			System.out.println("ROLL NO is:" + this.rollNo);
			System.out.println("NAME is:" + this.name);
			System.out.println("FEE is:" + this.fee);
		}
		void example() {
			System.out.println("some other method named example");
		}
		
		public static void main(String[] args) {
			System.out.println("This is main method..!");
			ConDemoEx cd = new ConDemoEx(254,"ammu", 5000.00f);
			cd.sample();
			cd.example();
		}
}
