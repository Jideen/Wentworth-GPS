package map;

import java.util.HashMap;

public class launcher {
	
	//Tudbury(Int floors, String rooms[#])
	static HashMap<Integer, String> tudbury = new HashMap<>();
		//floors(Int rooms[#], Int [Distance x in ft] )
		static HashMap<Integer, Integer> tuds0 = new HashMap<>();
		static HashMap<Integer, Integer> tuds1 = new HashMap<>();
		static HashMap<Integer, Integer> tuds2 = new HashMap<>();
		static HashMap<Integer, Integer> tuds3 = new HashMap<>();
		static HashMap<Integer, Integer> tuds4 = new HashMap<>();

	//Wentworth Hall(Int floors, String rooms[#])
	static HashMap<String, String> wentworthHall = new HashMap<>();
		//floors(Int rooms[#], Int [Distance x in ft] )
		static HashMap<Integer, Integer> wents0 = new HashMap<>();
		static HashMap<Integer, Integer> wents1 = new HashMap<>();
		static HashMap<Integer, Integer> wents2 = new HashMap<>();
		static HashMap<Integer, Integer> wents3 = new HashMap<>();
		static HashMap<Integer, Integer> wents4 = new HashMap<>();
	
	//Evans Way(Int floors, String rooms[#])
	static HashMap<String, String> evansWay = new HashMap<>();
	//floors(Int rooms[#], Int [Distance x in ft] )
		static HashMap<Integer, Integer> evans0 = new HashMap<>();
		static HashMap<Integer, Integer> evans1 = new HashMap<>();
		static HashMap<Integer, Integer> evans2 = new HashMap<>();
		static HashMap<Integer, Integer> evans3 = new HashMap<>();
		static HashMap<Integer, Integer> evans4 = new HashMap<>();
		static HashMap<Integer, Integer> evans5 = new HashMap<>();

	//Beatty(Int floors, String rooms[#])
	static HashMap<String, String> beatty = new HashMap<>();
	
	

