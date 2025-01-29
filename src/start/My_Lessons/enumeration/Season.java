package start.My_Lessons.enumeration;

public enum Season {
	SUMMER(30),
	WINTER(-20),
	AUTUMN(15),
	SPRING(17);
	private int t;

	Season(int t) {
		this.t = t;
	}

	public int getT() {
		return t;
	}

	@Override
	public String toString() {
		return "Season{" +
				"t=" + t +
				'}';
	}
}
