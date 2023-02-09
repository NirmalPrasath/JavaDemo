package Programs;

public class AmstrongStrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=1537, a, c=0, temp;
		temp=n;
		
		while(n>0)
		{
			a=n%10;
			n=n/10;
			c=c+(a*a*a);
		}
		
		if (temp==c)
		{
			System.out.println("Amstrong Number " + temp);
		}
		else
		{
			System.out.println("Not Amstrong Number " + temp);
		}
		
		

	}

}
