import java.awt.*;
import javax.swing.*;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Maze1Creation extends JFrame {
    private Maze1Buttons[][] locations;
    private int XlocationCount = 7;
    private int YlocationCount = 7;
    int[] values = new int[49];
    String mazeType = "maze 1";


    public void init() {
        File file = new File("Maze1File");

        try {
            Scanner scan = new Scanner(file);
            int i = 0;
            while (scan.hasNextInt()) {
                values[i] = scan.nextInt();
                i++;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container maze1 = getContentPane();
        maze1.setLayout(new GridLayout(8, 7));
        JLabel label1 = new JLabel("click red box");
        JLabel label2 = new JLabel("to begin");
        locations = new Maze1Buttons[XlocationCount][YlocationCount];
        int index = 0;
        for (int i = 0; i < locations.length; i++) {
            for (int j = 0; j < locations[0].length; j++) {
                locations[i][j] = new Maze1Buttons();
                locations[i][j].setOpaque(true);
                locations[i][j].setBorderPainted(false);
                if (i + j == 0) locations[i][j].setBackground(Color.RED);
                else if (i + j == 12) locations[i][j].setBackground(Color.GREEN);
                else if ((i + j) % 2 == 0) {
                    locations[i][j].setBackground(Color.BLACK);
                    locations[i][j].setForeground(Color.YELLOW);
                } else if ((i + j) % 2 == 1) {
                    locations[i][j].setBackground(Color.YELLOW);
                    locations[i][j].setForeground(Color.BLACK);
                }

                maze1.add(locations[i][j]);
                locations[i][j].setNumSteps(values[index]);
                locations[i][j].setText(" " + values[index]);
                index++;
                locations[i][j].addActionListener(new State(locations, i, j, label1, label2, mazeType));
            }
        }

        maze1.add(label1);

        maze1.add(label2);
        locations[6][6].addActionListener(new Goalbutton(locations[6][6], label1, label2));
        for (int i = 0; i < locations.length; i++) {
            for (int j = 0; j < locations[0].length; j++) {
                if (i + j == 0) {
                    locations[i][j].setCanbePressed(true);
                } else locations[i][j].setCanbePressed(false);
            }

        }

        locations[6][6].setText("Goal");

        JButton options = new JButton("options");
        maze1.add(options);
        ButtonToMenuListener1 fl = new ButtonToMenuListener1(options, locations);
        options.addActionListener(fl);


        // maze1.setVisible(true);

    }

}
