package com.nareshit.D_java_support_concepts.J_working_with_generics;


interface Printable
{
	void print();
}
@SuppressWarnings("serial")
class MyNumber extends Number implements Printable 
{
	private int value;  //90
	
	
	public MyNumber(int value) 
	{
		super();
		this.value = value;
	}

	@Override
	public void print() 
	{
		System.out.println(value);	//90	
	}

	@Override
	public int intValue() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public long longValue() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public float floatValue() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double doubleValue() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}

class Accept<T extends Number & Printable> //Upper bound
{
	private T item;

	public Accept(T item) //MyNumber item = new MyNumber(90);
	{
		super();
		this.item = item;
	}
	
	public void show()
	{
		item.print();
		
	}
}


public class wildCardWithClassInterface
{
  public static void main(String[] args) 
  {
	Accept<MyNumber> accept = new Accept<>(new MyNumber(100));
	accept.show();
  }
}

