package Com.ait.wk5;

public class Tree {
	private String type;

	public Tree() {
		type = "Beech";


	}

	public Tree (String type) {
		this.type = type;

	}
	public String getType() {
		return type;
	}
	public String getType(String perfix) {
		return perfix + " " + type;

	}
}
