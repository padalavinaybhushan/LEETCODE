class Solution {
    public List<Integer> replaceNonCoprimes(int[] nums) {
        LinkedList<Integer> li=new LinkedList<>();
        for(int val:nums){
           while(true){
               int last=li.isEmpty()?1:li.getLast();
               int g=gcd(last,val);
               if(g==1){
                   break;
               }
               li.removeLast();
               val*=last/g;
           }
            li.add(val);
        }
        
        return li;
        
    }
    
     public int gcd(int a,int b){
        if(b==0){
            return a;
        }
        return gcd(b,a%b);
    }
}