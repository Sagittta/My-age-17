package emirim.domain;

public class StudentVO {
	
	private String name;
	private int number;
	private int korean;
	private int english;
	private int math;
	private int home;
	private int history;
	private int sum;
	private double average;
	
	public StudentVO(String name, int number, int korean, int english, int math, int home, int history) {
		super();
		this.name = name;
		this.number = number;
		this.korean = korean;
		this.english = english;
		this.math = math;
		this.home = home;
		this.history = history;
		//this.sum = sum;
		//this.average = average;
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int getKorean() {
		return korean;
	}

	public void setKorean(int korean) {
		this.korean = korean;
	}

	public int getEnglish() {
		return english;
	}

	public void setEnglish(int english) {
		this.english = english;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getHome() {
		return home;
	}

	public void setHome(int home) {
		this.home = home;
	}

	public int getHistory() {
		return history;
	}

	public void setHistory(int history) {
		this.history = history;
	}

	public int getSum() {
		sum = korean+english+math+home+history;
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}

	public double getAverage() {
		average = sum/5;
		return average;
	}

	public void setAverage(double average) {
		this.average = average;
	}
	
}
