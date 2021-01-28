public enum Plane {

    BOEING747(10, 100),
    AIRBUSA830(20,200),
    CESSNA172(3,20);

    private final int capacity;
    private final int weight;

    Plane(int capacity, int weight){
        this.capacity = capacity;
        this.weight = weight;
    }

    public int getCapacity(){
        return this.capacity;
    }

    public int getWeight(){
        return this.weight;
    }




}
