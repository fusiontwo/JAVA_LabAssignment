package week10.practice2.source01;

public class Word {
	String eng;
	String kor;
	
	public Word(String eng, String kor) {
		super();
		this.eng = eng;
		this.kor = kor;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.eng + ": " + this.kor;
	}
	
	

}
