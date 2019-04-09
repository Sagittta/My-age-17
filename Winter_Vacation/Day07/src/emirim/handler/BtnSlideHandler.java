package emirim.handler;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import emirim.thread.SlideShowThread;
import emirim.view.SlideShowView;

public class BtnSlideHandler implements ActionListener {
	
	private SlideShowView ssv;
	private SlideShowThread sst;
	
	public BtnSlideHandler(SlideShowView ssv, SlideShowThread sst) {
		super();
		this.ssv = ssv;
		this.sst = sst;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object eo = e.getSource();
		if (eo == ssv.getBtnFast()) {
			sst.setSleepTime(100);
		} else if (eo == ssv.getBtnMiddle()) {
			sst.setSleepTime(600);
		} else {
			sst.setSleepTime(1500);
		}
	}

}
