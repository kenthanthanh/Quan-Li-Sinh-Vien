package Test;

import java.awt.EventQueue;

// import javax.swing.UIManager;

import View.QLSVView;

public class Test{
    public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					QLSVView frame = new QLSVView();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
// public static void main(String[] args) {
// 		try {
// 			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
// 			new QLSVView();
// 		} catch (Exception e) {
// 			e.printStackTrace();
// 		}
// 	}

}