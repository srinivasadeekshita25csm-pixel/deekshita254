package basics;
	import java.util.Scanner;

	public class Roman {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter Roman numeral: ");
	        String s = sc.nextLine().toUpperCase();

	        int total = 0;
	        int previous = 0;

	        for (int i = s.length() - 1; i >= 0; i--) {
	            int value = 0;

	            switch (s.charAt(i)) {
	                case 'I': value = 1; break;
	                case 'V': value = 5; break;
	                case 'X': value = 10; break;
	                case 'L': value = 50; break;
	                case 'C': value = 100; break;
	                case 'D': value = 500; break;
	                case 'M': value = 1000; break;
	                default:
	                    System.out.println("Invalid Roman numeral");
	                    sc.close();
	                    return;
	            }

	            if (value < previous) {
	                total -= value;
	            } else {
	                total += value;
	            }

	            previous = value;
	        }

	        System.out.println("Integer value: " + total);
	        sc.close();
	    }
	}

	    