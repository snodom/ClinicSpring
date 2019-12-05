package clinic.database.queryexecute;

import java.sql.ResultSet;

public interface SelectHandling {
    ResultSet executeSelect(String selectquery);
}
