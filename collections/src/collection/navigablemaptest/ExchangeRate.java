package collection.navigablemaptest;

import java.io.Serializable;

public class ExchangeRate implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	long onnet;
	long offnet;
	double data;
	long sms;
	long offerIDForRates;
	public long getOnnet() {
		return onnet;
	}
	public void setOnnet(long onnet) {
		this.onnet = onnet;
	}
	public long getOffnet() {
		return offnet;
	}
	public void setOffnet(long offnet) {
		this.offnet = offnet;
	}
	public double getData() {
		return data;
	}
	public void setData(double data) {
		this.data = data;
	}
	public long getSms() {
		return sms;
	}
	public void setSms(long sms) {
		this.sms = sms;
	}
	public long getOfferIDForRates() {
		return offerIDForRates;
	}
	public void setOfferIDForRates(long offerIDForRates) {
		this.offerIDForRates = offerIDForRates;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(data);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result
				+ (int) (offerIDForRates ^ (offerIDForRates >>> 32));
		result = prime * result + (int) (offnet ^ (offnet >>> 32));
		result = prime * result + (int) (onnet ^ (onnet >>> 32));
		result = prime * result + (int) (sms ^ (sms >>> 32));
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
		ExchangeRate other = (ExchangeRate) obj;
		if (Double.doubleToLongBits(data) != Double
				.doubleToLongBits(other.data))
			return false;
		if (offerIDForRates != other.offerIDForRates)
			return false;
		if (offnet != other.offnet)
			return false;
		if (onnet != other.onnet)
			return false;
		if (sms != other.sms)
			return false;
		return true;
	}
	
	
	
}
