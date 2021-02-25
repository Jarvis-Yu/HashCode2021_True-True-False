package dataClasses.in;

import java.util.ArrayList;
import java.util.List;

public class Intersection {

	public List<String> streets = new ArrayList<>();
	public List<Integer> durations = new ArrayList<>();
	public InStructure ins;

	public Intersection(List<String> streets, List<Integer> durations, InStructure ins) {
		this.streets = streets;
		this.durations = durations;
		this.ins = ins;
	}

	@Override
	public String toString() {
		return "Intersection{" +
				"streets=" + streets +
				", durations=" + durations +
				'}';
	}

	public int numOfScheduledStreets() {
		return streets.size();
	}

	public void simulate(int time) {
		var mod = time % round();
		int i = 0;
		while (true) {
			mod = mod - durations.get(i);
			if (mod < 0) {
				break;
			}
			i++;
		}
		ins.streetMap.get(streets.get(i)).nextCarLeave(time);
	}

	private int round() {
		return durations.stream().reduce(Integer::sum).get();
	}
}
