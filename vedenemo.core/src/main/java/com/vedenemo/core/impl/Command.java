package com.vedenemo.core.impl;

/**
 * Model public access point
 */
public interface Command{

    public void execute();
  
    public void undo();
  
}