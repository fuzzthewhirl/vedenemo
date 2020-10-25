package com.vedenemo.core;

/**
 * List if of keywords that are supported by commands and .
 */
public enum Keywords{

    QUIT("quit", "Exits from command-line interface.");
 
    private String keyword;
    private String description;

    private Keywords(final String keyword, final String description) {
        this.keyword = keyword;
        this.description = description;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(final String keyword) {
        this.keyword = keyword;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(final String description) {
        this.description = description;
    }


}