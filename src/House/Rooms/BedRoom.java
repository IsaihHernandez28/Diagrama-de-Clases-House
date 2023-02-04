package House.Rooms;

import House.Rooms.Specs.BedSize;

public class BedRoom {
    private BedSize bedSize;
    private boolean tv;
    private int width;
    private int height;
    private String color;
    public BedSize getBedSize(){
        return bedSize;
    }
    public void setBedSize(BedSize bedSize) {
        this.bedSize = bedSize;
    }
    public boolean getTv(){
        return tv;
    }
    public void setTv(boolean tv) {
        this.tv = tv;
    }
    public int getWidth() {
        return width;
    }
    public void setWidth(int width) {
        this.width = width;
    }
    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
}
