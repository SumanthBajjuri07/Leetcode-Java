class Solution {
    public void rotate(int[][] matrix) {
        

        for(int i =0; i<matrix.length; i++ ) {
			
			for(int j =0; j<matrix[i].length; j++) {
				
				if(i<=j) {
				int temp = matrix[i][j];
				matrix[i][j] = matrix[j][i];
				matrix[j][i] = temp;
				}
			}
		}
		
		
		
		
		for(int i =0; i<matrix.length; i++) {
			for(int j =0; j<matrix[i].length; j++) {
				
				System.out.print(matrix[i][j]);
			}

				System.out.println(" ");
		}
		
		
		
		
		int c = matrix[0].length;
		for(int i =0; i<matrix.length; i++) {
			for(int j =0; j<matrix[i].length/2; j++) {
				
				int temp = matrix[i][j];
				matrix[i][j] = matrix[i][c-j-1];
				matrix[i][c-j-1] = temp;
			}


		}
		
		
		for(int i =0; i<matrix.length; i++) {
			for(int j =0; j<matrix[i].length; j++) {
				
				System.out.print(matrix[i][j]);
			}

				System.out.println(" ");
		}
		
		
		


    }
}
