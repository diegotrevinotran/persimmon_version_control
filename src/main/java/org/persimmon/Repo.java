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
            Path commitsSubDir = initDir.resolve("commits");
            Path blobsSubDir = initDir.resolve("blobs");
            Files.createDirectory(initDir);
            Files.setAttribute(initDir, "dos:hidden", true);
            Files.createDirectory(commitsSubDir);
            Files.createDirectory(blobsSubDir);
        }
    }
}
