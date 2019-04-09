package emirim.handler;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import emirim.audios.ObstacleAudio;
import emirim.audios.TreasureAudio;
import emirim.constant.KakaoConstant;
import emirim.view.KakaoView;

public class KakaoHandler extends KeyAdapter {
	private JLabel lbl;
	private KakaoView view;
	private int[] obstacleX, obstacleY, treasureX, treasureY;
	private int[] obstartX, obendX, obstartY, obendY;
	private int[] trstartX, trendX, trstartY, trendY;
	private JLabel lblScore;
	private boolean prev_status_hit = false;
	
	public KakaoHandler(KakaoView view) {
		super();
		this.view = view;
		this.lbl = view.getLbl();				//ĳ���� ��
		this.lblScore = view.getLblScore();		//���� ��
		this.obstacleX = view.getObstacleX();	//��ֹ� X ��ǥ�� ����� �迭
		this.obstacleY = view.getObstacleY();	//��ֹ� Y ��ǥ�� ����� �迭
		this.treasureX = view.getTreasureX();	//���� X ��ǥ�� ����� �迭
		this.treasureY = view.getTreasureY();	//���� Y ��ǥ�� ����� �迭
		this.obstartX = new int[obstacleX.length];		//��ֹ��� ���۵Ǵ� X ��ǥ 3���� �����ϴ� �迭
		this.obendX = new int[obstacleX.length];		//��ֹ��� ������ X ��ǥ 3���� �����ϴ� �迭
		this.obstartY = new int[obstacleX.length];		//��ֹ��� �����ϴ� Y ��ǥ 3���� �����ϴ� �迭
		this.obendY = new int[obstacleX.length];		//��ֹ��� ������ Y ��ǥ 3���� �����ϴ� �迭
		for (int i = 0; i < obendX.length; i++) {
			obstartX[i] = obstacleX[i] - KakaoConstant.RB_JLABEL_WIDTH;
			obendX[i] = obstacleX[i] + KakaoConstant.OT_JLABEL_WIDTH;
			obstartY[i] = obstacleY[i] - KakaoConstant.RB_JLABEL_HEIGHT;
			obendY[i] = obstacleY[i] + KakaoConstant.OT_JLABEL_HEIGHT;
		}
//		ĳ���Ϳ� ������ �ε����� ������ ������ ����
		this.trstartX = new int[treasureX.length];
		this.trendX = new int[treasureX.length];
		this.trstartY = new int[treasureX.length];
		this.trendY = new int[treasureX.length];
		for (int i = 0; i < trendX.length; i++) {
			trstartX[i] = treasureX[i] - KakaoConstant.RB_JLABEL_WIDTH;
			trendX[i] = treasureX[i] + KakaoConstant.OT_JLABEL_WIDTH;
			trstartY[i] = treasureY[i] - KakaoConstant.RB_JLABEL_HEIGHT;
			trendY[i] = treasureY[i] + KakaoConstant.OT_JLABEL_HEIGHT;
		}
	}

	@Override
	public void keyPressed(KeyEvent e) {
		int x = lbl.getX();
		int y = lbl.getY();
		boolean object_hit = false;
		
		if (view.getScore() >= 100) {
			int ok = JOptionPane.showConfirmDialog(view, "2�ܰ�� �Ѿ�ðڽ��ϱ�?");
			if (ok == 0) {
				view.setScore(0);
				lblScore.setText("����: 0");
//				view.setVisible(false);
////				view.dispose();
//				new KakaoView();
			}
		}
		
//		��ֹ��� ��ġ�� Ȯ���ؼ� ���� ����
		for (int i = 0; i < obendX.length; i++) {
			if (x > obstartX[i] && x < obendX[i]) {
				if (y > obstartY[i] && y < obendY[i]) {
					if (!prev_status_hit) {
						view.setScore(view.getScore()-10);
						lblScore.setText("����: " + view.getScore());
						new ObstacleAudio();
					}
					object_hit = true;
				}
			}
		}
//		������ ��ġ�� Ȯ���ؼ� ���� ����
		for (int i = 0; i < treasureX.length; i++) {
			if (x > trstartX[i] && x < trendX[i]) {
				if (y > trstartY[i] && y < trendY[i]) {
					if (!prev_status_hit) {
						view.setScore(view.getScore() + 10);
						lblScore.setText("����: " + view.getScore());
						new TreasureAudio();
					}
						object_hit = true;
				}
			}
		}
		prev_status_hit = object_hit;
		
		switch (e.getKeyCode()) {
		case KeyEvent.VK_RIGHT:		//������ ����Ű
			if (x == KakaoConstant.JFRAME_WIDTH - KakaoConstant.RB_JLABEL_WIDTH) {
				lbl.setLocation(x, y);
			} else {
				lbl.setLocation(x + 5, y);
			}
			lbl.setIcon(new ImageIcon("imgs/RB_right.png"));
			break;
		case KeyEvent.VK_LEFT:		//���� ����Ű
			if (x == 0) {
				lbl.setLocation(x, y);
			} else {
				lbl.setLocation(x - 5, y);
			}
			lbl.setIcon(new ImageIcon("imgs/RB_left.png"));
			break;
		case KeyEvent.VK_UP:		//���� ����Ű
			if (y == 0) {
				lbl.setLocation(x, y);
			} else {
				lbl.setLocation(x, y - 5);
			}
			lbl.setIcon(new ImageIcon("imgs/RB_back.png"));
			break;
		case KeyEvent.VK_DOWN:		//�Ʒ��� ����Ű
			if (y == KakaoConstant.JFRAME_HEIGHT - KakaoConstant.RB_JLABEL_HEIGHT - 30) {
				lbl.setLocation(x, y);
			} else {
				lbl.setLocation(x, y + 5);
			}
			lbl.setIcon(new ImageIcon("imgs/RB_front.png"));
			break;
		}
	}
}