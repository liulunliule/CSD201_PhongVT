package mytree;

// =========================================================
// Do NOT modify this file 
// =========================================================

class Car {
    String name;
    int price;
    int color;
    
    // Default constructure
    Car () {}
    
    // Constructor with full parameter
    Car (String xName, int xPrice, int xColor) {
        this.name = xName;
        this.price = xPrice; 
        this.color = xColor;
    }
    
    @Override
    public String toString(){
        return "(" + name + "," + price + "," + color + ")";
    }

    public int getPrice() {
        return this.price;
    }
    
    public int getColor() {
        return this.color;
    }
    
    public String getName() {
        return this.name;
    }
    
    public void setColor(int inColor) {
        this.color = inColor;
    }
    
    public void setPrice(int inPrice) {
        this.price = inPrice;
    }
    
    public void setName(String inName) {
        this.name = inName;
    }
}