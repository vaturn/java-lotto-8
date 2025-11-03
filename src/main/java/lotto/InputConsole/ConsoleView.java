package lotto.InputConsole;

import camp.nextstep.edu.missionutils.Console;

public abstract class ConsoleView {
    public String getInput(){
        printPromptBeforeInput();

        return readLine();
    }

    abstract protected void printPromptBeforeInput();

    protected String readLine(){
        return Console.readLine();
    }
}
