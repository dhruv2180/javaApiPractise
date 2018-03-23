package practice.parent;

import net.sourceforge.argparse4j.ArgumentParsers;
import net.sourceforge.argparse4j.inf.ArgumentParser;

import java.io.File;


public class InputParameters {


    public ArgumentParser getParser() {

        ArgumentParser argumentParser = ArgumentParsers.newFor("Search for File").addHelp(true).build().description("Search for a file");
        argumentParser.addArgument("--file-name").type(File.class).dest("file-name").help("Name of the file to be searched");
        argumentParser.addArgument("--root-directory").type(File.class).dest("root-directory").help("Path to the directory in which file needs to be searched");

        return argumentParser;
    }

}
