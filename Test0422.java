public class Test0422{
	public static void main(String[] args){
		System.out.println("20150422開發流程練習");
		int x=10, y=5;
		//new A().minFunc(x, y);
		//new B().maxFunc(x, y);
		new C().avgFunc(x, y);
	}
}
<<<<<<< HEAD
class C{
	 void avgFunc(int a,int b){
	float avg;
	avg=((float)a+(float)b)/2;
	System.out.println("avg: "+avg);
	}

}
=======
class A{
	void minFunc(int a,int b){
		if(a>b){
			System.out.print(b);
		}else
			System.out.print(a);
	}
}
	
>>>>>>> 2de14ea3117dee1bb8a9b01998aa96f27b260eab
