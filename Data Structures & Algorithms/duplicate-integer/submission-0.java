class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer , Integer> map = new HashMap<>();

        for(int ans : nums){
            map.put(ans , map.getOrDefault(ans , 0) + 1);
        }
        for(int ans : map.keySet()){
            if(map.get(ans) > 1){
                return true;
            }
            // else{
            //     return false;
            // }
        }
        return false;
    }
}