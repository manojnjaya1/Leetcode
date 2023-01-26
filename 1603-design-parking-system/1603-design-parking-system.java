class ParkingSystem {
     int Big=0;
    int Medium=0;
    int Small=0;
    public ParkingSystem(int big, int medium, int small) {
        Big=big;
        Medium=medium;
        Small=small;
    }
    
    public boolean addCar(int carType) {
        if(carType==1 ){
            if(Big>=1){
            Big--;
            return true;
            }
            else 
                return false;
            }
          if(carType==2 ){
            if(Medium>=1){
            Medium--;
            return true;
            }
            else 
                return false;
            }
          if(carType==3 ){
            if(Small>=1){
            Small--;
            return true;
            }
            else 
                return false;
            }
       return false;
    }
}

/**
 * Your ParkingSystem object will be instantiated and called as such:
 * ParkingSystem obj = new ParkingSystem(big, medium, small);
 * boolean param_1 = obj.addCar(carType);
 */