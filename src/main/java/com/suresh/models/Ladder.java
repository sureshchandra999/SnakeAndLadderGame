package com.suresh.models;

import java.util.logging.Logger;

public class Ladder extends BoardEntity{
    //create a logger object
    Logger logger = Logger.getLogger(Ladder.class.getName());

    public Ladder(int start, int end) {
        //call to super class constructor
        super(start, end);
        //add loggers here
        logger.info("Ladder created with start: " + start + " and end: " + end);


    }
}
