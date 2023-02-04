package House;

import House.Rooms.*;

public class House {
    public static final int MAX_REST_ROOMS = 10;
    public static final int MAX_BED_ROOMS = 10;
    private Kitchen kitchen;
    private DinningRoom dinningRoom;
    private LivingRoom livingRoom;
    private RestRoom[] restRooms = new RestRoom[MAX_REST_ROOMS];
    private BedRoom[] bedRooms = new BedRoom[MAX_BED_ROOMS];
    private Yard yard;

    public Kitchen getKitchen() {
        return kitchen;
    }
    public void setKitchen(Kitchen kitchen) {
        this.kitchen = kitchen;
    }
    public DinningRoom getDinningRoom() {
        return dinningRoom;
    }
    public void setDinningRoom(DinningRoom dinningRoom) {
        this.dinningRoom = dinningRoom;
    }
    public LivingRoom getLivingRoom() {
        return livingRoom;
    }
    public void setLivingRoom(LivingRoom livingRoom) {
        this.livingRoom = livingRoom;
    }
    public RestRoom[] getRestRooms() {
        return restRooms;
    }
    public void setRestRooms(RestRoom[] restRooms) {
        this.restRooms = restRooms;
    }
    public BedRoom[] getBedRooms() {
        return bedRooms;
    }
    public void setBedRooms(BedRoom[] bedRooms) {
        this.bedRooms = bedRooms;
    }
    public Yard getYard() {
        return yard;
    }
    public void setYard(Yard yard) {
        this.yard = yard;
    }
    public void addRoom(BedRoom bedRoom){
        int indexBedRooms = 0;
        if(indexBedRooms <= bedRooms.length ) {
            bedRooms[indexBedRooms] = bedRoom;
            indexBedRooms++;
        }
        else System.out.println("La casa no tiene más capacidad");
    }
    public void addRoom(RestRoom restRoom){
        int indexRestRooms = 0;
        if(indexRestRooms < bedRooms.length ) {
            restRooms[indexRestRooms] = restRoom;
            indexRestRooms++;
        }
        else
            System.out.println("La casa no tiene más capacidad");
    }
}
