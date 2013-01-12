package migapp;

import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class MainWindow extends JFrame {
	
	private JMenuBar menuBar = new JMenuBar();
	private JMenu fileMenu = new JMenu("File");
	private JMenu editMenu = new JMenu("Edit");
	private JMenu saveMenu = new JMenu("Save");
	private JMenuItem newMenuItem = new JMenuItem("New");
	private JMenuItem saveMenuItem = new JMenuItem("Save");
	private JMenuItem saveAsMenuItem = new JMenuItem("Save As...");
	private JMenuItem exitMenuItem = new JMenuItem("Exit");
	private JLabel nameLabel = new JLabel("Name");
	private JTextField nameTextField = new JTextField(20);
	private JCheckBox qualifiedCheckBox = new JCheckBox("Qualified");
	private JCheckBox completedCheckBox = new JCheckBox("Completed");
	private JRadioButton primaryRadioButton = new JRadioButton("Primary");
	private JRadioButton secondaryRadioButton = new JRadioButton("Secondary");
	private JRadioButton thirdLevelRadioButton = new JRadioButton("Third Level");
	private ButtonGroup eductaionLevelButtonGroup = new ButtonGroup();

	public MainWindow(){
		this.setLayout(new FlowLayout());
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setJMenuBar(menuBar);
		menuBar.add(fileMenu);
		menuBar.add(editMenu);
		menuBar.add(saveMenu);
		fileMenu.add(newMenuItem);
		fileMenu.add(saveMenuItem);
		fileMenu.add(saveAsMenuItem);
		fileMenu.add(exitMenuItem);
		this.add(nameLabel);
		this.add(nameTextField);
		this.add(qualifiedCheckBox);
		this.add(completedCheckBox);
		this.add(primaryRadioButton);
		this.add(secondaryRadioButton);
		this.add(thirdLevelRadioButton);
		eductaionLevelButtonGroup.add(primaryRadioButton);
		eductaionLevelButtonGroup.add(secondaryRadioButton);
		eductaionLevelButtonGroup.add(thirdLevelRadioButton);
		primaryRadioButton.setSelected(true);
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String systemLookAndFeelClassName = UIManager.getSystemLookAndFeelClassName();
		try {
			UIManager.setLookAndFeel(systemLookAndFeelClassName);
		} 
		catch (Exception e) {
			
		}
		MainWindow window = new MainWindow();
		window.setSize(500, 300);	
		window.setLocationRelativeTo(null);
		window.setVisible(true);
		window.playSequenceOfEvents();
	}

	public void playSequenceOfEvents() {
		JOptionPane.showMessageDialog(this, "The application has started correctly.");
		int result = JOptionPane.showConfirmDialog(this, "Do you want to continue?", "Continue", JOptionPane.YES_NO_OPTION);
		if (result == JOptionPane.YES_OPTION) {
			System.out.println("You selected Yes");
		}
		else if (result == JOptionPane.NO_OPTION) {
			System.out.println("You selected Yes");
		}
		String answer = JOptionPane.showInputDialog(this, "What is the capitol of France? ");
		if (answer != null) {
			System.out.println("You answered " + answer);
		}
		
	}

}
