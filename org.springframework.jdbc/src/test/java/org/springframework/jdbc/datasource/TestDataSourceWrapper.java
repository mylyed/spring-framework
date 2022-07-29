package org.springframework.jdbc.datasource;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.SQLFeatureNotSupportedException;
import java.util.logging.Logger;
import javax.sql.DataSource;

public class TestDataSourceWrapper extends AbstractDataSource {

    private DataSource target;

    public void setTarget(DataSource target) {
        this.target = target;
    }

    public Connection getConnection() throws SQLException {
        return target.getConnection();
    }

    public Connection getConnection(String username, String password) throws SQLException {
        return target.getConnection(username, password);
    }

    @Override
    public Logger getParentLogger() throws SQLFeatureNotSupportedException {
        return target.getParentLogger();
    }
}
