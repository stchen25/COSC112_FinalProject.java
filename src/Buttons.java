
import java.awt.*;
import javax.swing.*;

public class Buttons extends JButton {
    private boolean canbePressed;
    private int getNumSteps;
    private int index;
    private int steps;
    private String orientation;
    private String color;
    private String shape;
    private boolean visited;

    public void setVisited(boolean v) {
        visited = v;
    }

    public boolean getVisited() {
        return visited;
    }

    public boolean getCanbePressed() {
        return canbePressed;
    }

    public void setCanbePressed(boolean i) {
        canbePressed = i;
    }

    public int getNumSteps() {
        return getNumSteps;
    }

    public void setIndex(int i) {
    }

    public int getIndex() {
        return index;
    }

    public int getSteps() {
        return steps;
    }

    public void setSteps(int i) {
        steps = i;
    }

    public void setOrientation(String s) {
    }

    public String getColor() {
        return color;
    }

    public String getOrientation() {
        return orientation;
    }

    public String getShape() {
        return shape;
    }


}
