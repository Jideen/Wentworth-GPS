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

	//EvansWay
	static HashMap<String, String> evansway = new HashMap<>();

	//Beatty
	static HashMap<String, String> beatty = new HashMap<>();
	

	public static void main(String[] args) {
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
		
		//
		
		
		
		
		
		
		
		
		
		
		
		
//		for copy and paste
//		tuds0.put(0, 0); tuds0.put(1, 9); tuds0.put(2, 28); tuds0.put(3, 0); tuds0.put(4, 0);
//		tuds0.put(5, 0); tuds0.put(6, 0); tuds0.put(7, 0); tuds0.put(8, 0); tuds0.put(9, 0);
//		tuds0.put(10, 0); tuds0.put(11, 0); tuds0.put(12, 0); tuds0.put(13, 0); tuds0.put(14, 0);
//		tuds0.put(15,0);
		
		
		
		System.out.println(tudbury.size()); //9.
		System.out.println(tudbury.get(1));
		
		System.out.println(tuds1.get(2));
	}
}
