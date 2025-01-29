package videos.oop.house;

public class Bulb implements Device{
	private String id;
	private boolean isOff;

	public Bulb(String id) {
		this.id = id;
		this.isOff = true;
	}
	@Override
	public void on() {
		if (isOff) {
			isOff = false;
			System.out.println(this.id + ": " + Operations.ONSUCCESS.getMessage());
		}else {
			System.out.println(this.id + ": " + Operations.ONNOTSUCCESS.getMessage());
		}
	}
	@Override
	public void off() {
		if (!isOff) {
			isOff = true;
			System.out.println(this.id + ": " + Operations.OFFSUCCESS.getMessage());
		}else {
			System.out.println(this.id + ": " + Operations.OFFNOTSUCCESS.getMessage());
		}
	}
	@Override
	public void check() {
		if (isOff)
			System.out.println(this.id + ": " + Operations.CHECKOFF.getMessage());
		if (!isOff)
			System.out.println(this.id + ": " + Operations.CHECKON.getMessage());
	}
	@Override
	public String getId() {
		return id;
	}
	@Override
	public boolean isOff() {
		return true;
	}
	@Override
	public String toString() {
		return "Bulb{" +
				"id='" + id + '\'' +
				", isOff=" + isOff +
				'}';
	}
}
