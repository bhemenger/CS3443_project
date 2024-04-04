package utsa.edu.UTSA_Maps;

public class Location {
    private int x;
    private int y;
    private int zoom;

    public Location(int x, int y, int zoom){
        this.x=x;
        this.y=y;
        this.zoom=zoom;
    }
    public Location(int x, int y){
        this.x=x;
        this.y=y;
    }
    public Location(){
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public int getZoom(){
        return zoom;
    }
    public void setX(int x){
        this.x=x;
    }
    public void setY(int y){
        this.y=y;
    }
    public void setXnY(int x, int y){
        this.x=x;
        this.y=y;
    }
    public void setZoom(int zoom){
        this.zoom=zoom;
    }

}