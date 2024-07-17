class FindTheDuplicateNumber {
    public static void main(String args[]){
        int nums[] = {1,2,1,3,4};
        int result = findDuplicate(nums);
        System.out.println(result);
    }
    public static int findDuplicate(int[] nums) {
        int slow = nums[0];
        int fast = nums[0];
        
        do {
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while (slow != fast);
        slow = nums[0];
        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }
        
        return slow;
    }
}