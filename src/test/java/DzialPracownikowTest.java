import org.example.architektura.DzialPracownikow;
import org.example.architektura.NotUniqueNameException;
import org.junit.jupiter.api.*;

public class DzialPracownikowTest{

    @Test()
    public void duplicateDepNameTest(){
        Assertions.assertThrows(NotUniqueNameException.class, () -> {
            DzialPracownikow.createDzial("IT");
            DzialPracownikow.createDzial("it");
        });
    }
}