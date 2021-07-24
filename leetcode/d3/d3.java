public class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s != null && s.length() > 0 && s != ""){
            char[] strChar = s.toCharArray();
            ArrayList<String> maxStr = new ArrayList<>();
            ArrayList<String> tempStr = new ArrayList<>();
            for(int i=0; i<strChar.length; i++){
                String str = new String(new char[]{strChar[i]});
                if(tempStr.contains(str)){
                    if(tempStr.size() > maxStr.size()){
                        maxStr = new ArrayList<>(tempStr);
                    }
                    int reIndex = tempStr.indexOf(str);
                    for(int j=0;j<=reIndex;j++){
                        tempStr.remove(0);
                    }
                }
                tempStr.add(str);
            }
            if(tempStr.size() > maxStr.size()){
                maxStr = tempStr;
            }
            return maxStr.size();
        }
        return 0;
    }
}