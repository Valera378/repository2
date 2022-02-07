package org.itstep.command;

public class NowCommand implements Command{
    @Override
    public void execute(String... args) {
        System.out.println(System.currentTimeMillis());

    }
}
