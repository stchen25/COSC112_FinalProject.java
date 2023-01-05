import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import javax.swing.*;
import javax.swing.*;

public class State extends JFrame implements ActionListener {
    private int xPos;
    private int yPos;
    JLabel first;
    JLabel second;
    Buttons[][] locations;
    String mazeType;
    private State parent = null;

    public State(Buttons[][] m, int x, int y, JLabel label1, JLabel label2, String mt) {
        locations = m;
        xPos = x;
        yPos = y;
        first = label1;
        second = label2;
        mazeType = mt;
    }

    public Buttons getButton() {
        return locations[xPos][yPos];
    }

    public int getX() {
        return xPos;
    }

    public int getY() {
        return yPos;
    }

    public JLabel getFirst() {
        return first;
    }

    public JLabel getSecond() {
        return second;
    }

    public void addChild(State s) {
        s.addParent(this);

    }

    public void addParent(State s) {
        this.parent = s;
    }

    public State getParent() {
        return parent;
    }

    public String getMaze() {
        return mazeType;
    }


    public void Transition() {
        if (mazeType.equals("maze 1")) {
            if (!locations[getX()][getY()].getCanbePressed()) {
                for (int i = 0; i < locations.length; i++) {
                    for (int j = 0; j < locations[0].length; j++) {
                        locations[i][j].setEnabled(false);
                    }
                }
                getFirst().setText("Oh no!");
                getSecond().setText("You Lost!");
            }
            if (locations[getX()][getY()].getCanbePressed()) {
                for (int i = 0; i < locations.length; i++) {
                    for (int j = 0; j < locations[0].length; j++) {
                        locations[i][j].setEnabled(true);
                        locations[i][j].setCanbePressed(false);
                    }
                }
                locations[getX()][getY()].setEnabled(false);
                up();
                down();
                left();
                right();
            }
        } else if (mazeType.equals("maze 2")) {
            int index = locations[getX()][getY()].getIndex();
            int steps = locations[getX()][getY()].getSteps();
            if (!locations[getX()][getY()].getCanbePressed()) {
                for (int i = 0; i < locations.length; i++) {
                    for (int j = 0; j < locations[0].length; j++) {
                        locations[i][j].setEnabled(false);
                    }
                }
                getFirst().setText("Oh no!");
                getSecond().setText("You Lost!");

            }
            if (locations[getX()][getY()].getCanbePressed()) {
                switch (index) {
                    case 0:
                        down2();
                        downRight();
                        break;
                    case 1:
                        left2();
                        down2();
                        right2();
                        break;
                    case 2:
                        left2();
                        down2();
                        break;
                    case 3:
                        checkZeroSteps();
                        left2();
                        break;
                    case 4:
                        left2();
                        break;
                    case 5:
                        down2();
                        downRight();
                        right2();
                        break;
                    case 6:
                        down2();
                        right2();
                        break;
                    case 7:
                        right2();
                        downRight();
                        break;
                    case 8:
                        right2();
                        break;
                    case 9:
                        left2();
                        up2();
                        break;
                    case 10:
                        down2();
                        break;
                    case 11:
                    case 12:
                        downRight();
                        break;
                    case 13:
                        up2();
                        break;
                    case 14:
                        addSteps();
                        down2();
                        break;
                    case 15:
                        up2();
                        down2();
                        right2();
                        break;
                    case 16:
                        checkZeroSteps();
                        upRight();
                        break;
                    case 17:
                        upLeft();
                        down2();
                        break;
                    case 18:
                        up2();
                        down2();
                        break;
                    case 19:
                        addSteps();
                        upRight();
                        break;
                    case 20:
                        addSteps();
                        downLeft();
                        break;
                    case 21:
                        upRight();
                        upLeft();
                        down2();
                        break;
                    case 22:
                        addSteps();
                        up2();
                        break;
                    case 23:
                        downLeft();
                        upRight();
                        break;
                    case 24:
                        upRight();
                        break;
                    case 25:
                        up2();
                        downLeft();
                        downRight();
                        break;
                    case 26:

                        left2();
                        right2();
                        break;
                    case 27:
                        left2();
                        up2();
                        down2();
                        break;
                    case 28:
                        up2();
                        right2();
                        break;
                    case 29:
                        up2();
                        left2();
                        break;
                    case 30:
                        checkZeroSteps();
                        right2();
                        break;
                    case 31:
                        up2();
                        right2();
                        left2();
                        break;
                }
            }
        } else if (mazeType.equals("maze 3")) {
            int index = locations[getX()][getY()].getIndex();
            if (!locations[getX()][getY()].getCanbePressed()) {
                for (int i = 0; i < locations.length; i++) {
                    for (int j = 0; j < locations[0].length; j++) {
                        locations[i][j].setEnabled(false);
                    }
                }
                getFirst().setText("Oh no!");
                getSecond().setText("You Lost!");

            }
            if (locations[getX()][getY()].getCanbePressed()) {
                switch (index) {
                    case 0:
                        break;
                    case 1:
                        setFalse();
                        canPressYellow();
                        canPressFlowers();
                        checkOrientation();
                        break;
                    case 2:
                        setFalse();
                        canPressYellow();
                        canPressPlus();
                        checkOrientation();
                        break;
                    case 3:
                        setFalse();
                        canPressYellow();
                        canPressDiamonds();
                        checkOrientation();
                        break;
                    case 4:
                        setFalse();
                        canPressYellow();
                        canPressStars();
                        checkOrientation();
                        break;
                    case 5:
                        setFalse();
                        canPressRed();
                        canPressFlowers();
                        checkOrientation();
                        break;
                    case 6:
                        setFalse();
                        canPressRed();
                        canPressPlus();
                        checkOrientation();
                        break;
                    case 7:
                        setFalse();
                        canPressRed();
                        canPressDiamonds();
                        checkOrientation();
                        break;
                    case 8:
                        setFalse();
                        canPressRed();
                        canPressStars();
                        checkOrientation();
                        break;
                    case 9:
                        setFalse();
                        canPressGreen();
                        canPressFlowers();
                        checkOrientation();
                        break;
                    case 10:
                        setFalse();
                        canPressGreen();
                        canPressPlus();
                        checkOrientation();
                        break;
                    case 11:
                        setFalse();
                        canPressGreen();
                        canPressStars();
                        checkOrientation();
                        break;
                    case 12:
                        setFalse();
                        canPressBlue();
                        canPressFlowers();
                        checkOrientation();
                        break;
                    case 13:
                        setFalse();
                        canPressBlue();
                        canPressDiamonds();
                        checkOrientation();
                        break;
                }
            }
        }

    }

