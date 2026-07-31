class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character,Character> sTt = new HashMap<>();
        Map<Character,Character> tTs = new HashMap<>();
        boolean result = true;
        for(int i=0;i<s.length();i++){
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);
            
            if(sTt.containsKey(c1)){
                if(sTt.get(c1)!=c2){
                    result = false;
                }
                
            }
            else{
                sTt.put(s.charAt(i),t.charAt(i));
            }
            
            if(tTs.containsKey(t.charAt(i)) && !tTs.containsValue(s.charAt(i))){
                result = false;
            }
            else{
                tTs.put(t.charAt(i),s.charAt(i));
            }
            
        }
        // System.out.print(sTt.values());
        return result;
    }
}