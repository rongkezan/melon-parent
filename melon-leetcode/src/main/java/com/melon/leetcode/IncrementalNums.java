package com.melon.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * 找到递增序列的最长长度 （递归实现）
 * <p>
 * [1, 5, 2, 4, 3] 最长递增序列为 [1, 2, 4] or [1, 2, 3] 最长长度为3
 *
 * @author keith
 */
public class IncrementalNums {

    public static void main(String[] args) {
        int[] nums = {1, 5, 2, 4, 3};
        System.out.println(getMaxLengthInList(nums));
    }

    private static int getMaxLengthInList(int[] nums){
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            list.add(getMaxLength(nums, i));
        }
        return list.stream().max(Integer::compare).get();
    }

    private static int getMaxLength(int[] nums, int i) {
        if (i == nums.length - 1) {
            return 1;
        }
        int maxLen = 1;
        for (int j = i + 1; j < nums.length; j++) {
            if (nums[j] > nums[i]) {
                maxLen = Math.max(maxLen, getMaxLength(nums, j) + 1);
            }
        }
        return maxLen;
    }
}
