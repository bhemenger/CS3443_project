package utsa.edu.UTSA_Maps;

import java.util.HashMap;

public class RoomMap {
    public static void main(String[] args) {
        // Define a HashMap to store room details
        HashMap<String, Room> roomMap = new HashMap<>();

        // Create instances of Room and add them to the map
        Location location101 = new Location(); // Create a location instance for room 101
        Room room101 = new Room(location101, 1, "Conference Room", "C101", 10, 20);
        roomMap.put("101", room101);

        Location location201 = new Location(); // Create a location instance for room 201
        Room room201 = new Room(location201, 2, "Office", "O201", 15, 30);
        roomMap.put("201", room201);

        Location location301 = new Location(); // Create a location instance for room 301
        Room room301 = new Room(location301, 3, "Break Room", "B301", 20, 40);
        roomMap.put("301", room301);

        // Retrieve and print room details
        Room room = roomMap.get("101");
        System.out.println("Room 101: " + room);

        room = roomMap.get("201");
        System.out.println("Room 201: " + room);

        room = roomMap.get("301");
        System.out.println("Room 301: " + room);
    }
}
