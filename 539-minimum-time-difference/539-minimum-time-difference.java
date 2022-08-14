class Solution {
    public int findMinDifference(List<String> timePoints) {
        int[] li= new int[timePoints.size()];
        int n=timePoints.size();
        for(int i=0;i<n;i++){
            li[i]=convertInt(timePoints.get(i));
        }
        Arrays.sort(li);
        int ans=Integer.MAX_VALUE;
        for(int i=1;i<n;i++){
            int diff=li[i]-li[i-1];
            diff=Math.min(diff,1440-diff);
            ans=Math.min(diff,ans);
        }
        int diff=li[n-1]-li[0];
            diff=Math.min(diff,1440-diff);
            ans=Math.min(diff,ans);
        
        return ans;
    }
    
    int convertInt(String s){
        char li[]=s.toCharArray();
        int hour=li[0]*10 +li[1];
        int min=li[3]*10+li[4];
        return hour*60+min;
    }
}