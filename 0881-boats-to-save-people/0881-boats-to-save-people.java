class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int n=people.length;
        
        int i=0;
        int j=n-1;
        int boats=0;
        while(i<=j){
            if(people[j]==limit){
                boats++;
                j--;
            }else if (people[j]+people[i]<=limit){
                boats++;
                i++;
                j--;
            }else {
                boats++;
                j--;
            }
        }
        return boats;
    }
}