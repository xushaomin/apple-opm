package com.appleframework.opm.common.util;

import java.text.NumberFormat;

public class StringUtils {

	public static String zeroAfterFill(String message, int size) {
		int length = message.length();
		if(length >= size) {
			return message;
		}
		else {
			String zeroStr = "";
			int differLength = size - length;
			for (int i = 1; i <= differLength; i++) {
				zeroStr += "0";
			}
			return message + zeroStr;
		}
	}
	
	public static String zeroBeforeFill(String message, int size) {
		int length = message.length();
		if(length >= size) {
			return message;
		}
		else {
			String zeroStr = "";
			int differLength = size - length;
			for (int i = 1; i <= differLength; i++) {
				zeroStr += "0";
			}
			return zeroStr + message;
		}
	}
	
	public static String mergeArray(String[] beginStr, String separate){
		int size = beginStr==null?0:beginStr.length;
		
		StringBuffer endStr = new StringBuffer();
		for (int i = 0; i < size; i++) {
			if(i!=0) endStr.append(separate);
			endStr.append(beginStr[i]);
		}
		
		return endStr.toString();
	}
	
	/**
	 * 求两个数的百分比
	 * @param num1
	 * @param num2
	 * @return
	 */
	public static int percent(int num1, int num2) {
		// 创建一个数值格式化对象   
		NumberFormat numberFormat = NumberFormat.getInstance();  
		// 设置精确到小数点后2位   
		numberFormat.setMaximumFractionDigits(2);  
		String result = numberFormat.format((float) num1 / (float) num2 * 100);  
		
		float floatVal = Float.parseFloat(result);
		
		return (int)floatVal;
	}
	
	public static void main(String[] args) {
		String[] ssStrings = new String[]{"1","l","4","5","5","5","6","67"};
		System.out.println(mergeArray(ssStrings, ","));
		;System.out.println(ssStrings.toString());
	}
	
}
