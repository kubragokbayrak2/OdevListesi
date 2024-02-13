package odev18;

import odev18.Muhasebe;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MaasHesaplamaTest {

    @Test(dataProvider = "veriSaglayici")
    public void testMaasHesapla(double maas, double primOrani, double beklenenSonuc) {
        Muhasebe muhasebe = new Muhasebe();
        double hesaplananSonuc = muhasebe.hesaplaMaas(maas, primOrani);
        Assert.assertEquals(hesaplananSonuc, beklenenSonuc, 0.001);
    }

    @DataProvider(name = "veriSaglayici")
    public Object[][] veriSaglayici() {
        return new Object[][] {
                {5000, 0.1, 5500},
                {6000, 0.15, 6900},
                {7000, 0.2, 8400},
        };
    }
}
