package collection.list;


public class Range implements Comparable<Range>{

	int startRange;
	int endRange;

	
	public int getStartRange() {
		return startRange;
	}
	public void setStartRange(int startRange) {
		this.startRange = startRange;
	}
	public int getEndRange() {
		return endRange;
	}
	public void setEndRange(int endRange) {
		this.endRange = endRange;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + endRange;
		result = prime * result + startRange;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Range other = (Range) obj;
		if (endRange != other.endRange)
			return false;
		if (startRange != other.startRange)
			return false;
		return true;
	}
	@Override
	public int compareTo(Range o) {
		if (endRange == o.endRange)
			return 0;
		else if (endRange > o.endRange)
			return 1;
		else
			return -1;
	}

}
