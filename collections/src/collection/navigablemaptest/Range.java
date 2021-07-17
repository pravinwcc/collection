package collection.navigablemaptest;

import java.io.Serializable;

public class Range implements Serializable, Comparable<Range> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	long startRange;
	long endRange;

	public long getStartRange() {
		return startRange;
	}

	public void setStartRange(long startRange) {
		this.startRange = startRange;
	}

	public long getEndRange() {
		return endRange;
	}

	public void setEndRange(long endRange) {
		this.endRange = endRange;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (endRange ^ (endRange >>> 32));
		result = prime * result + (int) (startRange ^ (startRange >>> 32));
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
	public String toString() {
		return "Range [startRange=" + startRange + ", endRange=" + endRange
				+ "]";
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
