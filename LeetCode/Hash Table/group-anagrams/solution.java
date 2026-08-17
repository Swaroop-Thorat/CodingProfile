class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        int n=strs.length;
        Map<String,List<String>> map=new HashMap<>();
        for(int i=0;i<n;i++){
            char[] ch=strs[i].toCharArray();
            Arrays.sort(ch);
            String sorted=new String(ch);
            map.putIfAbsent(sorted,new ArrayList<>());
            map.get(sorted).add(strs[i]);
        }
        return new ArrayList<>(map.values());
    }
}