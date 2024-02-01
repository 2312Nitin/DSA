class Solution {
    public int missingNumber(int[] nums) {
        int large =0;

        for (int i =0; i<nums.length;i++){
            if(large>nums[i]){
                large=nums[i];
            }
          
        

        }
         int n =nums.length;
          int Realsum = (n*(n+1))/2;
          int sum =0;
          for(int i =0; i<n; i++){
              sum = sum+nums[i];
          }
          int ans= Realsum-sum;
          return ans;
        
    }
}