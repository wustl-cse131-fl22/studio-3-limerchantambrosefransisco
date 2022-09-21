package studio3;
import java.util.Scanner; 
public class Sieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in= new Scanner(System.in);
		
		System.out.println("Choose a number:"); 
		int n = in.nextInt(); 
		
		int [] prime = new int[n]; 
		
		//assign values into array 
		for (int i=0;i< prime.length; i++ )
		{
			prime[i]=i; 
			//System.out.println(prime[i]); 

		}
		
		
		//goes through all numbers  
		for (int i=2;i< prime.length; i++ )
		{
			// see if it is divisible 
			for (int a=i*i; a<prime.length;a= a+i)
			{
				//change value in array to -1 (not prime)
				prime[a]=-1; 

			}
			if (prime[i]!=-1)
			{
			System.out.println(prime[i]); 
			}
		}
		
	}

}
