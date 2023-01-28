class Cashier {
     int count;
    Map<Integer,Integer> map;
    int d;
    int total_cus;

    public Cashier(int n, int discount, int[] products, int[] prices) {
        count = 0;
        this.d = discount;
        this.total_cus = n;
        map = new HashMap<>();
        
        for(int i=0; i<products.length; i++) {
            map.put(products[i], prices[i]);
        }
    }
    
    public double getBill(int[] product, int[] amount) {
        
        count++;
        double bill = 0;
        
        for(int i=0; i<product.length; i++) {
            bill += map.get(product[i]) * amount[i];
        }
        
        if(count == total_cus) {
            count = 0;
            return (bill - (d * bill)/100);   
        } else {
            return bill;
        }
        
    }
}

/**
 * Your Cashier object will be instantiated and called as such:
 * Cashier obj = new Cashier(n, discount, products, prices);
 * double param_1 = obj.getBill(product,amount);
 */