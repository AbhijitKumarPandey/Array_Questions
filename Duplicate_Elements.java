
public class Duplicate_Elements {
	public static void main(String[] args) {
		
		int arr[] = {56,87,45,34,32,98,87};
		for(int i=1; i<arr.length;i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]==arr[j]) {
					System.out.println("Duplicate number is " + arr[i]);
				}
			}
		}
	}

}
