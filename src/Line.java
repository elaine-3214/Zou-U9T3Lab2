import java.awt.*;

public class Line extends Shape {
    //instance variables

    public Line() {
        super();
    }

    @Override
    public void draw(Graphics g) {
        // set the color to draw the shape in
        g.setColor(Color.PINK);
        //draw line
        g.drawLine(getp1X(), getp1Y(), getp2X(), getp2Y());
    }
}
