package ws08.ex02;

public class Student {
	private String name;
	private String gender;
	private int score;

	public Student(String name, String gender, int score) {
		this.name = name;
		this.gender = gender;
		this.score = score;
	}

	public String getName() { return name; }
	public String getGender() { return gender; }
	public int getScore() { return score; }

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Student [name=");
		builder.append(name);
		builder.append(", gender=");
		builder.append(gender);
		builder.append(", score=");
		builder.append(score);
		builder.append("]");
		return builder.toString();
	}
	
	
}
