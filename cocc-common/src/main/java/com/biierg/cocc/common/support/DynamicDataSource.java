package com.biierg.cocc.common.support;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

import java.sql.SQLFeatureNotSupportedException;
import java.util.logging.Logger;

/**
 * Created by wzq on 2017/8/16.
 */
public class DynamicDataSource extends AbstractRoutingDataSource {

    @Override
    public Logger getParentLogger(){
        return null;
    }

    @Override
    protected Object determineCurrentLookupKey() {
        return DataSourceContextHolder.getDbType();
    }

}