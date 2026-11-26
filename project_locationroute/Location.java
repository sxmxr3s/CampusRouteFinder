package project_locationroute;

public class Location {
	private String name;
	private int id = 0;
	private int x = 0;
	private int y = 0;
	
	/**
	 * @param name the name of a building on the campus map
	 * @param id the number that identifies a building on the campus map
	 * @param x the horizontal coordinate on the campus map
	 * @param y the vertical coordinate on the campus map
	 */
	public Location(String name, int id, int x, int y) {
		this.name = name;
		this.id = id;
		this.x = x;
		this.y = y;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @return the x
	 */
	public int getX() {
		return x;
	}

	/**
	 * @return the y
	 */
	public int getY() {
		return y;
	}
	
	
	
}
