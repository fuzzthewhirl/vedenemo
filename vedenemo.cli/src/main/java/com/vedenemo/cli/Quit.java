package com.vedenemo.cli;

import com.vedenemo.core.Command;

/**
 * Command-line interface exits command.
 */
public class Quit implements Command {

    @Override
    public void execute() {
        System.exit(0);
    }

}