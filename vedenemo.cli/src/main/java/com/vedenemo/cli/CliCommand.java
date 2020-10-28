package com.vedenemo.cli;

import com.vedenemo.core.Command;
import com.vedenemo.cli.Keywords;

/**
 * Command-line interface abstract base class.
 */
public abstract class CliCommand implements Command {

    private Keywords keyword;

    public CliCommand(Keywords keyword){
         this.keyword = keyword;
    }

    public Keywords getKeyword() {
        return keyword;
    }

    public void setKeyword(Keywords keyword) {
        this.keyword = keyword;
    }

    public String toString(){
        return keyword.getKeyword() + ": " + keyword.getDescription();
    }

}