class Solution {
    public String replaceWords(List<String> dictionary, String sentence) {
        Set<String> set=new HashSet<>();
        for(String st:dictionary){
            set.add(st);
        }

        String[] der=sentence.split("\\s+");
        
        for(int j=0;j<der.length;j++){
            for(int i=0;i<der[j].length();i++){
                if(set.contains(der[j].substring(0,i+1))){
                    der[j]=der[j].substring(0,i+1);
                }
            }
        }

        StringBuilder sb=new StringBuilder();
        for(String s:der){
            sb.append(s);
            sb.append(' ');
        }

        String res=sb.toString().trim();
        return res;
    }
}