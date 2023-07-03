package test3;

public class longestIncreassingSubsequence {
    public static void main(String[] args) {
        int[] nums = {11 , 20, 5, 25, 30, 28, 11, 80, 99};
        System.out.println("Given Sequence ");
        for(int i=0;i<nums.length;i++) {
        	System.out.print(nums[i]+" ");
        }
        System.out.println();
        int[] lis = findLongestIncreasingSubsequence(nums);
        
        System.out.println("Longest Increasing Subsequence:");
        for (int num : lis) {
            System.out.print(num + " ");
        }
    }
    
    public static int[] findLongestIncreasingSubsequence(int[] nums) {
        int n = nums.length;
        int[] lis = new int[n];
        
        for (int i = 0; i < n; i++) {
            lis[i] = 1;
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j] && lis[j] + 1 > lis[i]) {
                    lis[i] = lis[j] + 1;
                }
            }
        }
        
        int maxLength = 0;
        int endIndex = 0;
        
        for (int i = 0; i < n; i++) {
            if (lis[i] > maxLength) {
                maxLength = lis[i];
                endIndex = i;
            }
        }
     
        int[] longestSubsequence = new int[maxLength];
        longestSubsequence[maxLength - 1] = nums[endIndex];
        
        int currentLength = maxLength - 1;
        
        for (int i = endIndex - 1; i >= 0; i--) {
            if (nums[i] < nums[endIndex] && lis[i] == currentLength) {
                longestSubsequence[currentLength - 1] = nums[i];
                endIndex = i;
                currentLength--;
            }
        }
        
        return longestSubsequence;
    }
}
