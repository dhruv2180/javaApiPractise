package practice.parent;

import java.io.File;
import java.io.FileFilter;
import java.util.Arrays;

public class SearchFileImpl implements SearchFile {

    File rootDirectory;
    File fileToSearch;
    DirectoryTree directoryTree;

    public SearchFileImpl(File rootDirectory, File fileToSearch) {
        this.rootDirectory = rootDirectory;
        this.fileToSearch = fileToSearch;
        directoryTree =new DirectoryTree(rootDirectory);/*,Arrays.asList(rootDirectory.listFiles(new FileFilter() {
            public boolean accept(File pathname) {
              return pathname.isDirectory();
            }
        })));
*/
    }

    public boolean doesExist() {
        if (directoryTree.currDirectory.isDirectory()){
            for (File f:directoryTree.currDirectory.listFiles()){
                if(f.getAbsolutePath()==fileToSearch.getAbsolutePath()){
                    return true;
                }
            }
        }
        return false;
    }

    public String getPath() {
        return null;
    }
}
