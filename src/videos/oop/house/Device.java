package videos.oop.house;

public interface Device {
	abstract void on();
	abstract void off();
	abstract void check();
	abstract String getId();
	abstract boolean isOff();
}
