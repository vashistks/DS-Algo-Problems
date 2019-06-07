class Solution {
    public String findContestMatch(int n) {
     String[] team = new String[n];
        for(int i=1;i<=n;i++){
            team[i-1]=""+i;
        }
        
        while(n>1){
            for(int j=0;j<n/2;j++){
                team[j] = "("+team[j]+","+team[n-j-1]+")";
            }
            n/=2;
        }
        return team[0];
    }
}