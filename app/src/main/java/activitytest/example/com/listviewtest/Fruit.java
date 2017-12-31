package activitytest.example.com.listviewtest;

/**
 * Created by haolun on 12/30/17.
 */

public class Fruit {
    public String name;

    private int imageId;

    public Fruit(String name, int imageId){
        this.name = name;
        this.imageId = imageId;
    }

    public String getName(){
        return name;
    }

    public int getImageId(){
        return imageId;
    }
}
