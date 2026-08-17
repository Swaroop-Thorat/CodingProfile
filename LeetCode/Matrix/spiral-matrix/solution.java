class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
      int right=matrix[0].length-1 , bottom=matrix.length-1;
      int left=0 , top=0;
      int curr=1,r=0,c=0;
      List<Integer> list=new ArrayList<>();
      for(int i=0;i<matrix[0].length*matrix.length;i++){
        if(curr==1){
            while(c<=right){
              list.add(matrix[r][c]);
              i++;
              c++;
            }
            c--;
            i--;
            top++;
            r++;
            curr=2;
        }
        else if(curr==2){
            while(r<=bottom){
             list.add(matrix[r][c]);
              i++;
              r++;
            }
            i--;
            r--;
            right--;
            c--;
            curr=3;
        }
        else if(curr==3){
            while(c>=left){
              list.add(matrix[r][c]);
              i++;
              c--;
            }
            i--;
            c++;
            bottom--;
            r--;
            curr=4;
        }
        else{
            while(r>=top){
              list.add(matrix[r][c]);
              i++;
              r--;
            }
            i--;
            r++;
            left++;
            curr=1;
            c++;
        }
      }
      return list;  
    }
}