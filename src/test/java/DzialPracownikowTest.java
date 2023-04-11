import org.example.korpo.DzialPracownikow;
import org.junit.jupiter.api.*;

public class DzialPracownikowTest{

    @Test
    public void duplicateDepNameTest(){
        DzialPracownikow.createDzial("IT");
        DzialPracownikow.createDzial("IT");

    }
}