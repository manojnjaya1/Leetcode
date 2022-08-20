class Solution {
    public int nextGreaterElement(int n) {
        int st=n;
        int len=(int)(Math.log10(n)+1);
        if(len==1)return -1;
        int[] a=new int[len];
        
        for(int i=len-1;i>=0;i--){
            a[i]=n%10;
            n/=10;
        }
        int i=len-2;
        while(i>=0 && a[i]>=a[i+1])i--;
        if(i>=0){
            int j=len-1;
            
            while(a[i]>=a[j])j--;
            swap(i,j,a);
            
        }
        rev(i+1,a.length-1,a);
        int sum=0;
        for(int k=0;k<len;k++){
            sum=sum*10+a[k];
        }
        System.out.println(sum);
        if(sum>st)return sum;
        
        return -1;
    }
    void rev(int i,int j,int[] a){
        while(i<j)swap(i++,j--,a);
    }
    void swap(int i,int j,int[] a){
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }
}