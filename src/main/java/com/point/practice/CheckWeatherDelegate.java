package com.point.practice;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

import java.util.Random;

public class CheckWeatherDelegate implements JavaDelegate {

    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {

        Random rand = new Random();

        delegateExecution.setVariable("name", "Brandon");
        delegateExecution.setVariable("weatherOk", rand.nextBoolean());

    }
}
