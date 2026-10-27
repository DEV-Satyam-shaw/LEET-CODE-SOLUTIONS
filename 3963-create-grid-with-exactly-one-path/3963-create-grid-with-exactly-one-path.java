class Solution {
    public String[] createGrid(int m, int n) {

        String[] ans = new String[m];
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(i == 0 || j == n-1){
                    sb.append('.');
                }else {
                    sb.append('#');
                }
            }
            ans[i] = sb.toString();
            sb.delete(0,sb.length());
        }
        return ans;
    }
}