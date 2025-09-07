package LowLevelDesign.DesignPatterns.LLDChainResponsibilityDesignPattern;

import com.conceptandcoding.LowLevelDesign.DesignPatterns.LLDChainResponsibilityDesignPattern.DebugLogProcessor;
import com.conceptandcoding.LowLevelDesign.DesignPatterns.LLDChainResponsibilityDesignPattern.InfoLogProcessor;

public class Main {

    public static void main(String args[]) {

        LogProcessor logObject = new InfoLogProcessor(new DebugLogProcessor(new ErrorLogProcessor(null)));

        logObject.log(LogProcessor.ERROR, "exception happens");
        logObject.log(LogProcessor.DEBUG, "need to debug this ");
        logObject.log(LogProcessor.INFO, "just for info ");

    }
}
