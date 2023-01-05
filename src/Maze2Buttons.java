import java.awt.*;
import javax.swing.*;

public class Maze2Buttons extends Buttons {
    private int index;
    private boolean canbePressed;
    private int steps;


    public void Maze2Buttons() {
        canbePressed = false;
    }

    public int getIndex() {
        return index;
    }

    public void setSteps(int i) {
        steps = i;
    }

    public int getSteps() {
        return steps;
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

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        //;/this.setFont(new Font("Arial", Font.PLAIN, 9));
        ImageIcon image;
        switch (index) {
            case 0:
                image = new ImageIcon("Zero.png");
                this.setIcon(image);
                break;
            case 1:
                image = new ImageIcon("One.png");
                this.setIcon(image);
                break;
            case 2:
                image = new ImageIcon("Two.png");
                this.setIcon(image);
                break;
            case 3:
                image = new ImageIcon("Three.png");
                this.setIcon(image);
                break;
            case 4:
                image = new ImageIcon("Four.png");
                this.setIcon(image);
                break;
            case 5:
                image = new ImageIcon("Five.png");
                this.setIcon(image);
                break;
            case 6:
                image = new ImageIcon("Six.png");
                this.setIcon(image);
                break;
            case 7:
                image = new ImageIcon("Seven.png");
                this.setIcon(image);
                break;
            case 8:
                image = new ImageIcon("Eight.png");
                this.setIcon(image);
                break;
            case 9:
                image = new ImageIcon("Nine.png");
                this.setIcon(image);
                break;
            case 10:
                image = new ImageIcon("Ten.png");
                this.setIcon(image);
                break;
            case 11:
                image = new ImageIcon("Eleven.png");
                this.setIcon(image);
                break;
            case 12:
                image = new ImageIcon("Twelve.png");
                this.setIcon(image);
                break;
            case 13:
                image = new ImageIcon("Thirteen.png");
                this.setIcon(image);
                break;
            case 14:
                image = new ImageIcon("Fourteen.png");
                this.setIcon(image);
                break;
            case 15:
                image = new ImageIcon("Fifteen.png");
                this.setIcon(image);
                break;
            case 16:
                image = new ImageIcon("Sixteen.png");
                this.setIcon(image);
                break;
            case 17:
                image = new ImageIcon("Seventeen.png");
                this.setIcon(image);
                break;
            case 18:
                image = new ImageIcon("Eighteen.png");
                this.setIcon(image);
                break;
            case 19:
                image = new ImageIcon("Nineteen.png");
                this.setIcon(image);
                break;
            case 20:
                image = new ImageIcon("Twenty.png");
                this.setIcon(image);
                break;
            case 21:
                image = new ImageIcon("TwentyOne.png");
                this.setIcon(image);
                break;
            case 22:
                image = new ImageIcon("TwentyTwo.png");
                this.setIcon(image);
                break;
            case 23:
                image = new ImageIcon("TwentyThree.png");
                this.setIcon(image);
                break;
            case 24:
                image = new ImageIcon("TwentyFour.png");
                this.setIcon(image);
                break;
            case 25:
                image = new ImageIcon("TwentyFive.png");
                this.setIcon(image);
                break;
            case 26:
                image = new ImageIcon("TwentySix.png");
                this.setIcon(image);
                break;
            case 27:
                image = new ImageIcon("TwentySeven.png");
                this.setIcon(image);
                break;
            case 28:
                image = new ImageIcon("TwentyEight.png");
                this.setIcon(image);
                break;
            case 29:
                image = new ImageIcon("TwentyNine.png");
                this.setIcon(image);
                break;
            case 30:
                image = new ImageIcon("Thirty.png");
                this.setIcon(image);
                break;
            case 31:
                image = new ImageIcon("ThirtyOne.png");
                this.setIcon(image);
                break;
            case 32:
                image = new ImageIcon("ThirtyTwo.png");
                this.setIcon(image);
                break;


        }

    }
}
