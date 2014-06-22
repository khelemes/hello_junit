package com.engagepoint.hello;
import static java.lang.System.out;
/**
 * Created by lyolik on 22.06.2014.
 */
//extends GraphObject значит что мы расщиряем класс GraphObject
public class Point extends GraphObject {
    public int x,y;

    public void move(int dx, int dy){
        x+=dx;
        y+=dy;
    }

    //@Override указывает явно что это переопределеный метод
    @Override
    public void draw(){

        //Вызов родительского метода draw
        super.draw();
        out.printf("Point (%d,%d) %s", x,y,color);
    }
}
