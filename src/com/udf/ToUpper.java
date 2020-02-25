package com.udf;

import org.apache.hadoop.hive.ql.exec.UDF;

public class ToUpper extends UDF{
	
	/**
	 * 用户自定义hive函数
	 * @param str
	 * @return
	 */
	public String evaluate(String str) {
		return str.toUpperCase();
	}
	
}
