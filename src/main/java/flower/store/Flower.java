package flower.store;

import lombok.Getter;
import lombok.Setter;



@Setter
public class Flower {
    @Getter
    private double sepalLength;
    private FlowerColor color;
    @Getter
    private double price;
    @Getter
    private FlowerType flowerType;

    public Flower() {
        this.sepalLength = 0;
        this.color = color.BLUE;
        this.price = 0;
        this.flowerType = FlowerType.CHAMOMILE;    
    }
    public Flower(Flower flower) {
        this.sepalLength = flower.sepalLength;
        this.color = flower.color;
        this.price = flower.price;
        this.flowerType = flower.flowerType;
    }
    public String getColor() {
        return color.toString();
    }
}