    public void up() {
        int up = getY() + locations[getX()][getY()].getNumSteps();
        if (up > 6) up = getY();
        locations[getX()][up].setCanbePressed(true);
    }

    public void down() {
        int down = getY() - locations[getX()][getY()].getNumSteps();
        if (down < 0) down = getY();
        locations[getX()][down].setCanbePressed(true);
    }

    public void left() {
        int left = getX() - locations[getX()][getY()].getNumSteps();
        if (left < 0) left = getX();
        locations[left][getY()].setCanbePressed(true);
    }

    public void right() {
        int right = getX() + locations[getX()][getY()].getNumSteps();
        if (right > 6) right = getX();
        locations[right][getY()].setCanbePressed(true);
    }


    public void addSteps() {
        int addstep = locations[getX()][getY()].getSteps() + 1;
        for (int i = 0; i < locations.length; i++) {
            for (int j = 0; j < locations[0].length; j++) {
                locations[i][j].setSteps(addstep);
            }
        }
        if (addstep >= 9) {
            for (int i = 0; i < locations.length; i++) {
                for (int j = 0; j < locations[0].length; j++) {
                    locations[i][j].setEnabled(false);
                }
            }
        }
    }

    public void up2() {
        int up = getX() - locations[getX()][getY()].getSteps();
        if (up < 0) {
            up = getX();
        }
        locations[up][getY()].setCanbePressed(true);
    }

