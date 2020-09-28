import java.util.List;

public class MyPoint {
    int x = 0;
    int y = 0;
    MyPoint(){
        x= 0;
        y= 0;
    }
    MyPoint(int x, int y){
        this.x = 0;
        this.y = 0;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    public int[] getXY(){
        int[] XY = new int[2];
        XY[0] = this.x;
        XY[1] = this.y;
        return XY;
    }
    public void setXY(int x, int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "MyPoint{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
    public double distance(int x, int y){
        return Math.sqrt((Math.pow(this.x-x,2))+(Math.pow(this.y-y,2)));
    }
    public double distance(MyPoint another){
        return Math.sqrt((Math.pow(this.x-another.getX(),2))+(Math.pow(this.y-another.getY(),2)));
    }
    public double distance(){
        return Math.sqrt((Math.pow(this.x,2))+(Math.pow(this.y,2)));
    }
}
