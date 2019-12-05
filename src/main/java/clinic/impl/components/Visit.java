package clinic.impl.components;

import clinic.api.components.IVisit;
import org.springframework.stereotype.Component;

@Component
public class Visit implements IVisit {
   // int id_visit;
    String data;
    int idDoc;
    int idPat;

    public String getData() {
        return data;
    }

    public int getidDoc() {
        return idDoc;
    }


    public int getIdpat() {
        return idPat;
    }

}
