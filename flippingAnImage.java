class Solution {
    public void flip(int i,int[][] image,int n){
        int l = 0;
        int r = n-1;
        while(l<r){
            int temp=image[i][l];
            image[i][l] = image[i][r];
            image[i][r] = temp;
            r--;
            l++;
        }
    }
    public void invert(int i,int[][] image,int n){
        for(int j=0;j<n;j++){
            if(image[i][j]==1) image[i][j] = 0;
            else image[i][j]=1;
        }
    }
    public int[][] flipAndInvertImage(int[][] image) {
        int n = image.length;
        for(int i = 0 ;i<n;i++){
            flip(i,image,n);
            invert(i,image,n);
        }
       return image; 
    }
}
