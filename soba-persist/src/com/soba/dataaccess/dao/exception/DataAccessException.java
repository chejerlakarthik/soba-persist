/**
 * 
 */
package com.soba.dataaccess.dao.exception;

/**
 * @author 539471
 *
 */
public class DataAccessException extends Exception
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	//Implement this exception class
	
	public DataAccessException(String message)
	{
		super(message);
	}
}
