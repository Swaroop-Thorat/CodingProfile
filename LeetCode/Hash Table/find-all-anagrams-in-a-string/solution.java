class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        if(p.length()>s.length()) return new ArrayList<>();

        Map<Character,Integer> map=new HashMap<>();
        Map<Character,Integer> map2=new HashMap<>();

        for(char c:p.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }

        int j=0;
        int start=p.length();
        List<Integer> list=new ArrayList<>();

        for(int i=0;i<start;i++){
          char ch=s.charAt(i);
          map2.put(ch,map2.getOrDefault(ch,0)+1);
          
        }
        if(map.equals(map2)) list.add(0);

        for(int i=start;i<s.length();i++){

          char left=s.charAt(j);
          if(map2.get(left) == 1) map2.remove(left);
          else map2.put(left, map2.get(left) - 1);
          j++;

          char right=s.charAt(i);
          map2.put(right, map2.getOrDefault(right, 0) + 1);

          if(map.equals(map2)) list.add(j);
        }
     return list;
    }
}