package clinic.impl.components;

import clinic.api.components.ISpecialization;
import org.springframework.stereotype.Component;

@Component
public class Specialization implements ISpecialization {
    String name;

    public String getName() {
        return name;
    }
}
