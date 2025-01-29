package videos.oop.house;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Group {
	private List<Device> room = new ArrayList<>();

	public Group(Device...devices) {
		room.addAll(Arrays.asList(devices));
	}
	public void groupOn() {
		for (Device device : room) {
			device.on();
		}
	}
	public void groupOff() {
		for (Device device : room) {
			device.off();
		}
	}
	public void groupCheck() {
		for (Device device : room) {
			device.check();
		}
	}
}
