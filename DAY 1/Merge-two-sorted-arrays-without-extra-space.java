https://takeuforward.org/data-structure/merge-two-sorted-arrays-without-extra-space/

public class Main {

  public static void main(String[] args) {
    int arr1[] = {1,4,7,8,10};
	int arr2[] = {2,3,9};
    System.out.println("Before merge:");
    for (int i = 0; i < arr1.length; i++) {
      System.out.print(arr1[i] + " ");
    }
    System.out.println();
    for (int i = 0; i < arr2.length; i++) {
      System.out.print(arr2[i] + " ");
    }
    System.out.println();
    merge(arr1, arr2, arr1.length, arr2.length);
    System.out.println("After merge:");
    for (int i = 0; i < arr1.length; i++) {
      System.out.print(arr1[i] + " ");
    }
    System.out.println();
    for (int i = 0; i < arr2.length; i++) {
      System.out.print(arr2[i] + " ");
    }

  }
  static void merge(int[] arr1, int arr2[], int n, int m) {
    for(int i = 0; i < arr1.length;i++){
		  if(arr1[i] > arr2[0]){
			  int temp = arr1[i];
			  arr1[i] = arr2[0];
			  arr2[0] = temp;
			  
			  int k;
			  int first = arr2[0];
			  for(k = 1 ; k < arr2.length && arr2[k] < first;k++){
				  arr2[k-1] = arr2[k];
			  }
			  arr2[k-1] = first;
		  }
	  }
	  
  }
}
