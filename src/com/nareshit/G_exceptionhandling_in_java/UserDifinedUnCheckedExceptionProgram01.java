package com.nareshit.G_exceptionhandling_in_java;

@SuppressWarnings("serial")
class InsufficientBalance extends RuntimeException
{
	public InsufficientBalance()
	{
		
	}
	
	public InsufficientBalance(String errorMessage)
	{
		super(errorMessage);
	}
	
}


public class UserDifinedUnCheckedExceptionProgram01 {

	public static void main(String[] args) 
	{
		try {
			throw new InsufficientBalance("Balance is Insufficient");
		}
		catch(InsufficientBalance ib)
		{
			System.out.println(ib.getMessage());
		}

	}

}
