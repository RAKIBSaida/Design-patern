import java.util.Scanner;

public class App {
	
	public static void main(String[] args) throws  Exception{
		Context context=new Context();
		Scanner scanner=new Scanner(System.in);
		boolean fin=false;
		
		while (!fin) {
			System.out.println("donner la stratégie");
			String strategyClassName=scanner.nextLine();
			IStrategy strategy=(IStrategy) Class.forName(strategyClassName).newInstance();
			context.setStrategy(strategy);
			context.process();
			
		}
		
		
	}
	

}
