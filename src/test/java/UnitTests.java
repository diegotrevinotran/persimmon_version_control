import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.persimmon.Repo;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UnitTests {
    public static String test1DirPathString = "src" + File.separator + "test" + File.separator + "resources" + File.separator + "test1";
    public static String test2DirPathString = "src" + File.separator + "test" + File.separator + "resources" + File.separator + "test2";
    /**
     * Given two files, return whether they are semantically equal (i.e. contains the same content) by comparing their hashcodes.
     *
     * @return true if the two files contain the same content, false otherwise.
     */
    private boolean compareFileEquality(Path file1, Path file2) {
        return file1.hashCode() == file2.hashCode();
    }

    /**
     * For each test, remove all subdirectories and files within the test folder.
     */
    @BeforeAll
    public static void resetAllTestDirs() {
    }

    @Test
    @DisplayName("init command in empty directory")
    public void testInit1() throws IOException {
        // Set up repo in empty directory

        Path initDir = Paths.get(test1DirPathString);
        Repo initRepo = new Repo(test1DirPathString);
        initRepo.init();
        // Verify all necessary Repo directories are present
        Path initSubDir = initDir.resolve(".persimmon");
        assert Files.exists(initSubDir);
        assert Files.exists(initSubDir.resolve("snapshots"));
        assert Files.exists(initSubDir.resolve("blobs"));
    }

    @Test
    @DisplayName("init command in directory with content")
    public void testInit2() throws IOException {
        // Set up repo in empty directory

        Path initDir = Paths.get(test2DirPathString);
        Repo initRepo = new Repo(test2DirPathString);
        initRepo.init();
        // Verify all necessary Repo directories are present
        Path initSubDir = initDir.resolve(".persimmon");
        assert Files.exists(initSubDir);
        assert Files.exists(initSubDir.resolve("snapshots"));
        assert Files.exists(initSubDir.resolve("blobs"));
    }

    // TODO add unit tests for add command

}
