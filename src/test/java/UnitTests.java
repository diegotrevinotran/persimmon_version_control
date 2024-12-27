import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.persimmon.Repo;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UnitTests {
    /**
     * Given two files, return whether they are semantically equal (i.e. contains the same content) by comparing their hashcodes.
     *
     * @return true if the two files contain the same content, false otherwise.
     */
    private boolean compareFileEquality(Path file1, Path file2) {
        return file1.hashCode() == file2.hashCode();
    }

    @Test
    @DisplayName("init command in empty directory")
    public void testInit1() throws IOException {
        // Set up repo in empty directory
        String testDirPathString = "src" + File.separator + "test" + File.separator + "resources" + File.separator + "test1";
        Path initDir = Paths.get(testDirPathString);
        Repo initRepo = new Repo(testDirPathString);
        initRepo.init();
        // Verify all necessary Repo directories are present
        Path initSubDir = initDir.resolve(".persimmon");
        assert Files.exists(initSubDir);
        assert Files.exists(initSubDir.resolve("commits"));
        assert Files.exists(initSubDir.resolve("blobs"));
    }

}
