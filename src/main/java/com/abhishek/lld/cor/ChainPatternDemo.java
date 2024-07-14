package com.abhishek.lld.cor;

// Step 3: Configure the Chain of Responsibility

public class ChainPatternDemo {

	private static Logger getChainOfLoggers() {
		Logger errorLogger = new ErrorLogger(Logger.ERROR);
		Logger warningLogger = new WarningLogger(2);
		Logger debugLogger = new DebugLogger(Logger.DEBUG);
		Logger infoLogger = new InfoLogger(Logger.INFO);

		infoLogger.setNextLogger(debugLogger);
		debugLogger.setNextLogger(warningLogger);
		warningLogger.setNextLogger(errorLogger);

		return infoLogger;
	}

	private static Logger configureChain() {
		Logger errorLogger = new ErrorLogger(Logger.ERROR);
		Logger debugLogger = new DebugLogger(Logger.DEBUG);
		Logger infoLogger = new InfoLogger(Logger.INFO);

		infoLogger.setNextLogger(debugLogger);
		debugLogger.setNextLogger(errorLogger);

		return infoLogger;
	}

	public static void main(String[] args) {

		Logger loggerChain = getChainOfLoggers();
		loggerChain.logMessage(Logger.INFO, "This is an information.");
		loggerChain.logMessage(Logger.DEBUG, "This is a debug level information.");
		loggerChain.logMessage(2, "This is a warning level information.");
		loggerChain.logMessage(Logger.ERROR, "This is an error information.");

		Logger loggerChain2 = configureChain();
		loggerChain2.logMessage(Logger.INFO, "This is an information.");
		loggerChain2.logMessage(Logger.DEBUG, "This is a debug level information.");
		loggerChain2.logMessage(Logger.ERROR, "This is an error information.");
	}
}
