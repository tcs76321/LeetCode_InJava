// Two Sum

// One-Pass Hash Table ***from the Solutions***
// 0 ms, faster than 100.00% of Java online submissions
// 39.2 MB, less than 53.41% of Java online submissions

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int i;
        for (i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}

//Brute Force
//  Runtime: 0 ms
//      *Wait what? 0ms rt???*
//  Memory Usage: 39.1 MB

// runtime beats 100.00 % of java submission
// memory usage beats 64.64 % of java submissions

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
