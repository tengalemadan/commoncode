package lambda;

public class ReverseArray {

	public static void main(String[] args) {
		
		int a[]= {1,4,3,2};
		
		
		for (int i = 0,j=a.length-1; i < (a.length)/2; i++,j--) {
			
			int t=a[i];
			a[i]=a[j];
			a[j]=t;
			
		}
		
		for (int i : a) {
			System.out.println(i);
		}
	}

}
