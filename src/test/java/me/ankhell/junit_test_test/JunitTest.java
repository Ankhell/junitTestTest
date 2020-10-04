package me.ankhell.junit_test_test;

import me.ankhell.utils.Logger;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

@Execution(ExecutionMode.CONCURRENT)
class JunitTest {

    Logger logger = Logger.getLogger();

    static Object[][] provider() {
        return new Object[][]{
                new Object[]{1},
                new Object[]{2},
                new Object[]{3},
                new Object[]{4},
                new Object[]{5},
                new Object[]{6},
        };
    }

    @ParameterizedTest
    @MethodSource("provider")
    public void test1(int caseId) throws InterruptedException {
        logger.logStart(caseId);
        Thread.sleep(10000);
        Assertions.assertTrue(true);
        logger.logEnd(caseId);
    }

    @ParameterizedTest
    @MethodSource("provider")
    public void test2(int caseId) throws InterruptedException {
        logger.logStart(caseId);
        Thread.sleep(20000);
        Assertions.assertTrue(true);
        logger.logEnd(caseId);
    }

    @ParameterizedTest
    @MethodSource("provider")
    public void test3(int caseId) throws InterruptedException {
        logger.logStart(caseId);
        Thread.sleep(25000);
        Assertions.assertTrue(true);
        logger.logEnd(caseId);
    }

    @ParameterizedTest
    @MethodSource("provider")
    public void test4(int caseId) throws InterruptedException {
        logger.logStart(caseId);
        Thread.sleep(30000);
        Assertions.assertTrue(true);
        logger.logEnd(caseId);
    }

    @ParameterizedTest
    @MethodSource("provider")
    public void test5(int caseId) throws InterruptedException {
        logger.logStart(caseId);
        Thread.sleep(15000);
        Assertions.assertTrue(true);
        logger.logEnd(caseId);
    }

    @ParameterizedTest
    @MethodSource("provider")
    public void test6(int caseId) throws InterruptedException {
        logger.logStart(caseId);
        Thread.sleep(10000);
        Assertions.assertTrue(true);
        logger.logEnd(caseId);
    }

    @ParameterizedTest
    @MethodSource("provider")
    public void test7(int caseId) throws InterruptedException {
        logger.logStart(caseId);
        Thread.sleep(20000);
        Assertions.assertTrue(true);
        logger.logEnd(caseId);
    }
}