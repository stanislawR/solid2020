package pl.zzpj2020.cleancode;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class ValueCounter {

	Map<Integer, Integer> map = new HashMap<Integer, Integer>();
	private int maxValue = Integer.MIN_VALUE;
	private int minvalue = Integer.MAX_VALUE;

	public ValueCounter(List<Integer> i1) {
		countValues(i1);
	}

	public void countValues(List<Integer> l1) {
		int i = 0;
		for (; i < l1.size(); i++) {
			checkValue(l1.get(i));
		}
	}

	public void checkValue(Integer i) {
		if (map.containsKey(i)) {
			Integer k = map.get(i);
			map.put(i, k +1);
		}
		else {
			map.put(i, 1);
		}

		if (i > maxValue) {
			maxValue = i;
		}

		if (i < minvalue) {
			minvalue = i;
		}
	}

	public int getValue(int i) {
		if (map.containsKey(i)) {
			return map.get(i);
		}
		else {
			return 0;
		}
	}

	public double calculateAverage() {
		double sum = 0;
		double values = 0;

		for (Entry<Integer, Integer> u : map.entrySet()) {
			values += u.getValue();
			sum += u.getKey() * u.getValue();
		}
		return sum/values;
	}

	public int getMaxValue() {
		return maxValue;
	}

	public int getMinvalue() {
		return minvalue;
	}
}