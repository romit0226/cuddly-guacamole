package LowLevelDesign.DesignPatterns.LLDChainResponsibilityDesignPattern;

import com.conceptandcoding.LowLevelDesign.DesignPatterns.LLDChainResponsibilityDesignPattern.LogProcessor;

public class ErrorLogProcessor extends LogProcessor {

    ErrorLogProcessor(LogProcessor nexLogProcessor){
        super(nexLogProcessor);
    }

    public void log(int logLevel,String message){

        if(logLevel == ERROR) {
            System.out.println("ERROR: " + message);
        } else{

            super.log(logLevel, message);
        }

    }
}
