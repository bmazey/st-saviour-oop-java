import java.util.ArrayList;

import org.junit.jupiter.api.Test;

public class GameTest {

    @Test
    public void sampleGameTest() {
        
        Borderlands b2 = new Borderlands("Borderlands II", "Maya", 2012);
        assert b2 instanceof Borderlands;
        assert b2 instanceof ShooterGame;

        ArrayList<ShooterGame> shooters = new ArrayList<ShooterGame>();
        shooters.add(b2);

    }
    
}

