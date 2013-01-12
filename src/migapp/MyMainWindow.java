package migapp;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.UIManager;

import net.miginfocom.swing.MigLayout;

public class MyMainWindow extends JFrame{
	
	private JMenuBar menuBar = new JMenuBar();
	private JMenu fileMenu = new JMenu("File");
	private JMenuItem loadMenuItem = new JMenuItem("Load");
	private JMenuItem saveMenuItem = new JMenuItem("Save");
	private JMenuItem exitMenuItem = new JMenuItem("Exit");
	private JMenu saveMenu = new JMenu("Save");
	
	
	public MyMainWindow() {
		this.setLayout(new MigLayout("debug"));
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setJMenuBar(menuBar);
		menuBar.add(fileMenu);
		fileMenu.add(loadMenuItem);
		fileMenu.add(saveMenuItem);
		fileMenu.add(exitMenuItem);
		
		loadMenuItem.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				
			}	
		});
		
		saveMenuItem.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				FileOutputStream fos = null;
				try {
					fos = new FileOutputStream("testfile.dat");
					ObjectOutputStream out = new ObjectOutputStream(fos);
					out.writeObject(fileMenu);
				} catch (IOException e1) {
					e1.printStackTrace();
				}
				finally {
					try {
						if (fos != null) {
							fos.close();
						}
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
			}
		});
	}

	public static void main(String[] args) {
		String systemLookAndFeelClassName = UIManager.getSystemLookAndFeelClassName();
		try {
			UIManager.setLookAndFeel(systemLookAndFeelClassName);
		} 
		catch (Exception e) {	
		}
		//System.out.println("L&F: " + systemLookAndFeelClassName);
		MyMainWindow window = new MyMainWindow();
		window.setSize(500, 300);	
		window.setLocationRelativeTo(null);
		window.setVisible(true);
		JFrame frame = new JFrame("A JFrame");
		frame.setVisible(true);
		window.playSequenceOfEvents();
	}

	private void playSequenceOfEvents() {
		// TODO Auto-generated method stub
		
	}

}
