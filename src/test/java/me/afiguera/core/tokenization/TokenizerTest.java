package me.afiguera.core.tokenization;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TokenizerTest {

    @Test
    void getTokens() {
        final String query = "SELECT DISTINCT {p.pk} FROM {Product AS p}";
        final Tokenizer tokenizer = new Tokenizer(query);
        tokenizer.getTokens();
        assertEquals(tokenizer.getTokens().size(), 5);
    }
}