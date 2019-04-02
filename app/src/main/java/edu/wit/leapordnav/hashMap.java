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
	
	//Evans Way(Int floors, String rooms[#])
	static HashMap<String, String> evansWay = new HashMap<>();
		//floors(Int rooms[#], Int [Distance x in ft] )
		static HashMap<Integer, Integer> evans0 = new HashMap<>();
		static HashMap<Integer, Integer> evans1 = new HashMap<>();
		static HashMap<Integer, Integer> evans2 = new HashMap<>();
		static HashMap<Integer, Integer> evans3 = new HashMap<>();
		static HashMap<Integer, Integer> evans4 = new HashMap<>();
		static HashMap<Integer, Integer> evans5 = new HashMap<>();

	//Rubenstein Hall(Int floors, String rooms[#])
	static HashMap<String, String> rubensteinHall = new HashMap<>();
		//floors(Int rooms[#], Int [Distance x in ft] )
		static HashMap<Integer, Integer> rubens0 = new HashMap<>();
		static HashMap<Integer, Integer> rubens1 = new HashMap<>();
		static HashMap<Integer, Integer> rubens2 = new HashMap<>();
	
	//Kingman Hall(Int floors, String rooms[#])
	static HashMap<String, String> kingmanHall = new HashMap<>();
		//floors(Int rooms[#], Int [Distance x in ft] )
		static HashMap<Integer, Integer> kings1 = new HashMap<>();
		static HashMap<Integer, Integer> kings2 = new HashMap<>();
	
	//Dobbs Hall(Int floors, String rooms[#])
	static HashMap<String, String> dobbsHall = new HashMap<>();
		//floors(Int rooms[#], Int [Distance x in ft] )
		static HashMap<Integer, Integer> dobs0 = new HashMap<>();
		static HashMap<Integer, Integer> dobs1 = new HashMap<>();
		static HashMap<Integer, Integer> dobs2 = new HashMap<>();
		static HashMap<Integer, Integer> dobs3 = new HashMap<>();
	
	//Williston Hall Hall(Int floors, String rooms[#])
	static HashMap<String, String> willistonHall = new HashMap<>();
		//floors(Int rooms[#], Int [Distance x in ft] )
		static HashMap<Integer, Integer> willists0 = new HashMap<>();
		static HashMap<Integer, Integer> willists1 = new HashMap<>();
		static HashMap<Integer, Integer> willists2 = new HashMap<>();
		static HashMap<Integer, Integer> willists3 = new HashMap<>();
	
	//Watson Hall Hall(Int floors, String rooms[#])
	static HashMap<String, String> watsonHall = new HashMap<>();
		//floors(Int rooms[#], Int [Distance x in ft] )
		static HashMap<Integer, Integer> wats0 = new HashMap<>();
		static HashMap<Integer, Integer> wats1 = new HashMap<>();
		static HashMap<Integer, Integer> wats2 = new HashMap<>();
		static HashMap<Integer, Integer> wats3 = new HashMap<>();
	
	//Beatty Hall(Int floors, String rooms[#])
	static HashMap<String, String> beattyHall = new HashMap<>();
	//floors(Int rooms[#], Int [Distance x in ft] )
		static HashMap<Integer, Integer> beats0 = new HashMap<>();
		static HashMap<Integer, Integer> beats1 = new HashMap<>();
		static HashMap<Integer, Integer> beats2 = new HashMap<>();
		static HashMap<Integer, Integer> beatsM = new HashMap<>();
		static HashMap<Integer, Integer> beats3 = new HashMap<>();
		static HashMap<Integer, Integer> beats4 = new HashMap<>();
	
	//Willson Hall(Int floors, String rooms[#])
	static HashMap<String, String> willsonHall = new HashMap<>();
		//floors(Int rooms[#], Int [Distance x in ft] )
		static HashMap<Integer, Integer> wills1 = new HashMap<>();
		static HashMap<Integer, Integer> wills2 = new HashMap<>();	

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
				  + "Stair/Bathroom(W)[10], Classroom 214[11], Dobbs Entrance[12]");
		wents2.put(0, 0); wents2.put(1, 8); wents2.put(2, 19); wents2.put(3, 37); wents2.put(4, 37);
		wents2.put(5, 45); wents2.put(6, 45); wents2.put(7, 72); wents2.put(8, 81); wents2.put(9, 86);
		wents2.put(10, 110); wents2.put(11, 110); wents2.put(12, 123);
		
		//Wentworth Hall floor 3
		wentworthHall.put(3, "");
		wents3.put(0, 0);
		
		//***********************************************Evans Way**************************************************
		//Evans Way floor 0
		evansWay.put(0, "Tudsbury Entrance[0], Laundry[1], Suite 017[2], Stairs[3], Suite 011[4], "
			     + "Housing Office[5], Exit[6], Suite 007[7], Suite 002[8]");
		evans0.put(0, 0); evans0.put(1, 35); evans0.put(2, 38); evans0.put(3, 43); evans0.put(4, 59);
		evans0.put(5, 89); evans0.put(6, 133); evans0.put(7, 161); evans0.put(8, 171);
		
		//Evans Way floor 1
		evansWay.put(1, "Suite 108[0], Suite 117[1], Stairs[2], Suite 111[3], Suite 104[4], "
			     + "Elevator[5], Suite 107[6], Stairs[7], Suite 102[8]");
		evans1.put(0, 0); evans1.put(1, 5); evans1.put(2, 11); evans1.put(3, 27); evans1.put(4, 33);
		evans1.put(5, 94); evans1.put(6, 122); evans1.put(7, 125); evans1.put(8, 128);
		
		//Evans Way floor 2
		evansWay.put(2, "Suite 208[0], Suite 217[1], Stairs[2], Suite 211[3], Suite 204[4], "
			     + "Elevator[5], Suite 207[6], Stairs[7], Suite 202[8]");
		evans2.put(0, 0); evans2.put(1, 5); evans2.put(2, 11); evans2.put(3, 27); evans2.put(4, 33);
		evans2.put(5, 94); evans2.put(6, 122); evans2.put(7, 125); evans2.put(8, 128);
		
		//Evans Way floor 3
		evansWay.put(3, "Suite 308[0], Suite 317[1], Stairs[2], Suite 311[3], Suite 304[4], "
			     + "Elevator[5], Suite 307[6], Stairs[7], Suite 302[8]");
		evans3.put(0, 0); evans3.put(1, 5); evans3.put(2, 11); evans3.put(3, 27); evans3.put(4, 33);
		evans3.put(5, 94); evans3.put(6, 122); evans3.put(7, 125); evans3.put(8, 128);
		
		//Evans Way floor 4
		evansWay.put(4, "Suite 408[0], Suite 417[1], Stairs[2], Suite 411[3], Suite 404[4], "
			     + "Elevator[5], Suite 407[6], Stairs[7], Suite 402[8]");
		evans4.put(0, 0); evans4.put(1, 5); evans4.put(2, 11); evans4.put(3, 27); evans4.put(4, 33);
		evans4.put(5, 94); evans4.put(6, 122); evans4.put(7, 125); evans4.put(8, 128);
		
		//Evans Way floor 5
		evansWay.put(5, "Suite 508[0], Suite 517[1], Stairs[2], Suite 511[3], Suite 504[4], "
			     + "Elevator[5], Suite 507[6], Stairs[7], Suite 502[8]");
		evans5.put(0, 0); evans5.put(1, 5); evans5.put(2, 11); evans5.put(3, 27); evans5.put(4, 33);
		evans5.put(5, 94); evans5.put(6, 122); evans5.put(7, 125); evans5.put(8, 128);
		
		//***********************************************Rubenstein Hall**************************************************
		//Rubenstein Hall floor 0
		rubensteinHall.put(0, "Williston Entrance[0], Student Affacirs Office 003[1], Lab 005[2], Exit[3], Kingman Entrance/Bathroom(W)[4], "
				   + "Exit[5]");
		rubens0.put(0, 0); rubens0.put(1, 15); rubens0.put(2, 60); rubens0.put(3, 84); rubens0.put(4, 114);
		rubens0.put(5, 123);
		
		//Rubenstein Hall floor 1
		rubensteinHall.put(1, "Williston Entrance[0], Classroom 105[1], Classroom 104[2], Classroom 103[3], Lab 101[4], "
				   + "Stairs[5]");
		rubens1.put(0, 0); rubens1.put(1, 5); rubens1.put(2, 47); rubens1.put(3, 55); rubens1.put(4, 83);
		rubens1.put(5, 108);
		
		//Rubenstein Hall floor 2
		rubensteinHall.put(2, "Stairs[0], Office 202A[1], Classroom 201[2], Stairs[3], Office 203[4], "
				   + "Office 202[5], Office 207[6], Office 208[7], Office 209[8]");
		rubens2.put(0, 0); rubens2.put(1, 3); rubens2.put(2, 26); rubens2.put(3, 33); rubens2.put(4, 40);
		rubens2.put(5, 46); rubens2.put(6, 56); rubens2.put(7, 75); rubens2.put(8, 80);
		
		//***********************************************Kingman Hall**************************************************
		//Kingman Hall floor 1
		kingmanHall.put(1, "Willson Entrance[0], Lab 103[1], Lab 102[2], Lab 101[3], Stairs[4], "
				+ "Rubenstein Entrance[5]");
		kings1.put(0, 0); kings1.put(1, 76); kings1.put(2, 91); kings1.put(3, 127); kings1.put(4, 132);
		kings1.put(5, 152);
		
		//Kingman Hall floor 2
		kingmanHall.put(2, "Willson Entrance[0], Stairs[1], Office 211[2], Office 212[3], Office 210[4], "
				+ "Classroom 202[5], Office 209[6], Office 208[7], Office 207[8], Office 206[9], "
				+ "Classroom 201[10], Office 204[11], Office 205[12], Stairs[13]");
		kings2.put(0, 0); kings2.put(1, 75); kings2.put(2, 97); kings2.put(3, 97); kings2.put(4, 103);
		kings2.put(5, 103); kings2.put(6, 119); kings2.put(7, 129); kings2.put(8, 139); kings2.put(9, 149);
		kings2.put(10, 154); kings2.put(11, 154); kings2.put(12, 154); kings2.put(13, 166);
		
		//***********************************************Dobbs Hall**************************************************
		//Dobbs Hall floor 0
		dobbsHall.put(0, "Exit[0], Exit[1], Strength & Materials Lab 008[2], Classroom 002[3], Classroom 003[4], "
			      + "Materials Science Class 007[5], Classroom 005[6], Nanotechnology Lab 006[7], Stairs[8]");
		dobs0.put(0, 0); dobs0.put(1, 34); dobs0.put(2, 63); dobs0.put(3, 110); dobs0.put(4, 132);
		dobs0.put(5, 149); dobs0.put(6, 174); dobs0.put(7, 174); dobs0.put(8, 179);
		
		//Dobbs Hall floor 1
		dobbsHall.put(1, "");
		dobs1.put(0, 0);
		
		//Dobbs Hall floor 2
		dobbsHall.put(2, "");
		dobs2.put(0, 0);
		
		//Dobbs Hall floor 3
		dobbsHall.put(3, "Exit[0], Office 301[1], Stairs[2], Classroom 302[3], Lab 303[4], "
			      + "Classroom 306[5], Classroom 307[6], Classroom 308[7], Classroom 307A[8], Office 309[9], "
			      + "Stairs[10]");
		dobs3.put(0, 0); dobs3.put(1, 34); dobs3.put(2, 34); dobs3.put(3, 34); dobs3.put(4, 58);
		dobs3.put(5, 87); dobs3.put(6, 119); dobs3.put(7, 129); dobs3.put(8, 157); dobs3.put(9, 163);
		dobs3.put(10, 175);
		
		//***********************************************Williston Hall**************************************************
		//Williston Hall floor 0
		willistonHall.put(0, "");
		willists0.put(0, 0);
		
		//Williston Hall floor 1
		willistonHall.put(1, "");
		willists1.put(0, 0);
		
		//Williston Hall floor 2
		willistonHall.put(2, "");
		willists2.put(0, 0);
		
		//Williston Hall floor 3
		willistonHall.put(3, "");
		willists3.put(0, 0);
		
		//***********************************************Watson Hall**************************************************
		//Watson Hall floor 0
		watsonHall.put(0, "Dobbs Entrance[0], Bathroom(M)[1], Bathroom(W)[2], Exit[3], Bathroom[4], "
			       + "Classroom 002[5], Classroom 001[6], Classroom 004[7], Stairs[8], Classroom 006[9], "
			       + "Office 006KA[10], Office 006KB[11], Office 006R[12], Office 006P[13], Office 005[14] "
			       + "Office 003C[15], Office 003D[16], Office 003B[17], Office 003A[18]");
		wats0.put(0, 0); wats0.put(1, 79); wats0.put(2, 90); wats0.put(3, 102); wats0.put(4, 102);
		wats0.put(5, 115); wats0.put(6, 139); wats0.put(7, 179); wats0.put(8, 187); wats0.put(9, 194);
		wats0.put(10, 207); wats0.put(11, 207); wats0.put(12, 207); wats0.put(13, 207); wats0.put(14, 207);
		wats0.put(15, 207); wats0.put(16, 207); wats0.put(17, 207); wats0.put(18, 207);
		
		//Watson Hall floor 1
		watsonHall.put(1, "Dobbs Entrance[0], Bathroom(W)[1], Stairs[2], Watson Auditorium[3], Bathroom(M)[4]");
		wats1.put(0, 0); wats1.put(1, 67); wats1.put(2, 90); wats1.put(3, 115); wats1.put(4, 115);
		
		//Watson Hall floor 2
		watsonHall.put(2, "");
		wats2.put(0, 0);
		
		//Watson Hall floor 3
		watsonHall.put(3, "");
		wats3.put(0, 0);
		
		//***********************************************Beatty Hall**************************************************
		//Beatty Hall floor 0
		beattyHall.put(0, "");
		beats0.put(0, 0);
		
		//Beatty Hall floor 1
		beattyHall.put(1, "");
		beats1.put(0, 0);
		
		//Beatty Hall floor 2
		beattyHall.put(2, "");
		beats2.put(0, 0);
		
		//Beatty Hall floor M
		beattyHall.put(3, "");
		beatsM.put(0, 0);
		
		//Beatty Hall floor 3
		beattyHall.put(4, "");
		beats3.put(0, 0);
		
		//Beatty Hall floor 4
		beattyHall.put(5, "");
		beats4.put(0, 0);
		
		//***********************************************Willson Hall**************************************************
		//Willson Hall floor 1
		willsonHall.put(1, "");
		wills1.put(0, 0);
		
		//Willson Hall floor 2
		willsonHall.put(2, "");
		wills2.put(0, 0);
		
		
		
		System.out.println(tudbury.size()); //9.
		System.out.println(tudbury.get(1));
		
		System.out.println(tuds1.get(2));
	}
}
