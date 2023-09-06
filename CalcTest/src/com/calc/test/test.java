package com.calc.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.calc.Calc;

@DisplayName("Eu sou a classe de teste da calculadora")
class test {
  @Test
  @DisplayName("testando o método somar...")
  public void testeSomar() {
    Calc cal = new Calc();
    assertEquals(34, cal.somar(32, 2));
  }

  @Test
  @DisplayName("testando o método subtrair...")
  public void testeSubtrair() {
    Calc cal = new Calc();
    assertEquals(1, cal.subtrair(3, 2));
  }

  @Test
  @DisplayName("testando o método dividir...")
  public void testeDividir() {
    Calc cal = new Calc();
    assertEquals(3, cal.dividir(6, 2));
  }

  @Test
  @DisplayName("testando o método verificar dividendo...")
  public void testeVerificarDividendos() {
    Calc cal = new Calc();
    assertTrue(cal.verificarDividendo(5));
  }

  @Test
  @DisplayName("testando a exceção do método dividir...")
  public void testeDividirExcecao() {
    Calc cal = new Calc();
    assertThrows(ArithmeticException.class, () -> {
      cal.dividir(3, 0);
    });

  }
}
