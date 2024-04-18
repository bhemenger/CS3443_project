package utsa.edu.UTSA_Maps;

import java.util.*;

public class Building {
    private String building_name;
    private Location building_entrance;
    private int floor;
    private Location location;
    private Map<String, List<Location>> areaLocations;
    private Map<Location, List<Location>> connections;

    public Building(String building_name, Location building_entrance, int floor, Location location) {
        this.building_name = building_name;
        this.building_entrance = building_entrance;
        this.floor = floor;
        this.location = location;
        this.areaLocations = new HashMap<>();
        this.connections = new HashMap<>();
    }

    public void addArea(String areaName, Location areaLocation) {
        areaLocations.computeIfAbsent(areaName, k -> new ArrayList<>()).add(areaLocation);
    }

    public void addConnection(Location area1, Location area2) {
        connections.computeIfAbsent(area1, k -> new ArrayList<>()).add(area2);
        connections.computeIfAbsent(area2, k -> new ArrayList<>()).add(area1);
    }

    public List<Location> getLocations(String areaName) {
        return areaLocations.getOrDefault(areaName, Collections.emptyList());
    }

    public List<Location> getNeighbors(Location location) {
        return connections.getOrDefault(location, Collections.emptyList());
    }

    // Getters and setters for other fields as needed
}