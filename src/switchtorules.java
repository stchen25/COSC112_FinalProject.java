import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class switchtorules implements ActionListener {
    StartPanel start;

    public switchtorules(StartPanel st) {
        this.start = st;
    }

    public void actionPerformed(ActionEvent e) {
        start.getContentPane().removeAll();
        start.initm4();
        start.validate();
        start.repaint();
    }
}
