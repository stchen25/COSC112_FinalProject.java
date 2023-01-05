import java.awt.*;
import javax.swing.*;

public class Rules extends JFrame {
    StartPanel st = new StartPanel();

    public void init() {

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container ct = getContentPane();
        ct.setLayout(null);
        JLabel title = new JLabel("RULES:");
        title.setBounds(150, 25, 100, 100);
        ct.add(title);
        JLabel maze1 = new JLabel(" Maze1: Each square has a number that indicates how far you must move--\n" +
                "horizontally or vertically. ");
        JLabel maze12 = new JLabel("Start at the upper-left red box and find your way to the green box!");
        maze1.setBounds(150, 100, 750, 100);
        maze12.setBounds(150, 120, 750, 100);
        JLabel maze2 = new JLabel("Maze 2: Start on red square. The moves you can make are indicated by the arrows in each box.");
        maze2.setBounds(150, 215, 790, 100);
        JLabel maze22 = new JLabel("Red arrows increase the size of your steps by 1. yellow decreases by 1.");
        maze22.setBounds(150, 235, 790, 100);
        JLabel maze23 = new JLabel("if number of steps goes down to 0, you lose. Reach the Goal!");
        maze23.setBounds(150, 255, 790, 100);
        JLabel maze3 = new JLabel("Maze3: Moving horizontally or vertically, you must choose spaces with the same color and/or shape as");
        JLabel maze32 = new JLabel("the space you are currently on. However, when you make a move, ");
        maze3.setBounds(150, 360, 750, 100);
        maze32.setBounds(150, 380, 750, 100);
        JLabel maze33 = new JLabel("you CANNOT move back in the direction you came from. Reach the Goal!!");
        maze33.setBounds(150, 400, 750, 100);
        JLabel bigrule = new JLabel("For each maze, click a button to make a move.");
        bigrule.setBounds(150, 450, 750, 100);
        JLabel warning = new JLabel("For ALL mazes, pressing a wrong button means you LOSE!!!!");
        warning.setBounds(150, 470, 750, 100);

        JButton toMaze1 = new JButton("Maze 1");
        toMaze1.setBounds(100, 550, 100, 25);
        toMaze1.addActionListener(new switchtoMaze1(st));
        JButton toMaze2 = new JButton("Maze 2");
        toMaze2.setBounds(250, 550, 100, 25);
        toMaze2.addActionListener(new switchtoMaze2(st));
        JButton toMaze3 = new JButton("Maze 3");
        toMaze3.setBounds(400, 550, 100, 25);
        toMaze3.addActionListener(new switchtoMaze3(st));
        ct.add(maze1);
        ct.add(maze12);
        ct.add(maze2);
        ct.add(maze22);
        ct.add(maze23);
        ct.add(maze3);
        ct.add(toMaze1);
        ct.add(toMaze2);
        ct.add(toMaze3);
        ct.add(maze32);
        ct.add(maze33);
        ct.add(bigrule);
        ct.add(warning);
        //ct.setVisible(true);
    }
}
