package loopdemo;

public class DoWhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//logic will execute atleas once and then check the condition
		
		int ticket = 75;
		System.out.println("loop started");
		do {
			System.out.println("Current Ticket Number"+ticket);
			ticket++;
		}while(ticket<100);

	}

}
