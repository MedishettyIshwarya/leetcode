class Solution {
    public int romanToInt(String s) {
        HashMap<Character,Integer> mapper=new HashMap<>();
        mapper.put('I',1);
        mapper.put('V',5);
        mapper.put('X',10);
        mapper.put('L',50);
        mapper.put('C',100);
        mapper.put('D',500);
        mapper.put('M',1000);

        int total=0;
        int length=s.length();
        for(int i=0;i<length;i++){
            int currentvalue= mapper.get(s.charAt(i));
            if(i<length-1 && mapper.get(s.charAt(i))<mapper.get(s.charAt(i + 1))){
                total=total-currentvalue;
            }else{
                total=total+currentvalue;
            }
        }
        return total;
    }
}