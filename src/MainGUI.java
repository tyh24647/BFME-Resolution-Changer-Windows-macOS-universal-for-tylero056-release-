import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;

/**
 * @author Tyler Hostager
 * @version 1.0.0
 * @since 2/18/18
 */
public class MainGUI extends JFrame {
    private JPanel mainPanel;



    public MainGUI() {

    }

    public void generateViewComponents() {

    }

    public void generateMainPanel() {
        if (mainPanel == null) {
            this.mainPanel = new JPanel(new BorderLayout());
        }
    }

    public void showUI() throws NullPointerException {
        if (mainPanel == null) {
            generateMainPanel();
        }


    }
}
