class Solution {
    public String findOrder(String[] words) {
        // code here
        
        StringBuilder res=new StringBuilder();
        Set<Character> set=new HashSet<>();
        
        for(int i=0;i<words.length;i++){
             for(int j=0;j<words[i].length();j++){
                 char c1=words[i].charAt(j);
                 set.add(c1);
             }
         }
         
         int nodes=set.size();
         
         Queue<Integer> q=new ArrayDeque<>();
         List<Set<Integer>> adj=new ArrayList<>();
         int[] in=new int[26];
    
         for(int i=0;i<26;i++) adj.add(new HashSet<>());
         
         for(int i=1;i<words.length;i++){
             String s1=words[i-1];
             String s2=words[i];
             int len=Math.min(s1.length(),s2.length());
             boolean found=false;
             for(int j=0;j<len;j++){
                     char c1=s1.charAt(j);
                     char c2=s2.charAt(j);
                     if(c1!=c2){
                         if(adj.get(c1-'a').add(c2-'a')){
                             in[c2-'a']++;
                         }
                         found=true;
                         break;
                     }
                 }
                 if(!found && s1.length()>s2.length()) return "";
         }
         
         
         for(int i=0;i<26;i++){
             if(in[i]==0 && set.contains((char)(i + 'a'))){
                 q.offer(i);
                 res.append((char) (i + 'a'));
             }
             
         }
         
         while(!q.isEmpty()){
             int node=q.poll();
             
             for(int n:adj.get(node)){
                 in[n]--;
                 if(in[n]==0){
                     res.append((char) (n + 'a'));
                     q.offer(n);
                 }
             }
         }
        
        if(nodes==res.length()){
            return res.toString();
        }
        
        return "";
    }
}