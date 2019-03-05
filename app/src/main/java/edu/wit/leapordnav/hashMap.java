package hashMap;

import java.util.HashMap;

public class launcher {
	
	static class Coords {
	    int x;
	    int y;

	    public boolean equals(Object o) {
	        Coords c = (Coords) o;
	        return c.x == x && c.y == y;
	    }

	    public Coords(int x, int y) {
	        this.x = x;
	        this.y = y;
	    }

	    public int hashCode() {
	        return new Integer(x + "0" + y);
	    }

	    public String toString()
	    {
	        return x + ", " + y;
	    }
	}
	
	//Tudbury(Int floors, String rooms[#])
	static HashMap<Integer, String> tudbury = new HashMap<>();
		//floors(Int rooms[#], Coordinate (x, y) )
		static HashMap<Integer, Coords> tuds0 = new HashMap<>();
		static HashMap<Integer, Coords> tuds1 = new HashMap<>();

	//EvansWay
	static HashMap<String, String> evansway = new HashMap<>();

	//Beatty
	static HashMap<String, String> beatty = new HashMap<>();
	

	public static void main(String[] args) {
		tudbury.put(1, "Suite 101[0], Stairs[1], "
				+ "Suite 102[2], Suite 103[3], "
				+ "Elevator[4], Exit[5], "
				+ "Suite 104[6], Stairs[7], "
				+ "Suite 105[8], ");
		tudbury.put(0, "ayy");
		
		tuds0.put(4, new Coords(6, 9));
		
		System.out.println(tudbury.size()); //9.
		System.out.println(tudbury.get(1));
		
		System.out.println(tuds0.get(4));
	}
}
