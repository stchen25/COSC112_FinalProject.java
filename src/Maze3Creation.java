import java.awt.*;
import javax.swing.*;


public class Maze3Creation extends JFrame {
    private Maze3Buttons[][] locations;
    private int XlocationCount = 6;
    private int YlocationCount = 6;
    private String mazeType = "maze 3";
    private int[] values = {0, 0, 14, 0, 0, 0,
            6, 8, 3, 13, 7, 4,
            4, 3, 8, 10, 11, 9,
            5, 6, 11, 12, 3, 2,
            11, 7, 2, 3, 9, 12,
            0, 1, 0, 0, 0, 0};

    public void init() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container maze3 = getContentPane();
        maze3.setLayout(new GridLayout(7, 6));
        JLabel label1 = new JLabel("click red box");
        JLabel label2 = new JLabel("to begin");
        locations = new Maze3Buttons[XlocationCount][YlocationCount];
        int index = 0;
        for (int i = 0; i < locations.length; i++) {
            for (int j = 0; j < locations[0].length; j++) {
                locations[i][j] = new Maze3Buttons();
                locations[i][j].setOpaque(true);
                locations[i][j].setBorderPainted(false);
                locations[i][j].setIndex(values[index]);
                locations[i][j].setOrientation("up");
                locations[i][j].setProperties();

                maze3.add(locations[i][j]);
                index++;
            }
        }
        for (int i = 0; i < locations.length; i++) {
            for (int j = 0; j < locations[0].length; j++) {
                locations[i][j].addActionListener(new State(locations, i, j, label1, label2, mazeType));
            }
        }
        locations[5][1].setBackground(Color.RED);
        locations[0][2].addActionListener(new Goalbutton(locations[2][2], label1, label2));
        for (int i = 0; i < locations.length; i++) {
            for (int j = 0; j < locations[0].length; j++) {
                if (i == 5 && j == 1) locations[i][j].setCanbePressed(true);
                else locations[i][j].setCanbePressed(false);
            }
        }
        maze3.add(label1);
        maze3.add(label2);


        JButton options = new JButton("options");
        maze3.add(options);
        ButtonToMenuListener3 fl = new ButtonToMenuListener3(options, locations);
        options.addActionListener(fl);
    }
}
