package me.afiguera.core;

import org.junit.jupiter.api.Test;

import static me.afiguera.core.analyzer.QueryUtils.validateBracePairing;
import static org.junit.jupiter.api.Assertions.*;

class QueryUtilsTest {

    @Test
    public void testValidBracePairing() {

        // Test case with paired braces
        String query1 = "{}";
        assertTrue(validateBracePairing(query1));

        // Test case with nested paired braces
        String query2 = "{{}}";
        assertTrue(validateBracePairing(query2));

        // Test case with adjacent paired braces
        String query3 = "{}{}";
        assertTrue(validateBracePairing(query3));
    }

    @Test
    public void testInvalidBracePairing() {
        // Test case with unpaired braces
        String query4 = "{";
        assertFalse(validateBracePairing(query4));

        // Test case with mismatched closing brace
        String query6 = "{{}";
        assertFalse(validateBracePairing(query6));
    }
}