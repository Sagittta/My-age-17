package emirim.thread;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import emirim.view.AnimationView;

public class AnimationThread extends Thread {
	private AnimationView av;
	private JLabel lblDy;
	private boolean rightFlag;
	private int sleepTime = 200;
	private boolean stopFlag = false;	//stop�� �� true stop�� �ƴ� �� false
	
	public AnimationThread(AnimationView av) {
		super();
		this.av = av;
		this.lblDy = av.getLblDy();
	}
	
	public void setSleepTime(int sleepTime) {
		this.sleepTime = sleepTime;
	}

	public void setStopFlag(boolean stopFlag) {
		this.stopFlag = stopFlag;
	}

	@Override
	public void run() {
		String filename = null;
		ImageIcon icon = null;
		while (true) {
			synchronized (this) {
				if (stopFlag) {		//stopFlag == true�� �����尡 ���� �ְ� �Ѵ�.
					try {
						wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				} else {
					if (lblDy.getX() == 520)
						rightFlag = false;
					else if (lblDy.getX() == 0)
						rightFlag = true;
					
					if (rightFlag) {//�����ʹ���
						lblDy.setLocation(lblDy.getX() + 10, lblDy.getY());
						filename = "imgs/Ha_right.gif";
						icon = new ImageIcon(filename);
						lblDy.setIcon(icon);
					} else {	//���� ����
						lblDy.setLocation(lblDy.getX() - 10, lblDy.getY());
						filename = "imgs/Ha_left.gif";
						icon = new ImageIcon(filename);
						lblDy.setIcon(icon);
					}
					try {
						sleep(sleepTime);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}	//else
			}	//end synchronized
		}	//while
	}	//run
	
}