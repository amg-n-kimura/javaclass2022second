package jp.co.amgakuin.javaclss2022second.framework;

public interface IGameControllerCallback {

	final static int STATE_INITIALIZED = 1;
	final static int STATE_EXITING = 999;
	
	void gameControllerCallback(int state);	
}
