package lotto.InputConsole;

import camp.nextstep.edu.missionutils.Console;

abstract class ConsoleView {
    protected String getInput(){
        printPromptBeforeInput();

        return readLine();
    }

    abstract protected void printPromptBeforeInput();

    protected String readLine(){
        return Console.readLine();
    }
}
