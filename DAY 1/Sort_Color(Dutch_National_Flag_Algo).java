class Solution {
	void sortTheArray (int[] A) {
	    // add your logic here
		int start = 0;
		int end = A.length - 1;
		int idx = 0;
		
		while(idx <= end){
			if(A[idx] == 0){
				A[idx] = A[start];
				A[start] = 0;
				start++;
			}else if(A[idx] == 2){
				A[idx] = A[end];
				A[end] = 2;
				end--;
				idx--;
			}
			idx++;
		}
	}
}
