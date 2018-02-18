import javax.swing.SwingUtilities;

/**
 * @author Tyler Hostager
 * @version 1.0.0
 * @since 2/18/18
 */
public class ApplicationDriver {
    private static ViewController vc;
    private static BFMEResModel model;
    private static MainGUI ui;
    private static boolean isDebug;

    public static void main(String[] args) {
        model = new BFMEResModel();
        ui = new MainGUI();

    }

    private static void initApplication() {
        SwingUtilities.invokeLater(ApplicationDriver::initObjs);
    }

    private static void initObjs() {
        vc = new ViewController(isDebug, model, ui);
        vc.initUI(isDebug);
    }
}
