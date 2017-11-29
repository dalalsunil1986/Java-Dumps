package declarations_Access_Control;

public enum Element {
	EARTH, WIND, FIRE {
		public String info() {
			return "Hot";
		}
	};
	public String info() {
		return "element";
	}
}
