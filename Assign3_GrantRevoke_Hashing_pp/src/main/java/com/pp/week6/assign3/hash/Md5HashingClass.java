package com.pp.week6.assign3.hash;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Md5HashingClass {
	
	
	
	
	/**
	 * 
	 * @Pratik Patel
	 * @Tuesday, February 17, 2026
	 * 
	 * 
	 * Description - The plain-text password is input here and processed into a secure MD5 hash. This adds a layer of
	 * 				 confidentiality by ensuring that sensitive user credentials remain unreadable, even to those with
	 * 				 database access.
	 * 
	 * 
	 */
	
	
	
	
	public String getMd5(String input)
	{
		
		
		  try {

	          // Static getInstance method is called with hashing MD5
	          MessageDigest md = MessageDigest.getInstance("MD5");

	          // digest() method is called to calculate message digest
	          // of an input digest() return array of byte
	          byte[] messageDigest = md.digest(input.getBytes());

	          // Convert byte array into signum representation
	          BigInteger no = new BigInteger(1, messageDigest);

	          // Convert message digest into hex value
	          String hashtext = no.toString(16);
	          while (hashtext.length() < 32) {
	              hashtext = "0" + hashtext;
	          }
	          return hashtext;
	      }

	      // For specifying wrong message digest algorithms
	      catch (NoSuchAlgorithmException e) {
	          throw new RuntimeException(e);
	      }
		

		
	}
	
	
	
	
	

}

















