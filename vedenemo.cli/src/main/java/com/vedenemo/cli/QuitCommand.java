package com.vedenemo.cli;
import com.vedenemo.core.Keywords;
import com.vedenemo.cli.CliCommand;
/**
 * Command-line interface's exit command.
 */
public class QuitCommand extends CliCommand {

    public QuitCommand(){
        super(Keywords.QUIT);
    }

    @Override
    public void execute() {
        System.exit(0);
    }

}