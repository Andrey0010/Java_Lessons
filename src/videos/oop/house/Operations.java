package videos.oop.house;

public enum Operations {
	ONSUCCESS("Успешное включение"),
	ONNOTSUCCESS("Попытка включения"),
	OFFSUCCESS("Успешное выключение"),
	OFFNOTSUCCESS("Попытка выключения"),
	CHECKON("Проверка. ВКЛ."),
	CHECKOFF("Проверка. ВЫКЛ.");
	private String message;

	Operations(String message) {
		this.message = message;
	}
	public String getMessage() {
		return message;
	}
}