//********************************************************************
// Staff.java Author: Lewis/Loftus
//
// Represents the personnel staff of a particular business.
//********************************************************************
public class Staff
{
	StaffMember[] staffList;
	//-----------------------------------------------------------------
	// Sets up the list of staff members.
	//-----------------------------------------------------------------
	public static void main(String[] args)
	{
		StaffMember[] staffList= new StaffMember[8];
		
		staffList[0] = new Executive ("Sam", "123 Main Line","555-0469", "123-45-6789", 2423.07);
		
		staffList[1] = new Employee ("Carla", "456 Off Line","555-0101", "987-65-4321", 400.00);
		
		staffList[2] = new Employee ("Woody", "789 Off Rocker","555-0000", "010-20-3040", 900.00);
		
		staffList[3] = new Hourly ("Diane", "678 Fifth Ave.","555-0690", "958-47-3625", 10.55);
		
		staffList[4] = new Volunteer ("Norm", "987 Suds Blvd.","555-8374");
		
		staffList[5] = new Volunteer ("Cliff", "321 Duds Lane","555-7282");
		
		staffList[6] = new Commission ("Meir","246 Pubs Blvd.","555-7898", "231-37-7483", 6.25, 1000.00);
		
		staffList[7] = new Commission ("Rick","420 Wubs Lane.","777-0298", "365-45-1337", 9.75, 1000.00);
		
		((Executive)staffList[0]).awardBonus (500.00);
		
		((Commission)staffList[6]).addComRate (.20);
		((Commission)staffList[7]).addComRate (.15);
		
		((Hourly)staffList[6]).addHours (35);
		((Hourly)staffList[7]).addHours (40);
		((Hourly)staffList[3]).addHours (40);
		
		double amount;
		for (int count=0; count < staffList.length; count++)
		{
			System.out.println (staffList[count]);
			amount = staffList[count].pay(); // polymorphic
			if (amount == 0.0)
				System.out.println ("Thanks!");
			else
				System.out.println ("Paid: " + amount);
			System.out.println ("------------------------------------");
		}
	}
}