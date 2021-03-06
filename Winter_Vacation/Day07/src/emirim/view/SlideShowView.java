package emirim.view;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SlideShowView extends JFrame {
	private JLabel lblImg = new JLabel("", JLabel.CENTER);
	private JButton btnFast = new JButton("빠르게");
	private JButton btnMiddle = new JButton("적당히");
	private JButton btnSlow = new JButton("느리게");
	
	public SlideShowView() {
		JPanel panBtn = new JPanel();
		panBtn.setBackground(Color.WHITE);
		panBtn.add(btnFast);
		panBtn.add(btnMiddle);
		panBtn.add(btnSlow);
		add(lblImg, "Center");
		add(panBtn, "South");
		setTitle("Image Slide Show");
		getContentPane().setBackground(new Color(235, 201, 239));;
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(100, 120, 382, 452);
		setVisible(true);
	}

	public JLabel getLblImg() {
		return lblImg;
	}

	public JButton getBtnFast() {
		return btnFast;
	}

	public JButton getBtnMiddle() {
		return btnMiddle;
	}

	public JButton getBtnSlow() {
		return btnSlow;
	}
}
