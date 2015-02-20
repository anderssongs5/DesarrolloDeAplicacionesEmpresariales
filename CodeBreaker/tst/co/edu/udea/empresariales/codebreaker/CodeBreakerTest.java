package co.edu.udea.empresariales.codebreaker;

import static org.junit.Assert.*;
import org.junit.Test;

public class CodeBreakerTest {

	CodeBreaker codeBreaker = new CodeBreaker("3221");

	@Test()
	public void retornaVacioTest() {

		assertEquals(codeBreaker.guessNumber("7895"), "");
	}

	@Test()
	public void retornaTodosXTest() {
		assertEquals(codeBreaker.guessNumber("3221"), "XXXX");
	}

	@Test()
	public void retornaDosPosicionesIgualesTest() {
		assertEquals(codeBreaker.guessNumber("4521"), "XX");
	}

	@Test()
	public void retornaUnaPosicionYDosAparicionesTest() {
		assertEquals(codeBreaker.guessNumber("1242"), "X--");
	}

	@Test()
	public void retornaDosExistenciasTest() {
		assertEquals(codeBreaker.guessNumber("1442"), "--");
	}

	@Test()
	public void retornaNumerosInvalidosTest() {
		assertEquals(codeBreaker.guessNumber("14d2"), "?");
	}

	@Test()
	public void retornaSizeInvalidoTest() {
		assertEquals(codeBreaker.guessNumber("142"), "?");
	}

	@Test()
	public void retornaUnaPosicionYTresExistenciasTest() {
		assertEquals(codeBreaker.guessNumber("1322"), "X---");
	}

	@Test()
	public void retornaDosPosicionesYDosExistenciasTest() {
		assertEquals(codeBreaker.guessNumber("1223"), "XX--");
	}

	@Test()
	public void retornaTodasExistenciasTest() {
		assertEquals(codeBreaker.guessNumber("2132"), "----");
	}
}