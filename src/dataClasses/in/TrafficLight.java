package dataClasses.in;

import java.util.ArrayList;
import java.util.List;

public class TrafficLight {

	public List<String> streets = new ArrayList<>();
	public List<Integer> durations = new ArrayList<>();

	public TrafficLight(List<String> streets, List<Integer> durations) {
		this.streets = streets;
		this.durations = durations;
	}
}
