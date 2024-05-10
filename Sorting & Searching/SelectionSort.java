import java.util.Arrays;

public class SelectionSort {
	
	public static void selectionSort(int arr[]) {
		
		for(int i=0;i<arr.length-1;i++) {
			int min=i;
			boolean flag=false;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]<arr[min]) {
					min=j;
					flag=true;
				}
			}
			if(min!=i&&flag) {
				int temp=arr[i];
				arr[i]=arr[min];
				arr[min]=temp;
			}
			else {
				break;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int att[]= {5,4,3,2,1};
		selectionSort(att);
		System.out.println(Arrays.toString(att));
		
		for(int a:att) {
			System.out.print(a);
		}
	}
}
