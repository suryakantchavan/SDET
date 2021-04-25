package LL;

public class Pattern {
	
	
	public static void main(String[] args) {
		
		for(int i=0;i<3;i++)
		{
			//printing the spaces
			for(int k=2-i;k>0;k=k-1)
			{
				System.out.print(" ");
			}
			
			for(int j=0;j<2*i+1;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
