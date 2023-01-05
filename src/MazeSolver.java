import java.util.ArrayList;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class MazeSolver implements ActionListener {
    ArrayList<State> states = new ArrayList<State>();
    ArrayList<State> previous = new ArrayList<State>();

    String mazeType;
    Buttons[][] locations;
    private int startX;
    private int startY;
    private int endX = 6;
    private int endY = 6;
    JLabel label1;
    JLabel label2;
    private State start;
    private State last;

    public MazeSolver(String mt, Buttons[][] l, int x, int y) {
        mazeType = mt;
        locations = l;
        startX = x;
        startY = y;
        label1 = new JLabel();
        label2 = new JLabel();
        if (mazeType.equals("maze 1")) {
            endX = 6;
            endY = 6;
        } else if (mazeType.equals("maze 2")) {
            endX = 2;
            endY = 2;
        } else if (mazeType.equals("maze 3")) {
            endX = 0;
            endY = 2;
        }
    }

    public void Solve() {
        start = new State(locations, startX, startY, label1, label2, mazeType);
        states.add(start);

        while (!states.isEmpty()) {
            State removed = states.remove(0);
            if (removed.getX() == endX && removed.getY() == endY) {
                System.out.println("1");
                previous.add(removed);
                last = removed;
                break;
            }
            previous.add(removed);
            removed.Transition();
            for (int i = 0; i < locations.length; i++) {
                for (int j = 0; j < locations[0].length; j++) {
                    if (locations[i][j].getCanbePressed()) {
                        State created = new State(locations, i, j, label1, label2, mazeType);

                        if (!alreadyBeen(created)) {
                            states.add(created);
                            removed.addChild(created);
                            last = created;
                        }
                        if (this.mazeType.equals("maze 2")) {
                            if (locations[i][j].getSteps() >= 5) break;
                        }
                    }
                }
            }

        }

        for (int x = 0; x < locations.length; x++) {
            for (int y = 0; y < locations[0].length; y++) {
                locations[x][y].setText(null);
            }
        }
        int steps = getSteps();
        State l = last;
        while (l.getParent() != null) {
            System.out.println(steps);
            locations[l.getX()][l.getY()].setText(" " + steps);
            locations[l.getX()][l.getY()].setEnabled(true);
            steps--;
            l = l.getParent();
        }


        locations[endX][endY].setText(" " + (getSteps() + 1));
        locations[endX][endY].setEnabled(true);

    }

    public int getSteps() {
        State l = last;
        int steps = 0;
        while (l.getParent() != null) {

            steps++;
            l = l.getParent();
        }
        return steps;
    }

    public boolean alreadyBeen(State moving) {
        if (this.mazeType.equals("maze 1")) {
            for (State j : previous) {
                if (moving.getX() == j.getX() && moving.getY() == j.getY()) {
                    System.out.println("visited");
                    return true;
                }
            }
        }
        if (this.mazeType.equals("maze 2")) {
            for (State j : previous) {
                if ((moving.getX() == j.getX() && moving.getY() == j.getY()
                        && moving.getButton().getSteps() == j.getButton().getSteps())) {
                    System.out.println("visited");
                    System.out.println(moving.getButton().getSteps());
                    return true;
                }
            }
        }
        if (this.mazeType.equals("maze 3")) {
            for (State j : previous) {
                if (moving.getX() == j.getX() && moving.getY() == j.getY()
                        && moving.getButton().getOrientation().equals(j.getButton().getOrientation())) {
                    System.out.println("visited");
                    return true;
                }
            }
        }
        return false;
    }

    public void actionPerformed(ActionEvent e) {
        Solve();
//        Maze1Creation m1 = new Maze1Creation();
//        m1.repaint();
    }
}
