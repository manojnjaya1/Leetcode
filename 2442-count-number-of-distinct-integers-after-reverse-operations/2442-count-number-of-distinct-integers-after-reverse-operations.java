class Solution {
    public int countDistinctIntegers(int[] nums) {
        int n=nums.length;
       Set<Integer> s=new HashSet<>();
        for(int i:nums)s.add(i);
        for(int i=0;i<n;i++){
        int number=nums[i]    ;
            int reverse=0;
       
while(number != 0)   
{  
int remainder = number % 10;  
reverse = reverse * 10 + remainder;  
number = number/10;  
}  
            s.add(reverse);
             }
        return s.size();
    }
}