
/*******************************************************

 ********************************************************/
//	PACKAGES NEEDED
import javax.swing.JFrame;
import java.awt.event.*;
import java.awt.*;
import interactivex.*;
import javax.swing.JPanel;

/**
 *
 * @author Sely
 *
 * This is a Template class for Effects to be created.
 * EffectTemplate can be replaced with the class name developer prefers
 * We recommend the class to be placed in a unique package, so that it duplication problem can be eliminated.
 * There are dummy methods which can be filled with your creative codes.
 */
public final class EffectTemplate extends EffectManager implements CameraListener {

    RenderingHints hints = new RenderingHints(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

    public EffectTemplate() {
        /**
         * Calls the designconfigurepanel() to initialize the Configure Panel 
         * Constructor ensures the method has been called.
         */
        designConfigurePanel();
        this.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseMoved(MouseEvent me) {
                /**
                 * Define the action here so that it can be previewed by mouse move on a JFrame.
                 * This can be used for testing and is needed for preview section of the software.
                 */
            }
        });

        /**
         * This method is used to update the EffectPanel in a loop that executes independently (daemon thread)
         */
        animate();
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        /**
         * This part can be used to update the EffectPanel.
         * This part decides how the panel is shown at when ever the repaint method is called.
         *
         */

    }

    public void animate() {

        class RunBack extends Thread {

            RunBack() {
                /**
                 * Sets the thread to work independently.
                 */
                setDaemon(true);
                start();
            }

            public void run() {
                while (true) {
                    /**
                     * This loops lets a mechanism to update what ever in a continues manner.
                     * This can be controlled by introducing Thread.sleep() method.
                     */
                    repaint();
                }
            }
        }

        /**
         * starts an instance of the RunBack class.
         */
        new RunBack();

    }

    private void designConfigurePanel() {
        JPanel jConfigurePanel = this.getConfigurePanel();
        /**
         * Now jConfigurePanel can be used to design the Configure Panel of the effect.
         * jConfigurePanel has the memory for the panel.
         * Any changes made to jConfigure will be affected the Configure Panel of the Effect.
         *
         */
    }

    public void shapeOnCameraDetected(CameraEvent ce) {
        /**
         * This method is called when ever an image is found on the camera.
         * CameraEvent object is used to get information about the image found.
         * The informations can be image center, outline of image, out line of image in sorted order.
         *
         * What ever given on mouseMove() is applicable here also.
         */
    }

    public static void main(String[] arg) {

        /**
         * Testing of the effects can be done here, like an example given below.
         */
        EffectTemplate iTemplate = new EffectTemplate();
        JFrame jf = new JFrame("Interactive Frame");
        jf.setContentPane(iTemplate);
        jf.setSize(700, 600);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
