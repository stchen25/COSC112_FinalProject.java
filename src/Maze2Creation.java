import java.awt.*;
import javax.swing.*;

public class Maze2Creation extends JFrame {
    private Maze2Buttons[][] locations;
    private int XlocationCount = 8;
    private int YlocationCount = 8;
    private String mazeType = "maze 2";

    private int[] values = {0, 1, 2, 3, 4, 4, 4, 4,
            5, 6, 4, 7, 4, 8, 9, 2,
            6, 10, 11, 1, 12, 13, 4, 13,
            14, 15, 12, 16, 20, 17, 9, 18,
            13, 6, 13, 19, 16, 21, 21, 22,
            6, 13, 23, 24, 25, 26, 13, 27,
            28, 26, 4, 26, 26, 28, 29, 13,
            28, 28, 8, 4, 30, 26, 31, 9};

    public void init() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container maze2 = getContentPane();
        maze2.setLayout(new GridLayout(9, 8));
        JLabel label1 = new JLabel("click red box");
        JLabel label2 = new JLabel("to begin");
        locations = new Maze2Buttons[XlocationCount][YlocationCount];
        int index = 0;
        for (int i = 0; i < locations.length; i++) {
            for (int j = 0; j < locations[0].length; j++) {
                locations[i][j] = new Maze2Buttons();
                locations[i][j].setOpaque(true);
                locations[i][j].setBorderPainted(false);
                if (i == 2 && j == 2) locations[i][j].setBackground(Color.GREEN);
                else if (i == 5 && j == 5) locations[i][j].setBackground(Color.RED);
                else if ((i + j) % 2 == 0) {
                    locations[i][j].setBackground(new Color(0, 0, 139));
                    locations[i][j].setForeground(Color.WHITE);
                } else if ((i + j) % 2 == 1) {
                    locations[i][j].setBackground(Color.YELLOW);
                    locations[i][j].setForeground(Color.BLACK);
                }

                locations[i][j].setIndex(values[index]);

                index++;
                maze2.add(locations[i][j]);
                locations[i][j].setSteps(1);
                locations[i][j].addActionListener(new State(locations, i, j, label1, label2, mazeType));

            }
        }
        locations[2][2].addActionListener(new Goalbutton(locations[2][2], label1, label2));
        for (int i = 0; i < locations.length; i++) {
            for (int j = 0; j < locations[0].length; j++) {
                if (i == 5 && j == 5) locations[i][j].setCanbePressed(true);
                else locations[i][j].setCanbePressed(false);
            }
        }

        maze2.add(label1);
        maze2.add(label2);
        JButton options = new JButton("options");
        maze2.add(options);
        ButtonToMenuListener2 fl = new ButtonToMenuListener2(options, locations);
        options.addActionListener(fl);


    }
}

//locations[6][6].addActionListener(new Goalbutton(locations[6][6], label1, label2));



