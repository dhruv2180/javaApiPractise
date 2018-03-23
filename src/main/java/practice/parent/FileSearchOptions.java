package practice.parent;

import net.sourceforge.argparse4j.annotation.Arg;

import java.io.File;

public class FileSearchOptions {


    @Arg(dest = "file-name")
    public File fileName;

    @Arg(dest = "root-directory")
    public File rootDirectory;


}



