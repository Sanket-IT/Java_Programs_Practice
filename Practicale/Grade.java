class Grade 
{
  	public static void main(String args[])
	{
              int per=85;
      		if(per>80)
		{
			System.out.println("The grade of the student is A with distinction");
		}else 
		if (per>=70 && per<=80)
		{
			System.out.println("The grade of the student is A");
		}else
		 if(per>=65 && per<70)
		{
			System.out.println("The grade of the student is B");
		}else 
		if(per>=60 && per<65)
		{
			System.out.println("The grade of the student is C");
		}else
		 if (per>=50 && per<60)
		{
			System.out.println("The grade of the student is D");
		}else	
		 if (per<50 && per>=40)
		{
			System.out.println("The grade of the student is E");
		}else
		{
			System.out.println("The student is fail"); 
		}
	}
}