    public void down2() {
        int down = getX() + locations[getX()][getY()].getSteps();
        if (down > 7) {
            down = getX();
        }
        locations[down][getY()].setCanbePressed(true);

    }

    public void left2() {
        int left = getY() - locations[getX()][getY()].getSteps();
        if (left < 0) {
            left = getY();
        }
        locations[getX()][left].setCanbePressed(true);
    }

    public void right2() {
        int right = getY() + locations[getX()][getY()].getSteps();
        if (right > 7) right = getY();
        locations[getX()][right].setCanbePressed(true);
    }

    public void upRight() {
        int up = getX() - locations[getX()][getY()].getSteps();
        ;
        int right = getY() + locations[getX()][getY()].getSteps();
        ;
        if (up > 7 || right > 7) {
            up = getX();
            right = getY();
        }
        locations[up][right].setCanbePressed(true);
    }

    public void downRight() {
        int down = getX() + locations[getX()][getY()].getSteps();
        ;
        int right = getY() + locations[getX()][getY()].getSteps();
        ;
        if (down > 7 || right > 7) {
            down = getX();
            right = getY();
        }
        locations[down][right].setCanbePressed(true);
    }

    public void upLeft() {
        int up = getX() - locations[getX()][getY()].getSteps();
        ;
        int left = getY() - locations[getX()][getY()].getSteps();
        ;
        if (up < 0 || left < 0) {
            up = getX();
            left = getY();
        }
        locations[up][left].setCanbePressed(true);
    }

    public void downLeft() {
        int down = getX() + locations[getX()][getY()].getSteps();
        ;
        int left = getY() - locations[getX()][getY()].getSteps();
        ;
        if (down > 7 || left < 0) {
            down = getX();
            left = getY();
        }
        locations[down][left].setCanbePressed(true);
    }

    public void checkZeroSteps() {
        int subtractstep = locations[getX()][getY()].getSteps() - 1;
        if (subtractstep == 0) {
            for (int i = 0; i < locations.length; i++) {
                for (int j = 0; j < locations[0].length; j++) {
                    locations[i][j].setEnabled(false);
                }
            }
            getFirst().setText("Oh no!");
            getSecond().setText("You Lost!");
        } else {
            for (int i = 0; i < locations.length; i++) {
                for (int j = 0; j < locations[0].length; j++) {
                    locations[i][j].setSteps(subtractstep);
                }
            }
        }
    }

    public void checkOrientation() {
        if (locations[getX()][getY()].getOrientation().equals("up")) {
            for (int i = getX(); i < 6; i++) {
                locations[i][getY()].setCanbePressed(false);
            }
        } else if (locations[getX()][getY()].getOrientation().equals("down")) {
            for (int i = getX(); i >= 0; i--) {
                locations[i][getY()].setCanbePressed(false);
            }
        } else if (locations[getX()][getY()].getOrientation().equals("right")) {
            for (int i = getY(); i >= 0; i--) {
                locations[getX()][i].setCanbePressed(false);
            }
        } else if (locations[getX()][getY()].getOrientation().equals("left")) {
            for (int i = getY(); i < 6; i++) {
                locations[getX()][i].setCanbePressed(false);
            }
        }
    }

    public void setFalse() {
        for (int i = 0; i < locations.length; i++) {
            for (int j = 0; j < locations[0].length; j++) {
                locations[i][j].setCanbePressed(false);
            }
        }
    }

