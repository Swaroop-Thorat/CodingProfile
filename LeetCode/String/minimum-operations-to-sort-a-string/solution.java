class Solution {
    public int minOperations(String s) {
        int n=s.length();
        char[] ch=s.toCharArray();
        Arrays.sort(ch);
        String sorted=new String(ch);

        if(sorted.equals(s)) return 0;

        if(n==2) return -1;

        if(s.charAt(0)==sorted.charAt(0) || s.charAt(n-1)==sorted.charAt(n-1)) return 1;

        if((s.charAt(0)==sorted.charAt(n-1) && sorted.charAt(n-1)!=sorted.charAt(n-2)) && (s.charAt(n-1)==sorted.charAt(0) && sorted.charAt(0)!=sorted.charAt(1))) return 3;

        return 2;
    }
}