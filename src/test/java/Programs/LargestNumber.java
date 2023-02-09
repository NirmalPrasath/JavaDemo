package Programs;

public class LargestNumber {

	public static void main(String[] args) {
		
		int n[]= {10, 200, 3, 22, 89, 300, 19, 2};
		int temp=0;
		
		for(int i=0;i<n.length;i++)
		{
			for(int j=i+1;j<n.length;j++)
			{
				if(n[i]>n[j])
				{
					temp=n[i];
					n[i]=n[j];
					n[j]=temp;
				}
			}
		}
		System.out.println(n[n.length-1]);
		
		System.out.println(n[n.length-2]);
		
		System.out.println(n[0]);

	}

}
