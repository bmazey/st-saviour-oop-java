import java.util.ArrayList;

import org.junit.jupiter.api.Test;

public class GameTest {

    @Test
    public void sampleGameTest() {
        
        Borderlands b1 = new Borderlands("Borderlands", "Mordecai", 2009);
        assert b1 instanceof Borderlands;
        assert b1 instanceof ShooterGame;

        Borderlands b2 = new Borderlands("Borderlands 2", "Maya", 2012);
        assert b2 instanceof Borderlands;
        assert b2 instanceof ShooterGame;

        Borderlands bT = new Borderlands("Borderlands: The Presequel", "Timothy", 2014);
        assert bT instanceof Borderlands;
        assert bT instanceof ShooterGame;

        Borderlands b3 = new Borderlands("Borderlands 3", "Moze", 2019);
        assert b3 instanceof Borderlands;
        assert b3 instanceof ShooterGame;

        ArrayList<ShooterGame> shooters = new ArrayList<ShooterGame>();
        shooters.add(b1);
        shooters.add(b2);
        shooters.add(bT);
        shooters.add(b3);

    }
    
}

