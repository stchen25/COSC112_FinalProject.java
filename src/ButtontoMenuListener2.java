import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;

class ButtonToMenuListener2 implements ActionListener {
    StartPanel st = new StartPanel();
    private JButton myButton;
    JPopupMenu menu;
    private Maze2Buttons[][] buttons;

    public ButtonToMenuListener2(JButton clicker, Maze2Buttons[][] b) {
        myButton = clicker;
        buttons = b;


        // create a popup menu
        menu = new JPopupMenu("Menu");
        JMenuItem Maze2 = new JMenuItem("Restart");
        menu.add(Maze2);
        Maze2.addActionListener(new switchtoMaze2(st));

        // create a menu item
        JMenuItem Maze1 = new JMenuItem("Maze 1");
        // add the menu item to the menu
        menu.add(Maze1);
        // add a listener to the menu item
        Maze1.addActionListener(new switchtoMaze1(st));

        // create a menu item
        JMenuItem Maze3 = new JMenuItem("Maze 3");
        // add the menu item to the menu
        menu.add(Maze3);
        // add a listener to the menu item
        Maze3.addActionListener(new switchtoMaze3(st));

        JMenuItem rules = new JMenuItem("Rules");
        menu.add(rules);
        rules.addActionListener(new switchtorules(st));

        JMenuItem solution = new JMenuItem("See Solution");
        menu.add(solution);
        solution.addActionListener(new MazeSolver("maze 2", buttons, 5, 5));

        menu.add(new JMenuItem("Close"));
    }

    public void actionPerformed(ActionEvent e) {

        menu.show(myButton, myButton.getWidth() / 2, myButton.getHeight() / 2);
    }


}