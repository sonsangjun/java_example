package _20150416_class_ex;
public class ConstrExample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int My_score[] = new int[1000];
		int Blank[] = new int[0];
		for(int i = 0; i<My_score.length; i++)
			My_score[i] = (int)(Math.random() * 100);	//Math.random() is making random number.
			
		Numbers Num = new Numbers(My_score);
		
		for(int i : My_score)
		{
			System.out.println("total : " + Num.getTotal() + " average : " + Num.getAverage());
			System.out.println("static total : " + Numbers._total + " static average : " + Numbers._average);
			Num.print_num();
		}
		
		//Test
		Numbers Num_test = new Numbers(Blank);
		Num_test.getTotal();
		Num_test.getAverage();
		
		
	}
	
	static void printSubscriberInfo(SubscriberInfo obj)
	{
		System.out.printf("name : " + obj.name + "\nid : " + obj.id + "\npassword : " + obj.password + "\nPhone : " + obj.phoneNo + "\naddress : " + obj.address);
		System.out.println();
	}

}
