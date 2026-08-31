class Solution {
    public int singleNumber(int[] nums) {
        int val = 0;
        HashMap<Integer, Integer> seen = new HashMap<>();
        for (int num: nums){
            if (seen.containsKey(num)){
                seen.put(num, (seen.get(num) + 1));
            }
            else{
                seen.put(num, 1);
            }
        }
        for (int num: nums){
            if (seen.get(num) == 1){
                val = num;
                break;
            }
        }
        return val;
    }
}
