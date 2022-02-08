package com.tyranotyrano.behavioral.command;

import com.tyranotyrano.behavioral.command.command.Command;
import com.tyranotyrano.behavioral.command.concrete.AirConditionerOffCommand;
import com.tyranotyrano.behavioral.command.concrete.AirConditionerOnCommand;
import com.tyranotyrano.behavioral.command.concrete.BoilerOffCommand;
import com.tyranotyrano.behavioral.command.concrete.BoilerOnCommand;
import com.tyranotyrano.behavioral.command.invoker.AiSpeaker;
import com.tyranotyrano.behavioral.command.receiver.AirConditioner;
import com.tyranotyrano.behavioral.command.receiver.Boiler;

public class CommandMain {
    public static void main(String[] args) {
        // 0. Receiver 생성
        AirConditioner airConditioner = new AirConditioner();
        Boiler boiler = new Boiler();

        // 1. Command 생성
        Command airConditionerOnCommand = new AirConditionerOnCommand(airConditioner);
        Command airConditionerOffCommand = new AirConditionerOffCommand(airConditioner);
        Command boilerOnCommand = new BoilerOnCommand(boiler);
        Command boilerOffCommand = new BoilerOffCommand(boiler);

        // 2. Invoker 생성
        AiSpeaker aiSpeaker = new AiSpeaker();

        // 3. 명령(Command) 실행
        aiSpeaker.setCommand(airConditionerOnCommand);
        aiSpeaker.talk();

        aiSpeaker.setCommand(airConditionerOffCommand);
        aiSpeaker.talk();

        System.out.println();

        aiSpeaker.setCommand(boilerOnCommand);
        aiSpeaker.talk();

        aiSpeaker.setCommand(boilerOffCommand);
        aiSpeaker.talk();
    }
}
