package utsa.edu.UTSA_Maps;

public class Room extends Location{
    Location location;
    int floor;
    String roomName;
    String roomSymbol;
    public Room(Location location, int floor, String roomName, String roomSymbol,int x ,int y){
        location.setXnY(x,y);
        this.floor=floor;
        this.roomName=roomName;
        this.roomSymbol=roomSymbol;
    }
    public Room(Location location, int floor, String roomName, int x, int y){
        location.setXnY(x,y);
        this.floor=floor;
        this.roomName=roomName;
    }


}
