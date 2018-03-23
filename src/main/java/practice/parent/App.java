package practice.parent;

import net.sourceforge.argparse4j.inf.ArgumentParser;
import net.sourceforge.argparse4j.inf.ArgumentParserException;

public class App {
    public static void main(String[] args) {

        InputParameters inputParameters = new InputParameters();
        FileSearchOptions fileOpts = new FileSearchOptions();
        ArgumentParser argumentParsers = inputParameters.getParser();
        try {
            argumentParsers.parseArgs(args, fileOpts);
            SearchFile searchFile=new SearchFileImpl(fileOpts.rootDirectory,fileOpts.fileName);
            System.out.println(); searchFile.doesExist();
        } catch (ArgumentParserException e) {
            e.printStackTrace();
        }
    }
}
