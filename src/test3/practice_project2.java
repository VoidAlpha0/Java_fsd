package test3;

public class practice_project2 {
    public static void main(String[] args) {
        int[] nums = {9, 5, 7, 2, 1,15,0, 8, 3, 6, 4};
        int k=4;
        
        int fourthSmallest = findFourthSmallest(nums,k);
        
        System.out.println("The smallest element at position "+k+" is " + fourthSmallest);
    }
    
    public static int findFourthSmallest(int[] nums, int k) {
        if (nums.length < 4) {
            System.out.println("List does not have enough elements.");
            return -1;
        }
        
        int fourthSmallest = Integer.MIN_VALUE;
        int count = 0;
        
        while (count < k) {
            int min = Integer.MAX_VALUE;
            
            for (int num : nums) {
                if (num < min && num > fourthSmallest) {
                    min = num;
                }
            }
            
            fourthSmallest = min;
            count++;
        }
        
        return fourthSmallest;
    }
}

