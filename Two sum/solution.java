class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map= new HashMap<Integer,Integer>();
        int diff;
        int[] answer = new int[2];
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],i);
        }
        
        for(int i=0;i<nums.length;i++){
            diff = target-nums[i];
            if(map.containsKey(diff) && map.get(diff)!=i){
                answer[0]=i;
                answer[1]=map.get(diff);
                break;
            }
        }
        return answer;
    }
}