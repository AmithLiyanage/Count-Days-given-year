class Year{
	
	static int year;
	
	Year(int y){
		year = y;
	}

	boolean isLeapYear(){
		if((year%4==0 && year%100!=0) || year%400==0)
			return true;
		else
			return false;
	}

	int days(){
		if(isLeapYear())
			return 366;
		else
			return 365;
	}

	int days(int n){
		if(n==2){
			if(isLeapYear())
				return 29;
			else
				return 28;
		}else if(n<=7){
			if(n%2==0)
				return 30;
			else
				return 31;
		}else{
			if(n%2==0)
				return 31;
			else
				return 30;
		}
	}


	int days(int month, int date){
		int countDays=0;
		for(int i=month-1; i>=1; i--){
			countDays += days(i);
			System.out.println(countDays);
		}
		countDays += date;
		return countDays;
	}


	public static void main(String []args){
		Year A = new Year(1997);
		System.out.println("--------------------------\nDays of "+year+" year   : "+A.days());
		System.out.println("Days of given month : "+A.days(1));
		System.out.println("Days to given Date  : "+A.days(1,15)+"\n--------------------------");
	}
}