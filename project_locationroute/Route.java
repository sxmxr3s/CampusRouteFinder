package project_locationroute;

import java.util.List;

public class Route {
	private List<Location> locationList;
	private double totalDistance = 0;
	
	/**
	 * @param locationList list of locations on campus
	 * @param numStops number of stops from starting position to destination not including starting position
	 * @param totalDistance the distance from starting postition to destination in feet
	 */
	public Route(List<Location> locationList, double totalDistance) {
		this.locationList = locationList;
		this.totalDistance = totalDistance;
	}

	/**
	 * @return the locationList
	 */
	public List<Location> getLocationList() {
		return locationList;
	}

	/**
	 * @return the numStops
	 */
	public int getNumStops() {
		return locationList.size() - 1;
	}

	/**
	 * @return the totalDistance
	 */
	public double getTotalDistance() {
		return totalDistance;
	}
	
	/**
	 * @return the first entry in locationList
	 */
	public Location getStart() {
		return locationList.get(0);
	}
	
	/**
	 * @return the last entry in locationList
	 */
	public Location getDestination() {
		return locationList.get(locationList.size() - 1);
	}
}
