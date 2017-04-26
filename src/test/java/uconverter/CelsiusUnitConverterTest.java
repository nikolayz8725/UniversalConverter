package uconverter;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)

public class CelsiusUnitConverterTest {
    CelsiusUnitConverter converter = new CelsiusUnitConverter();
    @Parameterized.Parameter()
    public double srcKelvin;
    @Parameterized.Parameter(1)
    public double trgCelsius;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {45.0, 113.0},
                {50.0, 122.0},
                {175.0, 347.0}
        });
    }

    @Test
    public void toSI() throws Exception {
        assertEquals(309.75, converter.toSI(36.6), 0.00001);
    }

    @Test
    public void fromSI() throws Exception {
        assertEquals(36.6, converter.fromSI(309.75), 0.00001);

    }

    @Test
    public void getName() throws Exception {
        assertEquals("Celsius", converter.getName());

    }

}