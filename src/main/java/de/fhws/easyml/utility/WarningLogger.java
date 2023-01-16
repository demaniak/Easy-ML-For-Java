package de.fhws.easyml.utility;

import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class WarningLogger
{
	public static Logger createWarningLogger(String className) {
		Logger logger = Logger.getLogger(className);
		logger.setLevel(Level.WARNING);
		return logger;
	}

	public static Logger createWarningLogger(Class<?> clazz){
		return createWarningLogger( clazz.getName() );
	}

	public static Logger createWarningLogger(Object obj){
		return createWarningLogger( obj.getClass() );
	}

}
