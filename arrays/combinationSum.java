package arrays;

// https://leetcode.com/problems/combination-sum/

import java.util.ArrayList;
import java.util.List;

public class combinationSum{
    public static void main(String[] args) {
        
        SolutionCS solution = new SolutionCS();
        System.out.println(solution.combinationSum(new int[]{2,3,6,7}, 7));

    }
}

class SolutionCS {


    // Submitted by @Jiganesh
    
    // Runtime: 1 ms, faster than 100.00% of Java online submissions for Combination Sum.
    // Memory Usage: 42.4 MB, less than 43.34% of Java online submissions for Combination Sum.
    public List<List<Integer>> combinationSum(int[] candidates, int target) {

        List<List<Integer>> result = new ArrayList<>();
        List<Integer> array = new ArrayList<>();
        int start =0;
        

        return helper(candidates, target, array, start, result);   
    }

    public List<List<Integer>> helper(int[] candidates, int target, List<Integer> array, int start, List<List<Integer>> result){
        if(target == 0){
            result.add(new ArrayList<>(array));
            return result;
        }

        if (target < 0) return null ;

        for(int i = start; i < candidates.length; i++){
            if(target - candidates[i] >= 0){
                array.add(candidates[i]);
                helper(candidates, target - candidates[i], array, i, result);
                array.remove(array.size() - 1);
            }
        }
        return result;
    }
}