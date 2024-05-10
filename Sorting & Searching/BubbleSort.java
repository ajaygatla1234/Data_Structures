import java.util.Arrays;

public class BubbleSort {

	public static void bubbleSort(int arr[]) {
		
		for(int i=arr.length-1;i>0;i--) {
			boolean flag=false;
			for(int j=0;j<i;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					flag=true;
				}
			}
			if(!flag) {
				break;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int att[]= {5,4,3,2,1};
		bubbleSort(att);
		System.out.println(Arrays.toString(att));

		for(int a:att) {
			System.out.print(a);
		}
	}
}
