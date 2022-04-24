class Customer
{
    int tin,tout;
    int id;
    String checkin;
    String checkout;
    public Customer(int tin,int id,String checkin)
    {
        this.tin = tin;
        this.id = id;
        this.checkin = checkin;
    }
}

class UndergroundSystem {

    HashMap<String,ArrayList<Customer>> hm1;
    HashMap<Integer,Customer> hm;
    public UndergroundSystem() {
        hm1 = new HashMap<>();
        hm = new HashMap<>();
    }
    
    public void checkIn(int id, String stationName, int t) {
        Customer obj = new Customer(t,id,stationName);
        hm.put(id,obj);
        if(hm1.containsKey(stationName)) 
        {
            ArrayList<Customer> tem = hm1.get(stationName);
            tem.add(obj);
            hm1.put(stationName,tem);
        }
        else
        {
            ArrayList<Customer> tem = new ArrayList<>();
            tem.add(obj);
            hm1.put(stationName,tem);
        }
        
    }
    
    public void checkOut(int id, String stationName, int t) {
        Customer tem = hm.get(id);
        tem.tout = t;
        tem.checkout = stationName;
        hm.put(id,tem);
    }
    
    public double getAverageTime(String startStation, String endStation) {
        ArrayList<Customer> tem = hm1.get(startStation);
        double sum=0;
        int count=0;
        for(Customer i : tem)
        {
           
            if(i.checkout != null)
            if((i.checkout).equals(endStation))
            {
                sum += (Math.abs(i.tout-i.tin));
                count++;
            }
        }
        double ans = sum/count;
        return ans;
    }
}

/**
 * Your UndergroundSystem object will be instantiated and called as such:
 * UndergroundSystem obj = new UndergroundSystem();
 * obj.checkIn(id,stationName,t);
 * obj.checkOut(id,stationName,t);
 * double param_3 = obj.getAverageTime(startStation,endStation);
 */