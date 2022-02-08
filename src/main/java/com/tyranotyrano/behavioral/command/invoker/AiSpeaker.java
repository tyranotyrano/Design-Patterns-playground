package com.tyranotyrano.behavioral.command.invoker;

import com.tyranotyrano.behavioral.command.command.Command;

public class AiSpeaker {
    private Command command;

    public void setCommand(Command command){
        this.command = command;
    }

    public void talk(){
        command.execute();
    }
}
