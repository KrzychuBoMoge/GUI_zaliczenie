import org.example.korpo.DzialPracownikow;
import org.example.korpo.NotUniqueNameException;
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