int findNumbers(int* nums, int numsSize) {
    
        int ans = 0;
        for(int i=0; i<numsSize; i++){
            int count = 0;
            while(nums[i] != 0){
                nums[i] /= 10;
                count++;
            }
            if(count % 2 == 0){
                ans++;
            }
        }
        return ans;
}