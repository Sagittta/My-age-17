package emirim.controller;

import emirim.handler.BtnAnimationHandler;
import emirim.thread.AnimationThread;
import emirim.view.AnimationView;

public class AnimationController {

	public static void main(String[] args) {
		AnimationView av = new AnimationView();
		AnimationThread at = new AnimationThread(av);
		BtnAnimationHandler l = new BtnAnimationHandler(av, at);
		av.getBtnFast().addActionListener(l);
		av.getBtnSlow().addActionListener(l);
		av.getBtnStop().addActionListener(l);
		av.getBtnStart().addActionListener(l);
		at.start();
	}

}
