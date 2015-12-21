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

class Paper extends Questions {
	private ArrayList<Questions> list ;
	Paper(){
		 list = new ArrayList<Questions>();
	}
	public void add( Questions questions ) {
		list.add(questions);
	}
	
	public void print() {
		Iterator<Questions> iterator = list.iterator();
		while( iterator.hasNext() ){
			Questions c = iterator.next();
			c.print();
		}
	}
}

class Main {
	void m1( Questions[] c ){
		for( Questions cc : c){
			cc.print();
		}
	}
}