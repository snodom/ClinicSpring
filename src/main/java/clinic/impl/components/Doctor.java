package clinic.impl.components;

import clinic.api.components.IDoctor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Doctor implements IDoctor {

    int id_doc; // primary key
    String name;
    String surname;
    int idSpec; // foreign key

    public String getName() {
        return name;
    }

    public int getIdSpec() {
        return idSpec;
    }

    public String getSurname() {
        return surname;
    }
}
