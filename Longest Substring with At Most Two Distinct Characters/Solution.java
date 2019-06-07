class Solution {
    public int lengthOfLongestSubstringTwoDistinct(String s) {
        if(s.length() == 0) return 0;
        int maxi = 0;
        int left =0;
        HashMap<Character,Integer> map = new HashMap<Character,Integer>();
        for(int right=0;right<s.length();right++){
            map.put(s.charAt(right),map.getOrDefault(s.charAt(right),0)+1);
            //if(map.size()>2){
                while(map.size()>2){
                map.replace(s.charAt(left),map.get(s.charAt(left))-1);
                map.remove(s.charAt(left),0);
                left++;
                }
            //}
            maxi = Math.max(maxi,right-left+1);
        }
        return maxi;
    }
}