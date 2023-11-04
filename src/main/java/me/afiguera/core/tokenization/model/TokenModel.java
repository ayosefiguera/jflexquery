package me.afiguera.core.tokenization.model;

public class TokenModel {

    private TokenType type;
    private String lexeme;

    public TokenModel(final TokenType type, final String lexeme) {
        setType(type);
        setLexeme(lexeme);
    }

    protected TokenType getType() {
        return type;
    }

    @Override
    public String toString() {
        return String.format("Token(type=%s, lexeme='%s')", type, lexeme);
    }

    public void setType(final TokenType type) {
        this.type = type;
    }

    protected String getLexeme() {
        return lexeme;
    }

    public void setLexeme(final String lexeme) {
        this.lexeme = lexeme;
    }
}
