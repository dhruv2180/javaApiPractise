package practice.parent;

import java.io.File;
import java.util.List;

public class DirectoryTree {

    File currDirectory;
    List<DirectoryTree> subDirectories;


    public DirectoryTree(File currDirectory) {
        this.currDirectory = currDirectory;
        this.subDirectories = null;
    }

    public File getCurrDirectory() {
        return currDirectory;
    }

    public void setCurrDirectory(File currDirectory) {
        this.currDirectory = currDirectory;
    }

    public List<DirectoryTree> getSubDirectories() {
        return subDirectories;
    }

    public void setSubDirectories(List<DirectoryTree> subDirectories) {
        this.subDirectories = subDirectories;
    }
}
