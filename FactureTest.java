import static org.junit.Assert.*;

import org.junit.Test;

public class FactureTest {

	@Test
	public void testToString() {
		Facture fact = new Facture(0, 532.0, 1, 2, false);
		assertEquals("factID=0, montant=532.0, locationID=1, techID=2, estPaye=false", fact.toString());
	}

}
