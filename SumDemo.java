interface TestInt
{
	public int add(int a, int b);
}

class SumDemo{
	public static void main(String[] args)
	{
		TestInt t=(x,y)->(x+y);
		System.out.println(t.add(10,20));
		};
	}
}