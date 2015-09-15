/**
 * 
 */
package com.soba.dataaccess.dao;

/**
 * @author 539471
 *
 */
public abstract class ACreateDataDao<result,inputParam> 
{
	@SuppressWarnings("unchecked")
	protected result returnResult = (result) new Boolean(false);
	
	protected abstract result create(inputParam param);
	
	protected abstract void validate(inputParam param);
	
	public result createData(inputParam param)
	{
		validate(param);
		returnResult = create(param);
		return returnResult;
	}
}
