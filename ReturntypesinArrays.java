/* Here i am declaring two methods, one return type is the array(declared int) and the other method return type is 
 * argument is array(declared as double), lets see the output
 */

package arrays;
public class ReturntypesinArrays 
{
		int [] m1()
		{
			System.out.println("This is method 1");
			int [] aa = {1,2,3};
			return aa;
		}
		public void m2(double [] dd)
		{
			System.out.println("This is method 2");
			for(double d:dd)
			{
				System.out.println(d);
			}
		}
	public static void main(String[] args)
	{
		ReturntypesinArrays t = new ReturntypesinArrays();
		int [] x= t.m1();
		for(int xx:x) 
		{
			System.out.println(xx);
		}
		double [] d = {11.5,10.6,23.6};
		t.m2(d);
		
	}
}

	
	
