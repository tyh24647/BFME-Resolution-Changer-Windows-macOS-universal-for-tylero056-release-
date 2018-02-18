import javax.swing.JComponent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * ViewController object acts as a delegate between the model and view objects
 *
 * @author Tyler Hostager
 * @version 1.0.0
 * @since 2/18/18
 */
public class ViewController implements ActionListener {
    private boolean isDebug;
    private BFMEResModel model;
    private MainGUI ui;
    private JComponent[] viewComponents;

    /**
     * Default constructor
     */
    public ViewController() {

    }

    /**
     * Constructs view controller using custom debug settings
     *
     * @param isDebug
     */
    public ViewController(boolean isDebug) {
        this.isDebug = isDebug;
    }

    /**
     *
     * @param model
     * @param ui
     */
    public ViewController(BFMEResModel model, MainGUI ui) {
        this.model = model;
        this.ui = ui;
    }

    public ViewController(boolean isDebug, BFMEResModel model, MainGUI ui) {
        this.isDebug = isDebug;
        this.model = model;
        this.ui = ui;
    }

    public void initUI() {

    }

    public void initUI(boolean isDebug) {
        this.isDebug = isDebug;
        ui.showUI();
    }

    public boolean isDebug() {
        return isDebug;
    }

    public void setDebug(boolean debug) {
        isDebug = debug;
    }

    public BFMEResModel getModel() {
        return model;
    }

    public void setModel(BFMEResModel model) {
        this.model = model;
    }

    public MainGUI getUi() {
        return ui;
    }

    public void setUi(MainGUI ui) {
        this.ui = ui;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
