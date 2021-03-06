package arrays;
// https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/ 



public class twoSumII {
    public static void main(String[] args) {
        SolutionTSII  s = new SolutionTSII ();
        int[] nums = {2,7,11,15};
        int target = 9;
        int[] result = s.twoSum(nums, target);
        System.out.println(result[0]+" "+result[1]);
    }
}

class SolutionTSII {
    public int[] twoSum(int[] numbers, int target) {
        
        int start = 0 ;
        int end =  numbers.length-1;
        
        while (start<end){
            if (numbers[start]+numbers[end]== target){
                return new int []{start+1,end+1};
            }else if (numbers[start]+numbers[end] > target){
                end--;
            }else{
                start++;
            }
        }
        return new int[]{-1,-1};
    }
}
