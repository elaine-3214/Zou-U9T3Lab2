import java.awt.*;

public class Arc extends Shape {
    //instance variables
    private int startAngle;
    private int arcAngle;

    public Arc () {
        super();
        startAngle = 30;
        arcAngle = 70;
    }

    @Override
    public void draw(Graphics g) {
        // set the color
        g.setColor(Color.PINK);
        // draw the arc
        g.drawArc(getMinX(), getMinY(), getWidth(), getHeight(), startAngle, arcAngle);
    }

}
