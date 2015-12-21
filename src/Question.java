import java.util.ArrayList;
import java.util.Iterator;

abstract class Questions {
	abstract void print();
}

class Question extends Questions {
	String description;
	public Question(String desc) {
		this.description = desc;
	}
	public void print() {
		System.out.println(description);
	}
}