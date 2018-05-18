package test;




/**
 * @author zero
 * @version 1.1
 * @createTime：2016年4月26日 @decript:
 */
public class Test {
	public static int count=0;
	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
		Test.class.newInstance().test();
	}

	public void test() throws InstantiationException, IllegalAccessException {
		int n=350; 

		System.out.println(count+1);
	}
}