class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        

        int n = matrix.length;    
		int[] arr = new int[n*n];
		int m=0;
		
		
		for(int i =0; i< matrix.length; i++) {
			for(int j=0; j<matrix[0].length; j++) {
				arr[m]= matrix[i][j];
				m++;
			}
			
		}
		
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println(arr[k-1]);
		
		return arr[k-1];
    }
}
