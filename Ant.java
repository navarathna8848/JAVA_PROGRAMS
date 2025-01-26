class Ant
{
	public static void main(String[] args) 
	{
		int no_of_pos=6;
		int arr[]={1,-1,-1,1,1,-1};// 1 indicates ant position is at right ,-1 indicates ant position is at left 

		int count=0;
		int total=0;
		for(int i=0;i<arr.length;i++)
		{
			total=total+arr[i];
		
		if(total==0)
		{
		count++;
		}

	    }
		System.out.println("the number of ants crossing the original positions "+count);
		
	}
}