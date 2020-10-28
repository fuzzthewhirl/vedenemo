package com.vedenemo.cli;

import com.vedenemo.core.Command;
import com.vedenemo.cli.QuitCommand;
import com.vedenemo.cli.CliContext;
import java.util.Arrays;

/**
 * VedenemoApp
 */
public class VedenemoCli 
{
    public static void main( String[] args )
    {
        CliContext context = new CliContext(Arrays.asList(new QuitCommand()));
        System.out.println( "Available commands: "  + context.getCommands());
        System.out.println( "Executing quit command..." );
        Command quitCommand = new QuitCommand();
        quitCommand.execute();
    }
}
