import java.util.*;

class Day2 {
    public static void main(String args[]) {
	Bank s = new SBI();
	s.withdraw();
	Bank h = new HDFC();
	h.deposit();
	SBI s1 = new SBI();
	s1.loan();

        	
	
	}
   }
	abstract class Bank{
		abstract void withdraw();
		abstract void deposit();
	}
	class SBI extends Bank{
		void withdraw(){
			System.out.println("SBI wd");
		}
		void deposit(){
			System.out.println("SBI Dp");
		}
		void loan(){
			System.out.println("Sbi loan");
		}
	}
	class HDFC extends Bank{
		void withdraw(){
			System.out.println("HDFC wd");
		}
		void deposit(){
			System.out.println("HDFC dp");
		}
	}

		