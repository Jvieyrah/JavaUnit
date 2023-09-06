package com.betrybe.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.betrybe.ContaBancaria;

class ContaBancariaTeste {

  @Test
  void testeDepositar() {
    ContaBancaria conta = new ContaBancaria();
    assertEquals(500.0, conta.depositar(500.0));
  }

}