	public static void main(String[] args) {
		//***********************************************Tudbury**************************************************
		//Tudbury floor 0
		tudbury.put(0, "Recreation Room[0], Stairs[1], Suite 002[2], Suite 003[3], Elevator[4], "
				+ "Suite 005[5], Stairs[6], Male Bathroom[7], Female Bathroom[8], Stair[9], "
				+ "Exercise room[10], Evansway Entrance[11]");
		tuds0.put(0, 0); tuds0.put(1, 26); tuds0.put(2, 53); tuds0.put(3, 60); tuds0.put(4, 71);
		tuds0.put(5, 129); tuds0.put(6, 174); tuds0.put(7, 196); tuds0.put(8, 232); tuds0.put(9, 249);
		tuds0.put(10, 258); tuds0.put(11, 278);
		
		//Tudbury floor 1
		tudbury.put(1, "Suite 101[0], Stairs[1], Suite 102[2], Suite 103[3], Elevator[4], "
				+ "Exit[5], Suite 104[6], Stairs[7], Suite 105[8], Stair[9], "
				+ "Elevator[10], RD Office[11], RA Office[12], Game Room[13], Auditorium[14], "
				+ "Stair to Evansway[15]");
		tuds1.put(0, 0); tuds1.put(1, 10); tuds1.put(2, 28); tuds1.put(3, 40); tuds1.put(4, 50);
		tuds1.put(5, 50); tuds1.put(6, 62); tuds1.put(7, 77); tuds1.put(8, 98); tuds1.put(9, 132);
		tuds1.put(10, 0136); tuds1.put(11, 141); tuds1.put(12, 156); tuds1.put(13, 156); tuds1.put(14, 156);
		tuds1.put(15,213);

		//Tudbury floor 2
		tudbury.put(2, "");
		tuds2.put(0, 0);
		
		//Tudbury floor 3
		tudbury.put(3, "");
		tuds3.put(0, 0);

		//Tudbury floor 4
		tudbury.put(4, "");
		tuds4.put(0, 0);
		//***********************************************Wentworth Hall**********************************************
		//Wentworth Hall floor 0
		wentworthHall.put(0, "Williston Entrance[0], Lab 004[1], Lab 003[2], Elevator[3], Classroom 010[4], "
				  + "Lab007[5], Dobb Entrance[6]");
		wents0.put(0, 0); wents0.put(1, 45); wents0.put(2, 66); wents0.put(3, 128); wents0.put(4, 144);
		wents0.put(5, 170); wents0.put(6, 219);
		
		//Wentworth Hall floor 1
		wentworthHall.put(1, "Williston Entrance[0], Stairs[1], Copy/Mail Room 118[2], Admissions Office 106[3], Exit[4], "
				  + "Stairs[5], Receptions Office 101[6], Dobbs Entrance[7]");
		wents1.put(0, 0); wents1.put(1, 36); wents1.put(2, 45); wents1.put(3, 62); wents1.put(4, 62);
		 wents1.put(5, 85); wents1.put(6, 99); wents1.put(7, 131);
		
		//Wentworth Hall floor 2
		wentworthHall.put(2, "Williston Entrance[0], Stair/Bathroom(M)[1], Classroom 206[2], Classroom 205[3], Classroom 208[4], "
				  + "Classroom 207[5], Classroom 210[6], Elevator[7], Classroom 209[8], Classroom 212[9], "
				  + "Stairs[10], Classroom 214[11], Dobbs Entrance[12]");
		wents2.put(0, 0); wents2.put(1, 8); wents2.put(2, 19); wents2.put(3, 37); wents2.put(4, 37);
		wents2.put(5, 45); wents2.put(6, 45); wents2.put(7, 72); wents2.put(8, 81); wents2.put(9, 86);
		wents2.put(10, 110); wents2.put(11, 110); wents2.put(12, 123);
		
		//Wentworth Hall floor 3
		wentworthHall.put(3, "");
		wents3.put(0, 0);
		
		//Wentworth Hall floor 4
		wentworthHall.put(4, "");
		wents4.put(0, 0);
		
		//***********************************************Evans Way**************************************************
		//Evans Way Hall floor 0
		evansWay.put(0, "Tudsbury Entrance[0], Laundry[1], Suite 017[2], Stairs[3], Suite 011[4], "
			     + "Housing Office[5], Exit[6], Suite 007[7], Suite 002[8]");
		evans0.put(0, 0); evans0.put(1, 35); evans0.put(2, 38); evans0.put(3, 43); evans0.put(4, 59);
		evans0.put(5, 89); evans0.put(6, 133); evans0.put(7, 161); evans0.put(8, 171);
		
		//Evans Way Hall floor 1
		evansWay.put(1, "Suite 108[0], Suite 117[1], Stairs[2], Suite 111[3], Suite 104[4], "
			     + "Elevator[5], Suite 107[6], Stairs[7], Suite 102[8]");
		evans1.put(0, 0); evans1.put(1, 5); evans1.put(2, 11); evans1.put(3, 27); evans1.put(4, 33);
		evans1.put(5, 94); evans1.put(6, 122); evans1.put(7, 125); evans1.put(8, 128);
		
		//Evans Way Hall floor 2
		evansWay.put(1, "Suite 208[0], Suite 217[1], Stairs[2], Suite 211[3], Suite 204[4], "
			     + "Elevator[5], Suite 207[6], Stairs[7], Suite 202[8]");
		evans2.put(0, 0); evans2.put(1, 5); evans2.put(2, 11); evans2.put(3, 27); evans2.put(4, 33);
		evans2.put(5, 94); evans2.put(6, 122); evans2.put(7, 125); evans2.put(8, 128);
		
		//Evans Way Hall floor 3
		evansWay.put(3, "");
		evans3.put(0, 0);
		
		//Evans Way Hall floor 4
		evansWay.put(4, "");
		evans4.put(0, 0);
		
		//Evans Way Hall floor 5
		evansWay.put(5, "");
		evans5.put(0, 0);
		
		
		
		
		System.out.println(tudbury.size()); //9.
		System.out.println(tudbury.get(1));
		
		System.out.println(tuds1.get(2));
	}
}
