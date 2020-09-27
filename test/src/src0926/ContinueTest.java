public class ContinueTest {
	public static void main(String[] args) {
		int k=0;
		for(int i=1;i<=100;i++)
		{
			if(i%2!=0)
				continue;
			System.out.print(i+" ");
			k++;
			if(k%10==0)
				System.out.println();
		}
	}
}