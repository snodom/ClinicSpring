package clinic.database.dao.interfaces;

import clinic.database.dao.interfaces.ObjectDao;
import clinic.impl.components.Visit;

public interface VisitDao extends ObjectDao {
    void add(Visit visit);
    void get(Visit visit);
    void remove(Visit visit);
    void update(Visit visit);
}
