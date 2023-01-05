import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;

class ButtonToMenuListener3 implements ActionListener {
    StartPanel st = new StartPanel();
    private JButton myButton;
    JPopupMenu menu;
    Maze3Buttons[][] buttons;


    public ButtonToMenuListener3(JButton clicker, Maze3Buttons[][] b) {
        myButton = clicker;
        buttons = b;

        // create a popup menu
        menu = new JPopupMenu("Menu");
        JMenuItem Maze3 = new JMenuItem("Restart");
        menu.add(Maze3);
        Maze3.addActionListener(new switchtoMaze3(st));

        // create a menu item
        JMenuItem Maze1 = new JMenuItem("Maze 1");
        // add the menu item to the menu
        menu.add(Maze1);
        // add a listener to the menu item
        Maze1.addActionListener(new switchtoMaze1(st));

        // create a menu item
        JMenuItem Maze2 = new JMenuItem("Maze 2");
        // add the menu item to the menu
        menu.add(Maze2);
        // add a listener to the menu item
        Maze2.addActionListener(new switchtoMaze2(st));

        JMenuItem rules = new JMenuItem("Rules");
        menu.add(rules);
        rules.addActionListener(new switchtorules(st));


        JMenuItem solution = new JMenuItem("See Solution");
        menu.add(solution);
        solution.addActionListener(new MazeSolver("maze 3", buttons, 5, 1));

        menu.add(new JMenuItem("Close"));
    }

    public void actionPerformed(ActionEvent e) {

        menu.show(myButton, myButton.getWidth() / 2, myButton.getHeight() / 2);
    }


}
