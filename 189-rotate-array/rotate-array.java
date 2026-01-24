class Solution {
    public void rotate(int[] nums, int k) {
        k%= nums.length;
        rotate1(nums,0,nums.length-1);
        rotate1(nums,0,k-1);
        rotate1(nums,k,nums.length-1);
    }
    public void rotate1(int [] nums, int s, int e){
        while(s<e){
            int temp = nums[s];
            nums[s]=nums[e];
            nums[e]=temp;
            s++;
            e--;
        }
    }
}