    public void canPressStars() {
        for (int i = getX() - 1; i >= 0; i--) {
            locations[i][getY()].setOrientation("up");
            if (locations[i][getY()].getShape().equals("star")) {
                locations[i][getY()].setCanbePressed(true);

            }
        }
        for (int i = getX() + 1; i < 6; i++) {
            locations[i][getY()].setOrientation("down");
            if (locations[i][getY()].getShape().equals("star")) {
                locations[i][getY()].setCanbePressed(true);

            }
        }
        for (int i = getY() - 1; i >= 0; i--) {
            locations[getX()][i].setOrientation("left");
            if (locations[getX()][i].getShape().equals("star")) {
                locations[getX()][i].setCanbePressed(true);

            }
        }
        for (int i = getY() + 1; i < 6; i++) {
            locations[getX()][i].setOrientation("right");
            if (locations[getX()][i].getShape().equals("star")) {
                locations[getX()][i].setCanbePressed(true);

            }
        }
    }

    public void canPressFlowers() {
        for (int i = getX() - 1; i >= 0; i--) {
            locations[i][getY()].setOrientation("up");
            if (locations[i][getY()].getShape().equals("flower")) {
                locations[i][getY()].setCanbePressed(true);

            }
        }
        for (int i = getX() + 1; i < 6; i++) {
            locations[i][getY()].setOrientation("down");
            if (locations[i][getY()].getShape().equals("flower")) {
                locations[i][getY()].setCanbePressed(true);

            }
        }
        for (int i = getY() - 1; i >= 0; i--) {
            locations[getX()][i].setOrientation("left");
            if (locations[getX()][i].getShape().equals("flower")) {
                locations[getX()][i].setCanbePressed(true);

            }
        }
        for (int i = getY() + 1; i < 6; i++) {
            locations[getX()][i].setOrientation("right");
            if (locations[getX()][i].getShape().equals("flower")) {
                locations[getX()][i].setCanbePressed(true);

            }
        }
    }

    public void canPressDiamonds() {
        for (int i = getX() - 1; i >= 0; i--) {
            locations[i][getY()].setOrientation("up");
            if (locations[i][getY()].getShape().equals("diamond")) {
                locations[i][getY()].setCanbePressed(true);

            }
        }
        for (int i = getX() + 1; i < 6; i++) {
            locations[i][getY()].setOrientation("down");
            if (locations[i][getY()].getShape().equals("diamond")) {
                locations[i][getY()].setCanbePressed(true);

            }
        }
        for (int i = getY() - 1; i >= 0; i--) {
            locations[getX()][i].setOrientation("left");
            if (locations[getX()][i].getShape().equals("diamond")) {
                locations[getX()][i].setCanbePressed(true);

            }
        }
        for (int i = getY() + 1; i < 6; i++) {
            locations[getX()][i].setOrientation("right");
            if (locations[getX()][i].getShape().equals("diamond")) {
                locations[getX()][i].setCanbePressed(true);

            }
        }
    }

    public void canPressPlus() {
        for (int i = getX() - 1; i >= 0; i--) {
            locations[i][getY()].setOrientation("up");
            if (locations[i][getY()].getShape().equals("plus")) {
                locations[i][getY()].setCanbePressed(true);


            }
        }
        for (int i = getX() + 1; i < 6; i++) {
            locations[i][getY()].setOrientation("down");
            if (locations[i][getY()].getShape().equals("plus")) {
                locations[i][getY()].setCanbePressed(true);


            }
        }
        for (int i = getY() - 1; i >= 0; i--) {
            locations[getX()][i].setOrientation("left");
            if (locations[getX()][i].getShape().equals("plus")) {
                locations[getX()][i].setCanbePressed(true);


            }
        }
        for (int i = getY() + 1; i < 6; i++) {
            locations[getX()][i].setOrientation("right");
            if (locations[getX()][i].getShape().equals("plus")) {
                locations[getX()][i].setCanbePressed(true);

            }
        }
    }

