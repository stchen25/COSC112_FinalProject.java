import java.awt.*;

import javax.swing.*;

public class StartPanel extends JFrame {
    private Color col;
    Container contentpane;
    JButton button1;
    JButton button2;
    JButton button3;
    JLabel Welcome;

    public void init() {
        contentpane = this.getContentPane();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //contentpane.setBackground(Color.BLACK);


        contentpane.setLayout(null);
        button1 = new JButton("Maze 1");
        button1.setBounds(100, 500, 100, 40);
        button1.addActionListener(new switchtoMaze1(this));
        contentpane.add(button1);

        button2 = new JButton("Maze 2");
        button2.setBounds(350, 500, 100, 40);
        button2.addActionListener(new switchtoMaze2(this));
        contentpane.add(button2);


        button3 = new JButton("Maze 3");
        button3.setBounds(600, 500, 100, 40);
        button3.addActionListener(new switchtoMaze3(this));
        contentpane.add(button3);

        JButton rules = new JButton("rules");
        rules.setBounds(350, 570, 100, 40);
        rules.addActionListener(new switchtorules(this));
        contentpane.add(rules);

        Welcome = new JLabel("Welcome!!! \n Please select a maze!");
        Welcome.setForeground(col);
        Welcome.setBounds(300, 50, 250, 25);
        contentpane.add(Welcome);
        JLabel name = new JLabel("Stephen Chen, COSC-112JTerm, Final Project");
        name.setLayout(null);
        name.setFont(name.getFont().deriveFont(8.0f));
        name.setBounds(10, 20, 200, 50);
        contentpane.add(name);
        JLabel firstMaze = new JLabel(new ImageIcon("firstMaze.png"));
        firstMaze.setLayout(null);
        firstMaze.setBounds(25, 250, 250, 250);
        contentpane.add(firstMaze);
        JLabel secondMaze = new JLabel(new ImageIcon("secondMaze.png"));
        secondMaze.setLayout(null);
        secondMaze.setBounds(275, 250, 250, 250);
        contentpane.add(secondMaze);
        JLabel thirdMaze = new JLabel(new ImageIcon("thirdMaze.png"));
        thirdMaze.setLayout(null);
        thirdMaze.setBounds(540, 250, 250, 250);
        contentpane.add(thirdMaze);
        JLabel mammoth = new JLabel(new ImageIcon("AmherstCollege.jpeg"));
        mammoth.setLayout(null);
        mammoth.setBounds(25, 50, 200, 200);
        contentpane.add(mammoth);
        JLabel brain = new JLabel(new ImageIcon("Brain.png"));
        brain.setLayout(null);
        brain.setBounds(560, 50, 200, 200);
        contentpane.add(brain);
        contentpane.setVisible(true);
    }

    public void initm1() {
        Maze1Creation MC = new Maze1Creation();
        MC.init();
        MC.pack();
        MC.setSize(1000, 800);
        MC.setVisible(true);

    }

    public void initm2() {
        Maze2Creation MC = new Maze2Creation();
        MC.init();
        MC.pack();
        MC.setSize(1000, 800);
        MC.setVisible(true);
    }

    public void initm3() {
        Maze3Creation MC = new Maze3Creation();
        MC.init();
        MC.pack();
        MC.setSize(1000, 800);
        MC.setVisible(true);
    }

    public void initm4() {
        Rules r = new Rules();
        r.init();
        r.pack();
        r.setSize(1000, 800);
        r.setVisible(true);
    }

    public static void main(String[] args) {
        StartPanel s = new StartPanel();
        s.init();
        s.pack();

        s.setSize(800, 650);
        s.setVisible(true);


    }
}
