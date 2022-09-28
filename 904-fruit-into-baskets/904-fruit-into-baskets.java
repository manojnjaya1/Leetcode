class Solution {
    public int totalFruit(int[] fruits) {
       Map<Integer,Integer> m=new HashMap<>() ;
        int l=0;
        int h=0;
        int maxi=0;
        int n=fruits.length;
        while(h<n){
            m.put(fruits[h],m.getOrDefault(fruits[h],0)+1);
            
            while(m.size()>2){
                m.put(fruits[l],m.getOrDefault(fruits[l],0)-1);
                if(m.get(fruits[l])==0)
                    m.remove(fruits[l]);
                l++;
            }
            
            maxi=Math.max(maxi,h-l+1);
            h++;
        }
        return maxi;
    }
}