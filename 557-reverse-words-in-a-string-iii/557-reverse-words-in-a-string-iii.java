class Solution {
    public String reverseWords(String s) {
        String[] arr = s.split(" ");
        for(int i=0;i<arr.length;i++){
            arr[i] = new StringBuilder(arr[i]).reverse().toString();
        }
        StringBuilder ans = new StringBuilder("");
        for(int i=0;i<arr.length;i++){
            if(i == arr.length-1){
                ans.append(arr[i]);
            }
            else{
                ans.append(arr[i]+" ");
            }
        }
        return ans.toString();
    }
}