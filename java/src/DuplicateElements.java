
public class DuplicateElements {

	public static void main(String[] args) {

		int[] arr = {16, 112, 23, 23,16, 45, 66, 45, 78,16 };

		for(int i = 0;i<arr.length;i++) {
			
			boolean check = false;
			
//			check previous element
			
			for(int k = 0;k<i;k++) {
				if(arr[k] == arr[i]) {
					check = true;
					break;
				}
			}
			if(check) {
				continue;
			}
			//check next elements
			for(int j = i + 1;j<arr.length;j++) {
				if(arr[i] == arr[j]) {
					System.out.println(arr[i]);
					break;
				}
			}
		}

	}

}
