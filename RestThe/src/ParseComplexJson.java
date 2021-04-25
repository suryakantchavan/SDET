import Util.Payload;
import io.restassured.path.json.JsonPath;

public class ParseComplexJson  {

	public static void main(String[] args) {
		
		JsonPath js = new JsonPath(Payload.coursePrice());
		
		int size= js.getInt("courses.size()");
		
		System.out.println(size);
		
		int amount = js.getInt("dashboard.purchaseAmount");
		
		System.out.println(amount);
		
		
		Thread t= Thread.currentThread();
		System.out.println(t.isAlive());
				int a=3;
				int b=6;
		 int d= a ^ b;
		 System.out.println("jj"+ d );
		
		int var1=1;
		int var2=~var1;
		System.out.println(var1+" "+var2);
		
		
		String st="Microsoft";
		System.out.println(st.equals("microsoft"));
		
		String str="hellocandidate ";
		System.out.println("beofre" + str);
		str.trim();
		System.out.println("after" + str);
		int j =str.indexOf(" ");
		System.out.println("j is" + j);
		
		
		
				
		
		
		for(int i=0;i<size;i++)
		{
			String courses= js.getString("courses["+i+"].title");
			String copies= js.getString("courses["+i+"].copies");
			String price= js.getString("courses["+i+"].price");
			System.out.println(courses);
			System.out.println(copies);
			System.out.println(price);
		}
	}
}
