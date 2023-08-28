package com.rogers.dmt.udf.test;

import org.apache.hadoop.hive.ql.exec.UDF;

//import com.rogers.dmt.crypto.tokenization.CryptoException.MessageType;

public class EncryptSparkException extends UDF  {
	/**
	 * 
	 */
	
	public String evaluate(String strToEncrypt, String keyId, String isHardStop) throws CustomException {
		
		try {
			
			if (isHardStop.equalsIgnoreCase("0")) {
				return "hardstop is 0";
			}
			else if (isHardStop.equalsIgnoreCase("1")) {
				return "hardstop is 1";
			}
			else 
				throw new CustomException("Exception if-else: isHardStop value should be 1 or 0",null, true, false);
		}
		catch(CustomException  e)
		{
			String errorMessage = "Custom Exception: " + e.getMessage();
			System.err.println(errorMessage);
			throw e;
			//throw e;
		}
	}
	
}
