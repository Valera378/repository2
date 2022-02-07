package org.itstep.command;

public class EchoCommand implements Command {
    @Override
    public void execute(String... args) {
        System.out.print(String.join( "",args));
    }
}
