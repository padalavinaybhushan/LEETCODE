class Solution {
    public int minimumRefill(int[] plants, int capacityA, int capacityB) {
        int posa = 0;
        int len = plants.length;
        int posb = len-1,ans=0;
        int capa = capacityA,capb = capacityB;
        while(posa<=posb)
        {
            // System.out.println(posa+" "+plants[posa]+" "+capa);
            if(posa == posb)
            {
                if(capa>=capb)
                {
                    if(capa<plants[posa])
            {
                ans++;
                // System.out.println(ans+" "+posa);
                capa=capacityA-plants[posa];
            }
            else
            {
                capa=capa-plants[posa];
            }
                }
                else
                {
                    if(capb<plants[posb])
            {
                ans++;
                    // System.out.println(ans+" "+posb);
                capb=capacityB-plants[posb];
            }
            else
            {
                capb=capb-plants[posb];
            }
                }
                break;
            }
                if(capa<plants[posa])
            {
                ans++;
                // System.out.println(ans+" "+posa);
                capa=capacityA-plants[posa];
            }
            else
            {
                capa=capa-plants[posa];
            }
            
            
            
            
                if(capb<plants[posb])
            {
                ans++;
                    // System.out.println(ans+" "+posb);
                capb=capacityB-plants[posb];
            }
            else
            {
                capb=capb-plants[posb];
            }
            
            posa++;
            posb--;
        }
        return ans;
    }
}