    public void canPressYellow() {
        for (int i = getX() - 1; i >= 0; i--) {
            locations[i][getY()].setOrientation("up");
            if (locations[i][getY()].getColor().equals("yellow")) {
                locations[i][getY()].setCanbePressed(true);

            }
        }
        for (int i = getX() + 1; i < 6; i++) {
            locations[i][getY()].setOrientation("down");
            if (locations[i][getY()].getColor().equals("yellow")) {
                locations[i][getY()].setCanbePressed(true);

            }
        }
        for (int i = getY() - 1; i >= 0; i--) {
            locations[getX()][i].setOrientation("left");
            if (locations[getX()][i].getColor().equals("yellow")) {
                locations[getX()][i].setCanbePressed(true);

            }
        }
        for (int i = getY() + 1; i < 6; i++) {
            locations[getX()][i].setOrientation("right");
            if (locations[getX()][i].getColor().equals("yellow")) {
                locations[getX()][i].setCanbePressed(true);

            }
        }
    }

    public void canPressRed() {
        for (int i = getX() - 1; i >= 0; i--) {
            locations[i][getY()].setOrientation("up");
            if (locations[i][getY()].getColor().equals("red")) {
                locations[i][getY()].setCanbePressed(true);

            }
        }
        for (int i = getX() + 1; i < 6; i++) {
            locations[i][getY()].setOrientation("down");
            if (locations[i][getY()].getColor().equals("red")) {
                locations[i][getY()].setCanbePressed(true);

            }
        }
        for (int i = getY() - 1; i >= 0; i--) {
            locations[getX()][i].setOrientation("left");
            if (locations[getX()][i].getColor().equals("red")) {
                locations[getX()][i].setCanbePressed(true);

            }
        }
        for (int i = getY() + 1; i < 6; i++) {
            locations[getX()][i].setOrientation("right");
            if (locations[getX()][i].getColor().equals("red")) {
                locations[getX()][i].setCanbePressed(true);

            }
        }
    }

    public void canPressGreen() {
        for (int i = getX() - 1; i >= 0; i--) {
            locations[i][getY()].setOrientation("up");
            if (locations[i][getY()].getColor().equals("green")) {
                locations[i][getY()].setCanbePressed(true);

            }
        }
        for (int i = getX() + 1; i < 6; i++) {
            locations[i][getY()].setOrientation("down");
            if (locations[i][getY()].getColor().equals("green")) {
                locations[i][getY()].setCanbePressed(true);

            }
        }
        for (int i = getY() - 1; i >= 0; i--) {
            locations[getX()][i].setOrientation("left");
            if (locations[getX()][i].getColor().equals("green")) {
                locations[getX()][i].setCanbePressed(true);

            }
        }
        for (int i = getY() + 1; i < 6; i++) {
            locations[getX()][i].setOrientation("right");
            if (locations[getX()][i].getColor().equals("green")) {
                locations[getX()][i].setCanbePressed(true);

            }
        }
    }

    public void canPressBlue() {
        for (int i = getX() - 1; i >= 0; i--) {
            locations[i][getY()].setOrientation("up");
            if (locations[i][getY()].getColor().equals("blue")) {
                locations[i][getY()].setCanbePressed(true);

            }
        }
        for (int i = getX() + 1; i < 6; i++) {
            locations[i][getY()].setOrientation("down");
            if (locations[i][getY()].getColor().equals("blue")) {
                locations[i][getY()].setCanbePressed(true);

            }
        }
        for (int i = getY() - 1; i >= 0; i--) {
            locations[getX()][i].setOrientation("left");
            if (locations[getX()][i].getColor().equals("blue")) {
                locations[getX()][i].setCanbePressed(true);

            }
        }
        for (int i = getY() + 1; i < 6; i++) {
            locations[getX()][i].setOrientation("right");
            if (locations[getX()][i].getColor().equals("blue")) {
                locations[getX()][i].setCanbePressed(true);

            }
        }
    }

    public void actionPerformed(ActionEvent e) {
        Transition();
    }
}
