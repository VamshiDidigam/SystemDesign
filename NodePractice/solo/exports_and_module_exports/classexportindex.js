const Logger = require('./classexport');

const dbLogger = new Logger('DB');

const accessLogger = new Logger('Access');

dbLogger.info("hello");
accessLogger.verbose("hii")