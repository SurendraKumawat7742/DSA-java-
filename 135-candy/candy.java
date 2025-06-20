class Solution {
    public int candy(int[] ratings) {
        int n = ratings.length;
        int count = 0;
        int candy[] = new int[n];
        for(int i=0; i<n; i++){
            candy[i] = 1;
        }
        for(int i=1; i<n; i++){
            if(ratings[i] > ratings[i-1]){
                candy[i] = candy[i-1]+1;
            }
        }
        for(int i=n-1; i>0; i--){
            if(ratings[i-1] > ratings[i]){
                candy[i-1] = Math.max(candy[i]+1 , candy[i-1]);
            }
            count += candy[i-1];
        }
        // int sum = 0;
        // for(int i=0; i<candy.length; i++){
        //     sum += candy[i];
        // }
        // return sum;
        return count + candy[n-1];
    }
}