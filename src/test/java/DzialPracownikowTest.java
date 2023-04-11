import org.example.korpo.DzialPracownikow;
import org.example.korpo.NotUniqueNameException;
import org.junit.jupiter.api.*;

public class DzialPracownikowTest{

    /*
    * Test sprawdza czy podczas próby utworzenia dwóch obiektów o tej samej nazwie program wyrzuci błąd NotUniqueNameException.
    */
    @Test
    public void duplicateDepNameTest(){
        DzialPracownikow.createDzial("IT");
        DzialPracownikow.createDzial("IT");
    }
}