class Diwali
{
	public static void main(String[] args) 
	{
		int no_of_problems=6;
		int party_time_total=4*60;
		int travelling_time=180;

		int remaining_time=party_time_total-travelling_time;

		
        int count=0;
		for(int i=0;i<no_of_problems;i++)
		{
			int each_question_time=5*i;

			remaining_time=remaining_time-each_question_time;

			if(remaining_time>each_question_time)
				count++;
		}
		System.out.println("the number of problem solved "+count);
		
	}
}