class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length()) return false;

        Map<Character,Integer> map1=new HashMap<>();
        for(char ch:s1.toCharArray()){
            map1.put(ch,map1.getOrDefault(ch,0)+1);
        }

        Map<Character,Integer> map2=new HashMap<>();
        for(int i=0;i<s1.length();i++){
            char ch=s2.charAt(i);
            map2.put(ch,map2.getOrDefault(ch,0)+1);
        }
        if(map1.equals(map2)) return true;
        int j=0;
        for(int i=s1.length();i<s2.length();i++){
            char ch=s2.charAt(j);

            if(map2.get(ch)==1){
                map2.remove(ch);
            }
            else{
                map2.put(ch,map2.get(ch)-1);
            }
            j++;

            ch=s2.charAt(i);
            map2.put(ch,map2.getOrDefault(ch,0)+1);

            if(map1.equals(map2)) return true;
        }

        return false;
    }
}