package clinic.impl.components;

import clinic.api.components.IPatient;
import org.springframework.stereotype.Component;

@Component
public class Patient implements IPatient {

    //int id_pat; // primary key
    String name;
    String surname;


    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }
}
