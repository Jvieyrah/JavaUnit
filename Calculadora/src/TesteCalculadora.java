import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class TesteCalculadora {

  @Test
  public void testSomar() {
    Calculadora cal = new Calculadora();
    assertEquals(34, cal.somar(32, 2))
  }

  @Test
  public void testeSubtrair() {
    Calculadora cal = new Calculadora();
    assertEquals(1, cal.subtrair(3, 2));
  }

}
