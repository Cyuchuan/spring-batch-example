/**
 *
 */
package com.juxtapose.example.ch06.db;

import org.springframework.jdbc.core.PreparedStatementSetter;

import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * @author bruce.liu(mailto : jxta.liu @ gmail.com)
 * 2013-8-17上午06:59:58
 */
public class CreditBillPreparedStatementSetter implements
        PreparedStatementSetter {

    /* (non-Javadoc)
     * @see org.springframework.jdbc.core.PreparedStatementSetter#setValues(java.sql.PreparedStatement)
     */
    public void setValues(PreparedStatement ps) throws SQLException {
        ps.setString(1, "5");
    }

}
