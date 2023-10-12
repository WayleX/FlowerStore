package flower.store;

import java.util.ArrayList;

import java.util.List;

public class FlowerBucket {
    private List<FlowerPack> Bucket = new ArrayList<FlowerPack>();
    public FlowerBucket( ArrayList<FlowerPack> Bucket){
        this.Bucket = Bucket;
    }
    public double getPrice(){
        double price = 0;
        for (FlowerPack pack:this.Bucket){
            price += pack.getPrice();

        }
        return price;
    }
}
