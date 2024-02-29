package bezier.src.ui;

import bezier.src.Main;

import javax.swing.*;
import javax.swing.SpinnerNumberModel;
import java.awt.*;

public class MainWindow extends JFrame {
    private final Main main;
    private JPanel panel;

    public MainWindow(Main main) {
        super("Bézier Curves");
        this.main = main;

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        createAndAddMenuBar();
        createCanvas();
        add(panel);
        pack();
        setLocationRelativeTo(null);
        setResizable(false);
    }

    private void createAndAddMenuBar() {
        final JMenuBar menuBar = new JMenuBar();

        // Menu
        final JMenu options = new JMenu("Options");
        menuBar.add(options);

        final JMenuItem settingsItem = options.add(new JMenuItem("Settings"));
        settingsItem.setToolTipText("Settings for your Bézier curves and more");
        settingsItem.setAccelerator(KeyStroke.getKeyStroke("control S"));
        settingsItem.addActionListener(l -> WindowManager.openWindow(main.getSettingsWindow()));

        setJMenuBar(menuBar);
    }

    private void createCanvas() {
        panel = new JPanel() {
            public void paintComponent(Graphics g) {
                super.paintComponent(g);
            }
        };

        final Dimension size = new Dimension(800, 600);

        JSpinner testSpinner = new JSpinner();
        testSpinner.setPreferredSize(new Dimension(50, 20));

        JButton testButton = new JButton("Test");
        testButton.setPreferredSize(new Dimension(200, 50));
        JTextField testTextField = new JTextField();
        testTextField.setPreferredSize(new Dimension(200, 50));
        testTextField.setText("Test");

        panel.add(testSpinner);
        panel.add(testButton);
        panel.add(testTextField);

        panel.setPreferredSize(size);
        panel.setMinimumSize(size);
        panel.setMaximumSize(size);
    }
}

















