package com.maths.formula;

import java.util.Arrays;
import java.util.HashMap;

/**
 * @author sandeep
 *
 */
public class Statistics {

	/**
	 * The mean (or average) of a set of data values is the sum of all of the data values divided by the number of data values.  
	 * @param value
	 * @return
	 */
	public int average(int value[])
	{
		int size=value.length;
		int sum=0,average;
		for(int i=0;i<size;i++)
		{
			sum+=value[i];
		}	
		average=sum/size;
		return average;
	}
	
	public float average(float value[])
	{
		int size=value.length;
		float sum=0,average;
		for(int i=0;i<size;i++)
		{
			sum+=value[i];
		}
		
		average=sum/size;
		return average;
	}
	
	public double average(double value[])
	{
		int size=value.length;
		double sum=0,average;
		for(int i=0;i<size;i++)
		{
			sum+=value[i];
		}
		
		average=sum/size;
		return average;
	}
	
	public float mean(float value[])
	{
		return this.average(value);
	}
	
	public double mean(double value[])
	{
		return this.average(value);
	}
	
	public int mean(int value[])
	{
		return this.average(value);
	}
	
	/**
	 * The median of a set of data values is the middle value of the data set when it has been arranged in ascending order.
	 * That is, from the smallest value to the highest value. 
	 * @param value
	 */
	public int median(int value[])
	{
		int size=value.length;
		Arrays.sort(value);
		if(size%2!=0)
		{
			return value[size+1/2];
		}
		else
		{
			int temp=size/2;
			return value[temp]+value[temp+1];
		}
	}
	
	public float median(float value[])
	{
		int size=value.length;
		Arrays.sort(value);
		if(size%2!=0)
		{
			return value[size+1/2];
		}
		else
		{
			int temp=size/2;
			return value[temp]+value[temp+1];
		}
	}
	
	public double median(double value[])
	{
		int size=value.length;
		Arrays.sort(value);
		if(size%2!=0)
		{
			return value[size+1/2];
		}
		else
		{
			int temp=size/2;
			return value[temp]+value[temp+1];
		}
	}
	/**
	 * The mode of a set of data values is the value(s) that occurs most often.
	 * @param value
	 * @return
	 */
	public int mode(int value[])
	{
		HashMap<Integer, Integer> result=new HashMap<Integer, Integer>();
		int maxOccurValue=value[0],val=0;
		for(int i=0;i<value.length;i++)
		{
			if(result.get(value[i])!=null)
			{
				result.put(value[i],result.get(value[i])+1);
				if(val<result.get(value[i]))
				{
					val=result.get(value[i]);
					maxOccurValue=value[i];
				}
			}
			else
				result.put(value[i],result.get(value[i])+1);
		}
		
		return maxOccurValue;
	}
	
	public float mode(float value[])
	{
		HashMap<Float, Integer> result=new HashMap<Float, Integer>();
		float maxOccurValue=value[0];
		int val=0;
		for(int i=0;i<value.length;i++)
		{
			if(result.get(value[i])!=null)
			{
				result.put(value[i],result.get(value[i])+1);
				if(val<result.get(value[i]))
				{
					val=result.get(value[i]);
					maxOccurValue=value[i];
				}
			}
			else
				result.put(value[i],result.get(value[i])+1);
		}
		
		return maxOccurValue;
	}
	
	public double mode(double value[])
	{
		HashMap<Double, Integer> result=new HashMap<Double, Integer>();
		double maxOccurValue=value[0];
		int val=0;
		for(int i=0;i<value.length;i++)
		{
			if(result.get(value[i])!=null)
			{
				result.put(value[i],result.get(value[i])+1);
				if(val<result.get(value[i]))
				{
					val=result.get(value[i]);
					maxOccurValue=value[i];
				}
			}
			else
				result.put(value[i],result.get(value[i])+1);
		}
		
		return maxOccurValue;
	}
	/**
	 * The average of the squared differences from the Mean.
	 * @param value
	 * @return
	 */
	public int variance(int value[])
	{
		int variance;
		int mean=this.mean(value);
		int sum=0,size=value.length;
		for(int i=0;i<size;i++)
		{
			sum+=this.getSquaredValue(value[i]-mean);
		}
		variance=sum/size;
		return variance;
	}
	
	public float variance(float value[])
	{
		float variance;
		float mean=this.mean(value);
		float sum=0;
		int size=value.length;
		for(int i=0;i<size;i++)
		{
			sum+=this.getSquaredValue(value[i]-mean);
		}
		variance=sum/size;
		return variance;
	}
	
	public double variance(double value[])
	{
		double variance;
		double mean=this.mean(value);
		double sum=0;
		int size=value.length;
		for(int i=0;i<size;i++)
		{
			sum+=this.getSquaredValue(value[i]-mean);
		}
		variance=sum/size;
		return variance;
	}
	/**
	 * The Standard Deviation is a measure of how spread out numbers are.
	 * @param value
	 * @return
	 */
	public double standardDeviation(int value[])
	{
		int variance = this.variance(value);
		return Math.sqrt(variance);
	}
	
	public double standardDeviation(float value[])
	{
		float variance = this.variance(value);
		return Math.sqrt(variance);
	}
	
	public double standardDeviation(double value[])
	{
		double variance = this.variance(value);
		return Math.sqrt(variance);
	}

	/**
	 * @param i
	 * @return squared 
	 */
	private int getSquaredValue(int val) {
		return val*val;
	}
	
	private float getSquaredValue(float val) {
		return val*val;
	}
	
	private double getSquaredValue(double val) {
		return val*val;
	}
}
