package AdapterPattern.Entity;

import AdapterPattern.api.AdvancedMediaPlayer;

public class VlcPlayer implements AdvancedMediaPlayer{

	@Override
	public void playVlc(String fileName) {
		System.out.println("playing vlc file " + fileName);
		
	}

	@Override
	public void playMp4(String fileName) {
		// TODO Auto-generated method stub
		
	}
	
}
