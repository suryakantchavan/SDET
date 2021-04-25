package KakaShree;

public class Language {

	String name;

	public Language() {

		System.out.println("Constractor method called ");
	}

	public Language(String t) {
		name = t;

	}
	
	
	public static void main(String[] args) {
		Language cpp = new Language();
		Language java = new Language("Java");
		cpp.setName("CPP");
		java.getName();
		cpp.getName();
		
	}
	
	
	

	void setName(String t)
	{
		name =t;
	}
	
	
	  String getName() {
		System.out.println();
		return name;
		
		
	}
}
