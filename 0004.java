class Solution {
    public double findMedianSortedArrays(int[] x, int[] y) {
        int m=x.length+y.length;
        int [] res= new int[m];
        int k=0;
        for(int i=0;i<x.length;i++){
            res[k++] =x[i];
        }
        for(int j=0;j<y.length;j++ )
        {
            res[k++]=y[j];
        }
        Arrays.sort(res);
         int mid = res.length / 2;
        if(res.length % 2 !=0){
            
            return (double) res[mid];
        }
        return (double) (res[mid -1 ] + res[mid])/2;
        
    }
    }
   
