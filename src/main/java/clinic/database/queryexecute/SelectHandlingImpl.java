package clinic.database.queryexecute;

import clinic.database.connection.DbConnector;
import org.springframework.stereotype.Component;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

@Component
public class SelectHandlingImpl implements SelectHandling {
    public ResultSet executeSelect(String selectquery){
        try{
            Connection connection = DbConnector.connection();
            Statement statement = connection.createStatement();
            return statement.executeQuery(selectquery);

        }catch (SQLException e){
            throw new RuntimeException(e.getMessage());
        }
    }
}
