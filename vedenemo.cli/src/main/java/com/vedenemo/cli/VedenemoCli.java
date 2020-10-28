package com.vedenemo.cli;

import com.vedenemo.core.Command;
import com.vedenemo.cli.QuitCommand;
/**
 * VedenemoApp
 */
public class VedenemoCli 
{
    public static void main( String[] args )
    {
        System.out.println( "Executing quit command..." );
        Command quitCommand = new QuitCommand();
        quitCommand.execute();
    }
}
