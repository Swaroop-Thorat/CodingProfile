class Solution {
    public int[][] sortMatrix(int[][] grid) {
        int n=grid.length;
        for(int i=0;i<n;i++){
            List<Integer> list=new ArrayList<>();
            for(int j=0;i+j<n;j++){
                list.add(grid[i+j][j]);
            }

            list.sort(Collections.reverseOrder());

            for(int j=0;j+i<n;j++){
                grid[i+j][j]=list.get(j);
            }
        }

        for(int i=1;i<n;i++){
            List<Integer> list=new ArrayList<>();
            for(int j=0;i+j<n;j++){
                list.add(grid[j][j+i]);
            }

            Collections.sort(list);

            for(int j=0;j+i<n;j++){
                grid[j][j+i]=list.get(j);
            }
        }

        return grid;
    }
}