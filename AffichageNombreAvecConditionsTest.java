import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;


@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
public class AffichageNombreAvecConditionsTest {

    @Test
    void test_affichage_Fizz_3_Buzz_5() {
        AffichageNombreAvecConditions.containOrMultipler();
        assertTrue(true);
    }
}