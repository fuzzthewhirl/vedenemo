package com.vedenemo.cli;
import com.vedenemo.core.Command;
import java.util.List;

/**
 * Command-line interface's usage/execution context.
 */
public class CliContext {

    private final List<Command> commands;

    public CliContext(List<Command> commands){
        this.commands = commands;
    }

    public List<Command> getCommands(){
        return commands;
    }

}