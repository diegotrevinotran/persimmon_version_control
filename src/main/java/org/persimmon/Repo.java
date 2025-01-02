package org.persimmon;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Internal representation of a repository. Each repository is how changes in a given directory are tracked and stored.
 */
public class Repo {
    /**
     * The directory being tracked by this Repo
     */
    private final Path workingDir;
    private String workingDirPath;

    public Repo(String workingDirectoryPath) {
        this.workingDir = Paths.get(workingDirectoryPath);
    }
    public Repo(Path workingDirectoryPath) {
        this.workingDir = workingDirectoryPath;
    }

    /**
     * If there is no version-control system present in the working directory, initialize the system, by creating the hidden directory and all necessary subdirectories.
     *
     * @throws IOException if it is not possible to create the necessary directories for this Repo.
     */
    public void init() throws IOException {
        Path initDir = workingDir.resolve(".persimmon");
        if (Files.exists(initDir)) {
            System.out.println("A version-control system already exists in the current directory.");
        }
        /* Actually do stuff here */
        else {
            // Create hidden directory and necessary subdirectories
            Path snapshotsSubDir = initDir.resolve("snapshots");
            Path blobsSubDir = initDir.resolve("blobs");
            Files.createDirectory(initDir);
            Files.setAttribute(initDir, "dos:hidden", true);
            Files.createDirectory(snapshotsSubDir);
            Files.createDirectory(blobsSubDir);
        }
    }

    /**
     * Adds the file with the given name in the working directory to the filepath
     * @param fileName
     */
    public void add(String fileName) {
        // If the file is not in the working directory, throw an error
        // TODO implement
        // If the file is not in staging area, call addToStagingArea
        // TODO implement
        // If the file is in staging area, overwrite the current version
        // TODO implement
    }
    /**
     * Adds the specified file to the staging area.
     * @param file file to add to the staging area.
     * @throws IOException
     */
    private void addToStagingArea(Path file) throws IOException {
        // TODO implement
    }


}
