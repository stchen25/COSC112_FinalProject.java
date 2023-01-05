import java.awt.*;
import javax.swing.*;

public class Maze1Buttons extends Buttons { //similar to diamondbutton
    private int numSteps;
    private boolean canbePressed;

    public Maze1Buttons() {


    }

    public int getNumSteps() {
        return numSteps;
    }

    public void setNumSteps(int i) {
        numSteps = i;
    }

    public boolean getCanbePressed() {
        return canbePressed;
    }

    public void setCanbePressed(boolean i) {
        canbePressed = i;
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        repaint();
    }
}
