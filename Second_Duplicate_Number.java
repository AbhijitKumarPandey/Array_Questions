
public class Second_Duplicate_Number {
	public static void main(String[] args) {
		int arr[] = {4,5,8,9,2,4,8};
		for(int i=1; i<arr.length;i++) {
			for(int j=i+1; i<arr.length; i++) {
				if(arr[i]==arr[j]) {
					System.out.println("Second Duplicate Number is " + arr[i]);
				}
			}
		}
	}

}
