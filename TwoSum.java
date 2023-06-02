import java.util.Arrays;

/** 
Given an array of integers nums and an integer target, return indices of the two numbers such
that they add up to target.
You may assume that each input would have exactly one solution, and you may not use the same 
element twice.
You can return the answer in any order.

Example 1:
Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

Example 2:
Input: nums = [3,2,4], target = 6
Output: [1,2]

Example 3:
Input: nums = [3,3], target = 6
Output: [0,1]
 
Constraints:
2 <= nums.length <= 104
-109 <= nums[i] <= 109
-109 <= target <= 109
Only one valid answer exists.
 
Follow-up: Can you come up with an algorithm that is less than O(n2) time complexity?
*/
class ArrayOfIndices{
    // method to return an array of indices
    public int[] indicesOfTwoElems(int[] arr, int target){
        int[] indicesArray = new int[2];
        for(int i = 0; i< arr.length; i++){
            for(int j = i + 1; j< arr.length; j++){
                if(arr[i] + arr[j] == target){
                    indicesArray[0] = i;
                    indicesArray[1] = j;
                    return indicesArray;
                }
            }
        }
        return arr;
    }
}
public class TwoSum{
    public static void main(String[]args){
        ArrayOfIndices ai = new ArrayOfIndices();
        int[] arr1 = {2,7,11,15};

        int[] result = ai.indicesOfTwoElems(arr1, 9);
        System.out.println(Arrays.toString(result));

        int[] arr2 = {3,2,4}; 
        int target = 6;
        int[] result2 = ai.indicesOfTwoElems(arr2, target);
        System.out.println(Arrays.toString(result2));
        // 2nd way to display
        System.out.println(Arrays.toString(ai.indicesOfTwoElems(new int[]{3, 2, 4}, 6)));


    }
}

// class Solution {
//     public int[] twoSum(int[] nums, int target) {
//         for(int i = 0; i < nums.length(); i++){
//             for(let j = i + 1; j < nums.length(); j++){
//                 if(nums[i] + nums[j] == target){
//                     return [i, j]
//                 }
//             }
//         }
//     }
// }