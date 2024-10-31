package com.nareshit.D_java_support_concepts.F_inner_classes;

/* 
 
 ->In java it is possible to define a class (inner class) inside another class(outer class) called nested class.

 ->In the same way, It is also possible to define a class/interface/enum/ annotation/record inside another 
   class/interface/enum/annotation and record asshown below.
 
*/

class CarOuterClass{
	
	private String carModelNumber;
	private String carName;
	private EngineInnerClass engine;
	
	
	class EngineInnerClass{
		private int engineNumber;
		private String engineModel;
		
		public EngineInnerClass(int engineNumber, String engineModel) {
			super();
			this.engineNumber = engineNumber;
			this.engineModel = engineModel;
		}

		public int getEngineNumber() {
			return engineNumber;
		}

		public void setEngineNumber(int engineNumber) {
			this.engineNumber = engineNumber;
		}

		public String getEngineModel() {
			return engineModel;
		}

		public void setEngineModel(String engineModel) {
			this.engineModel = engineModel;
		}
	}
	
	public CarOuterClass(String carModelNumber, String carName, EngineInnerClass engine)
	{
		super();
		this.carModelNumber = carModelNumber;
		this.carName = carName;
		this.engine = engine;
	}


	public void showCarDetails()
	{
		System.out.println("-----------------------------------");
		
		System.out.println("Car Details Are: ");
		System.out.println("Car Model is "+carModelNumber);
		System.out.println("Car Name is "+carName);
		System.out.println();
		System.out.println("Engine Details Are: ");
		System.out.println("Engine Number is "+engine.getEngineNumber());
		System.out.println("Engine Mobel is "+engine.getEngineModel());
		
		System.out.println("-----------------------------------");
		
	}

	
}

public class InnerClassProgram01 {

	public static void main(String[] args) 
	{
		CarOuterClass.EngineInnerClass engine1=new CarOuterClass(null, null,null).new EngineInnerClass(0, null);
	}

}
