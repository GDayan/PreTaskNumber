package service.impl;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import service.Number;
import service.NumberService;

public class NumberServiceImpl implements NumberService {

    private final Logger logger = LogManager.getLogger(NumberServiceImpl.class);

    @Override
    public Number getSum(Number num1, Number num2) {
        if (num1.getNumber() == 0) {
            logger.warn("method getSum() : first arg equals to zero!");
        }
        if (num1.getNumber() < 0) {
            logger.error("method getSum() : first arg is less then zero");
        }
        logger.info("method getSum()");
        return new Number(num1.getNumber() + num2.getNumber());
    }
    public Number getDiff(Number num1, Number num2) {
        if (num1.getNumber() == 0) {
            logger.warn("method getSum() : first arg equals to zero!");
        }
        if (num1.getNumber() < 0) {
            logger.error("method getSum() : first arg is less then zero");
        }
        logger.info("method getSum()");
        return new Number(num1.getNumber() - num2.getNumber());
    }
    public Number getmultiply(Number num1, Number num2) {
        if (num1.getNumber() == 0) {
            logger.warn("method getSum() : first arg equals to zero!");
        }
        if (num1.getNumber() < 0) {
            logger.error("method getSum() : first arg is less then zero");
        }
        logger.info("method getSum()");
        return new Number(num1.getNumber() * num2.getNumber());
    }public Number getDivision(Number num1, Number num2) {
        if (num2.getNumber() == 0) {
            logger.warn("method getSum() : second are equals to zero!");
        }
        if (num1.getNumber() < 0) {
            logger.error("method getSum() : first arg is less then zero");
        }
        logger.info("method getSum()");
        return new Number(num1.getNumber() / num2.getNumber());
    }

}
