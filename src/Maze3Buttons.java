import java.awt.*;
import javax.swing.*;


public class Maze3Buttons extends Buttons {
    private int index;
    private boolean canbePressed;
    public String color;
    public String shape;
    public String orientation;


    public void setProperties() {
        switch (index) {
            case 0:
                color = "none";
                shape = "none";
                break;
            case 1:
                color = "yellow";
                shape = "flower";
                break;
            case 2:
                color = "yellow";
                shape = "plus";
                break;
            case 3:
                color = "yellow";
                shape = "diamond";
                break;
            case 4:
                color = "yellow";
                shape = "star";
                break;
            case 5:
                color = "red";
                shape = "flower";
                break;
            case 6:
                color = "red";
                shape = "plus";
                break;
            case 7:
                color = "red";
                shape = "diamond";
                break;
            case 8:
                color = "red";
                shape = "star";
                break;
            case 9:
                color = "green";
                shape = "flower";
                break;
            case 10:
                color = "green";
                shape = "plus";
                break;
            case 11:
                color = "green";
                shape = "star";
                break;
            case 12:
                color = "blue";
                shape = "flower";
                break;
            case 13:
                color = "blue";
                shape = "diamond";
                break;
            case 14:
                color = "green";
                shape = "plus";
                break;

        }
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int i) {
        index = i;
    }

    public boolean getCanbePressed() {
        return canbePressed;
    }

    public void setCanbePressed(boolean i) {
        canbePressed = i;
    }

    public String getColor() {
        return color;
    }

    public String getShape() {
        return shape;
    }

    public void setOrientation(String o) {
        orientation = o;
    }

    public String getOrientation() {
        return orientation;
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        ImageIcon image;
        switch (index) {
            case 0:
                break;
            case 1:
                image = new ImageIcon("1.png");
                this.setIcon(image);
                break;
            case 2:
                image = new ImageIcon("2.png");
                this.setIcon(image);
                break;
            case 3:
                image = new ImageIcon("3.png");
                this.setIcon(image);
                break;
            case 4:
                image = new ImageIcon("4.png");
                this.setIcon(image);
                break;
            case 5:
                image = new ImageIcon("5.png");
                this.setIcon(image);
                break;
            case 6:
                image = new ImageIcon("6.png");
                this.setIcon(image);
                break;
            case 7:
                image = new ImageIcon("7.png");
                this.setIcon(image);
                break;
            case 8:
                image = new ImageIcon("8.png");
                this.setIcon(image);
                break;
            case 9:
                image = new ImageIcon("9.png");
                this.setIcon(image);
                break;
            case 10:
                image = new ImageIcon("10.png");
                this.setIcon(image);
                break;
            case 11:
                image = new ImageIcon("11.png");
                this.setIcon(image);
                break;
            case 12:
                image = new ImageIcon("12.png");
                this.setIcon(image);
                break;
            case 13:
                image = new ImageIcon("13.png");
                this.setIcon(image);
                break;
            case 14:
                image = new ImageIcon("14.png");
                this.setIcon(image);
                break;

        }
    }
}
