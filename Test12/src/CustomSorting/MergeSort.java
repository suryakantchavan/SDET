package CustomSorting;

public class MergeSort {

	public static void mergetwo(int s1[], int s2[], int d[]) {
		int i = 0, j = 0, k = 0;

		while (i < s1.length && j < s2.length) {
			if (s1[i] < s2[j]) {
				d[k] = s1[i];
				i++;
				k++;
			}

			else {
				d[k] = s2[j];
				k++;
				j++;
			}
			
		}

			while (i < s1.length) {
				d[k] = s1[i];
				i++;
				k++;
			}
			while (j < s2.length) {
				d[k] = s2[j];
				k++;
				j++;
			}

		

	}
	


	public static void merge(int a[]) {
		if (a.length ==1) {
			return;
		}

		int b[] = new int[a.length/2];
		int c[] = new int[a.length - b.length];

		// copy half-half elements in both the array

		for (int i = 0; i < b.length; i++) {
			b[i] = a[i];
		}

		for (int i = c.length; i > 0; i--) {
			c[c.length - i] = a[a.length - i];

		}

		merge(b);
		merge(c);

		mergetwo(b, c, a);

	}
	

	public static void main(String[] args) {

		int arr[] = { 11, 4, 3, 5, 2, 5, 3, 7, 0, 3, 7, 8 };
		merge(arr);

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

		
		
	}
	//{4,3,5,1}
	//{0,3}

}
