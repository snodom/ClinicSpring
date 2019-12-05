package clinic.database.dao.interfaces;

import clinic.database.dao.interfaces.ObjectDao;
import clinic.impl.components.Specialization;

public interface SpecializationDao extends ObjectDao {
    void add(Specialization specialization);
    void get(Specialization specialization);
    void remove(Specialization specialization);
    void update(Specialization specialization);
}
