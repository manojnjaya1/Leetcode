class Solution {
    public int[][] substringXorQueries(String s, int[][] queries) {
        int n=s.length();
        int m=queries.length;
        int[][] ans=new int[m][2];
        
//         for(int i=0;i<m;i++){
//             int a=queries[i][0];
//             int b=queries[i][1];
//             int c=a^b;
            
//             String res=Integer.toBinaryString(c);
//             int sz=res.length();
//             if(s.contains(res)){
//                 int idx=s.indexOf(res);
//                 ans[i][0]=idx;
//                 ans[i][1]=idx+sz-1;
//             }else{
//                 ans[i][0]=-1;
//                 ans[i][1]=-1;
//             }
//         }
        
        Map<Integer,int[]> map=new HashMap<>();
        
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='0'){
                map.putIfAbsent(0,new int[]{i,i});
                continue;
            }
            int val=0;
            for(int j=i;j<=Math.min(i+30,n-1);j++){
                val=(val<<1)+s.charAt(j)-'0';
                map.putIfAbsent(val,new int[]{i,j});
            }
        }
        
        int i=0;
        for(int[] q:queries){
            ans[i++]=map.getOrDefault(q[0]^q[1],new int[]{-1,-1});
        }
        return ans;
    }
}