package hu.iit.uni.miskolc.advanced.java.service;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class PrimeServiceImplTest {

    private PrimeServiceImpl primeService = new PrimeServiceImpl();

    @Test
    void isPrime() {
        // given
        final int NOT_PRIME_NUMBER = 4;
        final boolean expected = false;
        // when
        final boolean actual = primeService.isPrime(NOT_PRIME_NUMBER);
        // then
        assertThat(actual).isEqualTo(expected);
    }
}