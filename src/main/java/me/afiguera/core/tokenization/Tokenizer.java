package me.afiguera.core.tokenization;

import me.afiguera.core.tokenization.model.TokenModel;
import me.afiguera.core.tokenization.model.TokenType;

import java.util.List;
import java.util.StringTokenizer;

public class Tokenizer {

    final String query;

    public Tokenizer(final String query) {
        this.query = query;
    }

    public List<TokenModel> getTokens() {
        final StringTokenizer tokenizer = new StringTokenizer(getQuery());
        final List<TokenModel> tokens = new java.util.ArrayList<>();
        while (tokenizer.hasMoreTokens()) {
            final TokenModel token = getToken(tokenizer.nextToken());
            tokens.add(token);
        }
        return tokens;
    }

    public TokenModel getToken(final String lexem){
        try {
            return new TokenModel(TokenType.valueOf(lexem), lexem);
        } catch (IllegalArgumentException e) {
            return new TokenModel(TokenType.IDENTIFIER, lexem);
        }
    }

    public String getQuery() {
        return this.query;
    }
}
