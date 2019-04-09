package emirim.view;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

import emirim.constant.KakaoConstant;

public class KakaoView extends JFrame {
	private JLabel lbl, lblScore;
	private int[] obstacleX = {30, 600, 300};	//장애물 X 좌표
	private int[] obstacleY = {160, 50, 500};	//장애물 Y 좌표
	private int[] treasureX = {350, 80, 500};	//보물 X 좌표
	private int[] treasureY = {250, 400, 300};	//보물 Y 좌표
	private JLabel[] lblObstacle, lblTreasure;
	private int score;
	private JLabel lblBG = new JLabel(new ImageIcon("imgs/bg/BGI.png"));
	
	public KakaoView() {
		
		getContentPane().setBackground(Color.WHITE);
		
		setLayout(null);		//border layout을 제거
		lblScore = new JLabel("점수 : " + score);		//점수 표시 라벨
		lblScore.setBounds(KakaoConstant.JFRAME_WIDTH - KakaoConstant.SCORE_JLABEL_WIDTH - 10, 30, KakaoConstant.SCORE_JLABEL_WIDTH, KakaoConstant.SCORE_JLABEL_HEIGHT);
		add(lblScore);
		lbl = new JLabel(new ImageIcon("imgs/RB_right.png"));	//캐릭터 라벨 객체 생성
		lbl.setBounds(0, 0, KakaoConstant.RB_JLABEL_WIDTH, KakaoConstant.RB_JLABEL_HEIGHT);
		add(lbl);
		lblObstacle = new JLabel[obstacleX.length];		//장애물의 X좌표 길이
		lblTreasure = new JLabel[treasureX.length];
//		장애물 JLabel
		for (int i = 0; i < lblObstacle.length; i++) {
			lblObstacle[i] = new JLabel(new ImageIcon("imgs/ob" + (i+1) + ".gif"));
			lblObstacle[i].setBounds(obstacleX[i], obstacleY[i], KakaoConstant.OT_JLABEL_WIDTH, KakaoConstant.OT_JLABEL_HEIGHT);
			add(lblObstacle[i]);
		}
//		보물 JLabel
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
		setResizable(false);	//프레임 크기 변경 X
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
