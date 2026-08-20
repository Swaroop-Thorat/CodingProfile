class Solution {
    static int dirR[] = {-1,1,0,0};
    static int dirC[] = {0,0,-1,1};
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
       int curr=image[sr][sc];
       int[][] res=new int[image.length][image[0].length];
       for (int i = 0; i < image.length; i++) {
         res[i] = image[i].clone(); 
        } 
       f(image,res,sr,sc,color,curr);
       return res; 
    }
    void f(int[][] img,int[][] res,int sr, int sc , int color , int curr){
       
        res[sr][sc]=color;
        for(int i=0;i<4;i++){
                int r=sr+dirR[i];
                int c=sc+dirC[i];
                if(r<img.length && r>=0 && c<img[0].length && c>=0 && res[r][c] != color && img[r][c] == curr){
                f(img,res,r,c,color,curr);
             }
        }
    }
}