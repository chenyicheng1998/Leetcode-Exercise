package twoSum;

import java.util.HashMap;

public class Solution {
	// Brute Force
	// N is the size of nums
    // Time Complexity: O(N^2)
    // Space COmplexity: O(1)
	/*
	public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                int sum = nums[i] + nums[j];
                if (sum == target) {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        return result;
    }
	*/
	
	// HashMap
	// N is the size of nums
    // Time Complexity: O(N)
    // Space COmplexity: O(N)
	public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int j = 0; j < nums.length; j++) {
            int diff = target - nums[j];
            if (map.containsKey(diff) && map.get(diff) != j) {
                result[0] = j;
                result[1] = map.get(diff);
                return result;
            }
        }
        return result;
    }
	
	
	public static void main(String[] args) {
		int[] nums = {3, 2, 4};
		int[] result = twoSum(nums, 6);
		for (int x : result) {
			System.out.println(x);
		}
	}
}
