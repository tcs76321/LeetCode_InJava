//One-Pass Hash Table
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        result[0] = result [1] = -1;
        
        
    }
}

//Brute Force
//  Runtime: 0 ms
//      *Wait what? 0ms rt???*
//  Memory Usage: 39.1 MB

// class Solution {
//     public int[] twoSum(int[] nums, int target) {
        
//         int[] result = new int[2];
//         result[0] = result [1] = -1;
        
//         int i,j;
        
//         for(i = 0; i < nums.length-1; i++){
//             for(j=i+1; j < nums.length; j++){
//                 if(nums[i] + nums[j] == target){
//                     result[0] = i;
//                     result[1] = j;
                    
//                     return result;
//                 }
//             }
//         }
//         return result;
//     }
// }
