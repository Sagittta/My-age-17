package emirim.view;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

import emirim.constant.KakaoConstant;

public class KakaoView extends JFrame {
	private JLabel lbl, lblScore;
	private int[] obstacleX = {30, 600, 300};	//��ֹ� X ��ǥ
	private int[] obstacleY = {160, 50, 500};	//��ֹ� Y ��ǥ
	private int[] treasureX = {350, 80, 500};	//���� X ��ǥ
	private int[] treasureY = {250, 400, 300};	//���� Y ��ǥ
	private JLabel[] lblObstacle, lblTreasure;
	private int score;
	private JLabel lblBG = new JLabel(new ImageIcon("imgs/bg/BGI.png"));
	
	public KakaoView() {
		
		getContentPane().setBackground(Color.WHITE);
		
		setLayout(null);		//border layout�� ����
		lblScore = new JLabel("���� : " + score);		//���� ǥ�� ��
		lblScore.setBounds(KakaoConstant.JFRAME_WIDTH - KakaoConstant.SCORE_JLABEL_WIDTH - 10, 30, KakaoConstant.SCORE_JLABEL_WIDTH, KakaoConstant.SCORE_JLABEL_HEIGHT);
		add(lblScore);
		lbl = new JLabel(new ImageIcon("imgs/RB_right.png"));	//ĳ���� �� ��ü ����
		lbl.setBounds(0, 0, KakaoConstant.RB_JLABEL_WIDTH, KakaoConstant.RB_JLABEL_HEIGHT);
		add(lbl);
		lblObstacle = new JLabel[obstacleX.length];		//��ֹ��� X��ǥ ����
		lblTreasure = new JLabel[treasureX.length];
//		��ֹ� JLabel
		for (int i = 0; i < lblObstacle.length; i++) {
			lblObstacle[i] = new JLabel(new ImageIcon("imgs/ob" + (i+1) + ".gif"));
			lblObstacle[i].setBounds(obstacleX[i], obstacleY[i], KakaoConstant.OT_JLABEL_WIDTH, KakaoConstant.OT_JLABEL_HEIGHT);
			add(lblObstacle[i]);
		}
//		���� JLabel
		for (int i = 0; i < lblTreasure.length; i++) {
			lblTreasure[i] = new JLabel(new ImageIcon("imgs/tr" + (i + 1) + ".gif"));
			lblTreasure[i].setBounds(treasureX[i], treasureY[i], KakaoConstant.OT_JLABEL_WIDTH, KakaoConstant.OT_JLABEL_HEIGHT);
			add(lblTreasure[i]);
		}
		
		lblBG.setBounds(0, 0, KakaoConstant.JFRAME_WIDTH, KakaoConstant.JFRAME_HEIGHT);
		add(lblBG);
		
		setFocusable(true);
		setTitle("Kakao");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(100, 50, KakaoConstant.JFRAME_WIDTH, KakaoConstant.JFRAME_HEIGHT);
		setResizable(false);	//������ ũ�� ���� X
		setVisible(true);
	}

	public JLabel getLbl() {
		return lbl;
	}

	public JLabel getLblScore() {
		return lblScore;
	}

	public int[] getObstacleX() {
		return obstacleX;
	}

	public int[] getObstacleY() {
		return obstacleY;
	}

	public int[] getTreasureX() {
		return treasureX;
	}

	public int[] getTreasureY() {
		return treasureY;
	}

	public JLabel[] getLblObstacle() {
		return lblObstacle;
	}

	public JLabel[] getLblTreasure() {
		return lblTreasure;
	}

	public void setScore(int score) {
		this.score = score;
	}
	public int getScore() {
		return score;
	}

	public JLabel getLblBG() {
		return lblBG;
	}
}
