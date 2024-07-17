class SortColors {
    public static void main(String[] args) {
        int nums[] = {2,0,1};
        sortColors(nums);
        
        for(int num : nums) {
            System.out.print(num + " ");
        }
    }

    public static void sortColors(int[] nums) {
        int low = 0;
        int mid = 0;
        int high = nums.length - 1;

        while (mid <= high) {
            switch (nums[mid]) {
                case 0:
                    {
                        int temp = nums[low];
                        nums[low] = nums[mid];
                        nums[mid] = temp;
                        low++;
                        mid++;
                        break;
                    }
                case 1:
                    mid++;
                    break;
                default:
                    {
                        int temp = nums[mid];
                        nums[mid] = nums[high];
                        nums[high] = temp;
                        high--;
                        break;
                    }
            }
        }
    }
}
