package day7;

public class Ex3_Array3_sort {

	public static void main(String[] args) {
		// 배열정열을 이용한 배열 정렬 예제
		int arr[] = {10, 5, 18, 20, 1};
		
		for(int i=0; i<arr.length-1; i++) {
			for(int j=0; j<arr.length-1-i; j++) {
				if(arr[j] > arr[j+1]) {
					int tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
				}
			}
		}
		for (int i=0 ; i<arr.length ; i++)
			System.out.print(arr[i]  + " ");
	}

}
