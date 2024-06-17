package Excersice;

public class RemoveDuplicate {
        public int removeDuplicates(int[] nums) {
            if (nums.length == 0) {
                return 0;
            }
    
            int uniqueIndex = 1;
    
            for (int i = 1; i < nums.length; i++) {
                if (nums[i] != nums[i - 1]) {
                    System.out.print("1st "+nums[uniqueIndex]+" ");
                    nums[uniqueIndex] = nums[i];
                    System.out.println("2nd "+nums[uniqueIndex]);

                    uniqueIndex++;
                }
            }
    
            return uniqueIndex;
        }
    
        public static void main(String[] args) {
            RemoveDuplicate solution = new RemoveDuplicate();
            int[] nums = {1, 1, 2, 2, 3, 3, 4, 4, 5, 5};
            int length = solution.removeDuplicates(nums);
            System.out.println("Length of array after removing duplicates: " + length);
            for (int i = 0; i < length; i++) {
                System.out.print(nums[i] + " ");
            }
        }
    
}
