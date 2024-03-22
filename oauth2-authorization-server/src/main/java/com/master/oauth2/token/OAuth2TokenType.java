package com.master.oauth2.token;

import org.springframework.security.oauth2.server.authorization.util.SpringAuthorizationServerVersion;
import org.springframework.util.Assert;

import java.io.Serial;
import java.io.Serializable;

public class OAuth2TokenType implements Serializable {

    @Serial
    private static final long serialVersionUID = SpringAuthorizationServerVersion.SERIAL_VERSION_UID;
    public static final OAuth2TokenType ACCESS_TOKEN = new OAuth2TokenType("access_token");
    public static final OAuth2TokenType REFRESH_TOKEN = new OAuth2TokenType("refresh_token");
    private final String value;

    /**
     * Constructs an {@code OAuth2TokenType} using the provided value.
     *
     * @param value the value of the token type
     */
    public OAuth2TokenType(String value) {
        Assert.hasText(value, "value cannot be empty");
        this.value = value;
    }

    /**
     * Returns the value of the token type.
     *
     * @return the value of the token type
     */
    public String getValue() {
        return this.value;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || this.getClass() != obj.getClass()) {
            return false;
        }
        OAuth2TokenType that = (OAuth2TokenType) obj;
        return getValue().equals(that.getValue());
    }

    @Override
    public int hashCode() {
        return getValue().hashCode();
    }
}
