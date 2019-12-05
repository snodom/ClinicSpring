package clinic.database.dao.interfaces;

import clinic.database.dao.interfaces.ObjectDao;
import clinic.impl.components.Patient;

public interface PatientDao extends ObjectDao {
    void add(Patient patient);
    void get(Patient patient);
    void remove(Patient patient);
    void update(Patient patient);
}
