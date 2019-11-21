package lambda;

public class DigonalDiffrence {

	public static void main(String[] args) {
		int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
		int d1=0,d2=0;
		for (int i = 0; i < arr.length; i++) {
			
			//System.out.println(arr[i][i]);
			d1=arr[i][i]+d1;
			//System.out.println(arr[i][(arr.length-1-i)]);
			//System.out.println("len:"+);
			d2=arr[i][(arr.length-1-i)]+d2;
		}
		System.out.println("d1:"+d1);
		System.out.println("d2:"+d2);
		System.out.println("Diffrence:"+Math.abs((d1-d2)));
		System.out.println(1/3.0);	
		
	}

}
