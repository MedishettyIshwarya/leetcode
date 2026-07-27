class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder result = new StringBuilder();
        //first sort the array
        Arrays.sort(strs);
        int n = strs.length;
        //compare first and last string
        //first string
        char[] first = strs[0].toCharArray();
        //last string
        char[] last= strs[n-1].toCharArray();
        for(int i=0; i<first.length;i++){
            if(first[i]==last[i]){
                result.append(first[i]);
            }
            else{
                break;
            }
        }
        return result.toString();

    }
}