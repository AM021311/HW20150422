public class Test0422{
	public static void main(String[] args){
		System.out.println("20150422�}�o�y�{�m��");
		int x=10, y=5;
		//new A().minFunc(x, y);
		//new B().maxFunc(x, y);
		new C().avgFunc(x, y);
	}
}
class C{
	 void avgFunc(int a,int b){
	float avg;
	avg=((float)a+(float)b)/2;
	System.out.println("avg: "+avg);
	}

}