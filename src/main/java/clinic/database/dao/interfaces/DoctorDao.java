package clinic.database.dao.interfaces;

import clinic.impl.components.Doctor;

public interface DoctorDao extends ObjectDao {
    void add(Doctor doctor);
    void get(Doctor doctor);
    void remove(Doctor doctor);
    void update(Doctor doctor);
}
