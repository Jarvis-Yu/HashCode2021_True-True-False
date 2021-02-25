package dataClasses.in;

import java.util.ArrayList;
import java.util.List;

public class Intersection {

	// 如果不对 intersection 不进行修改，那么就是两个空 list

	public List<String> streets = new ArrayList<>();
	public List<Integer> durations = new ArrayList<>();

	public Intersection(List<String> streets, List<Integer> durations) {
		this.streets = streets;
		this.durations = durations;
	}
}
