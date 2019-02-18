import org.junit.Assert;
import org.junit.Test;

public class ExamenTest {

	@Test
	public void testConcatenar() {
		Assert.assertEquals("HoLaMunDo", Examen.Concatenar("HoLa","MunDo"));
	}

	@Test
	public void testMayusculas() {
		Assert.assertEquals("HOLA", Examen.Mayusculas("HoLa"));
	}

	@Test
	public void testLongitud() {
		Assert.assertEquals(4, Examen.Longitud("HoLa"));
	}

	@Test
	public void testComparacion() {
		Assert.assertEquals(0, Examen.comparacion(3,4));
	}

	@Test
	public void testCuadrado() {
		Assert.assertEquals(25, Examen.cuadrado(5));
	}

	@Test
	public void testMayor() {
		Assert.assertEquals(true, Examen.mayor(11));
	}

}
