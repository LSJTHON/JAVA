package ch08.sec5;

public class Audio implements RemoteControl{

	private int volume;

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("오디오를 켜요");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("오디오를 꺼요");
	}

	@Override
	public void setVolume(int volume) {
		// TODO Auto-generated method stub
		if(volume > RemoteControl.MAX_VOLUME) {
			this.volume = volume;
		}else if(volume < RemoteControl.MIN_VOLUME) {
			this.volume = volume;
		}else {
			this.volume = volume;
		}
	}
	
	private int memoryVolume;

	@Override
	public void setMute(boolean mute) {
		// TODO Auto-generated method stub
		if(mute) {
			this.memoryVolume = this.volume;
			System.out.println("무음 처리합니다.");
			setVolume(RemoteControl.MIN_VOLUME);
		}else {
			System.out.println("무음 헤제합니다.");
			setVolume(RemoteControl.MAX_VOLUME);
		}
	}
	
	
}
