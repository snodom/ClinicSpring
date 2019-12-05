package clinic.database.queryexecute;

import clinic.database.connection.DbConnector;
import org.springframework.stereotype.Component;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

@Component
public class QueryHandlingImpl implements QueryHandling {
    public void executeQuery(String query){
        try{
            Connection connection = DbConnector.connection();
            Statement statement = connection.createStatement();
            statement.execute(query);

        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}