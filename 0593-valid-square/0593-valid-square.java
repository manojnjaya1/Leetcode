class Solution {
    public boolean validSquare(int[] p1, int[] p2, int[] p3, int[] p4) {
         Set<Integer>set =new HashSet<>();
        
        if(isSame(p1,p2)|| isSame(p1,p3)|| isSame(p1,p4)|| isSame(p2,p3)|| isSame(p2,p4)||isSame(p3,p4)) return false;
        
        set.add(dis(p1,p2));
        set.add(dis(p1,p3));
        set.add(dis(p1,p4));
        set.add(dis(p2,p3));
        set.add(dis(p2,p4));
        set.add(dis(p3,p4));
        
        return set.size()==2;
    }
    int dis(int[] p1,int[] p2){
        return (p2[0]-p1[0])*(p2[0]-p1[0])+(p2[1]-p1[1])*(p2[1]-p1[1]);
    }
    boolean isSame(int[] p1 ,int[] p2){
        return p1[0]==p2[0] && p1[1]==p2[1];
    }
}