package clinic.api.components;

public interface IDoctor extends IComponent {

    String getSurname();
    String getName();
    int getIdSpec(); // foreign key


}
