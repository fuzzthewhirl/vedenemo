package com.vedenemo.cli;

import com.vedenemo.core.Command;
import com.vedenemo.cli.Quit;
/**
 * VedenemoApp
 */
public class VedenemoCli 
{
    public static void main( String[] args )
    {
        System.out.println( "Executing quit command..." );
        Command quitCommand = new Quit();
        quitCommand.execute();
    }
}
