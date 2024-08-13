interface I1
{
	public int m1(int a);
	default String m2(int a)
	{
		System.out.println("defined method of I1");
		return "completed";
	}
}
interface I2 
{
	public long m3(String ss);	
	default String m4(int a)
	{
		System.out.println("defined method of I12");
		return "completed";
	}
}
class Test
{
	public static void main(String[] args)
	{
		I1 obj = a -> { System.out.println("I1 method using Lambda");
			return 100;
		};
		System.out.println(obj.m1(10));

		
		I2 obj2 = ss -> { System.out.println("I2 method using Lambda");
			return 345678;
		};
		System.out.println(obj2.m3("hello"));
		
		System.out.println(obj.m2(1));
		System.out.println(obj2.m4(2));
	}
}