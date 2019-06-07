/* The knows API is defined in the parent class Relation.
      boolean knows(int a, int b); */

public class Solution extends Relation {
    public int findCelebrity(int n) {
        if(n==0) return -1;
        if(n==1) return 0;
        
        Stack<Integer> st = new Stack<Integer>();
        
        for(int i=0;i<n;i++){
            st.push(i);
        }
        
        while(st.size()>1){
            int a = st.pop();
            int b = st.pop();
            
            if(knows(a,b)){
                st.push(b);
            } else {
                st.push(a);
            }
        }
        
        int c = st.pop();
        
        for(int i=0;i<n;i++){
            if(i!=c && knows(c,i) || !knows(i,c)){
                return -1;
            }
        }
        
        return c;
    }
}