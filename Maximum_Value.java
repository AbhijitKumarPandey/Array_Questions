
public class Maximum_Value {
	public static void main(String[] args) {
		int arr[] = {6,4,5,3};
		int max = arr[0];
		for(int i=0; i<arr.length; i++) {
			if(arr[i]>max) {
				max = arr[i];
			}
			System.out.println(max);
		}
	}

}
