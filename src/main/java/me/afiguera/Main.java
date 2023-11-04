package me.afiguera;

import me.afiguera.core.tokenization.Tokenizer;

public class Main {
    public static void main(String[] args) {
        final String query = "select { p.pk } Where { Product as p }";
        final Tokenizer tokenizer = new Tokenizer(query);
    }
}