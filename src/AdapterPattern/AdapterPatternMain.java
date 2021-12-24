package AdapterPattern;

import AdapterPattern.adapter.AudioPlayer;

public class AdapterPatternMain {

	public static void main(String[] args) {
		AudioPlayer audioPlayer = new AudioPlayer();
		audioPlayer.play("mp4", "哪吒");
		audioPlayer.play("mp3", "烟花易冷");
		audioPlayer.play("vlc", "老片");
		audioPlayer.play("MP5", "假的");
	}

}
