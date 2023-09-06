package com.calc;

public class Calc {
  public int somar(int x, int y) {
    return x + y;
  }

  public int subtrair(int x, int y) {
    return x - y;
  }

  // divide dois inteiros
  public int dividir(int x, int y) {

    if (verificarDividendo(y)) {
      return x / y;
    } else {
      return x / y;
    }

  }

  // verifica se o dividendo é diferente de zero
  public boolean verificarDividendo(int y) {
    if (y == 0) {
      return false;
    } else {
      return true;
    }
  }

}
