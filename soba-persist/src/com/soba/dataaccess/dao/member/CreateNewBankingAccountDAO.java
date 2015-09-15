/**
 * 
 */
package com.soba.dataaccess.dao.member;

import com.soba.dataaccess.dao.ACreateDataDao;
import com.soba.dataaccess.dao.model.Account;

/**
 * @author 539471
 *
 */
public class CreateNewBankingAccountDAO extends
		ACreateDataDao<Boolean, Account> {

	@Override
	protected Boolean create(Account param) 
	{
		// connect to the database by using a datasource; prepare a prepared statement, set the necessary parameters and then execute the query.
		// Return a true value if the query returned a non-zero integer indicating that the query executed successfully.
		return null;
	}

	@Override
	protected void validate(Account param) 
	{
		// Validate the passed Account object and throw exceptions if any of the validation criteria fails
	}

}
