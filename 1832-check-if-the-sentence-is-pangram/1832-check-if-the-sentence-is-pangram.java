class Solution {
    public boolean checkIfPangram(String sentence) {
        int ans = 0,tem=((1<<27)-2);
        int len = sentence.length();
        for(int i=0;i<len;i++){
            int t = (int)(sentence.charAt(i)-'a')+1;
            ans |= 1<<t;
        }
       
        return tem == ans;
    }
}