package com.engagepoint.hello;
import static java.lang.System.out;
/**
 * Created by lyolik on 22.06.2014.
 */
//extends GraphObject значит что мы расщиряем класс GraphObject
public class Point extends GraphObject {
    public int x,y;

    //Конструктор по умолчанию
    public Point() {
        this(0, 0);
        out.println("Point DEFctr");
    }
    //Конструктор с параметрами

    public Point(int x, int y) {
        this(x,y, DEFAULT_COLOR);
        out.println("Point x y ctr");
    }

    //Конструктор с параметрами
    public Point(int x, int y, String color) {
        this.x = x;
        this.y = y;
        this.color =color;
        out.println("Point x y color ctr");
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void move(int dx, int dy){
        x+=dx;
        y+=dy;
    }

    //@Override указывает явно что это переопределеный метод
    @Override
    public void draw(){

        //Вызов родительского метода draw
/*        super.draw();*/
        out.printf("Point (%d,%d) %s", x,y,color);
    }
}
