package org.persimmon;

import java.nio.file.Path;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Util {
    /**
     * Returns a hash string corresponding to the given file and it's contents.
     * @param file the file to hash
     * @return the hash string
     * @throws NoSuchAlgorithmException
     */
    public static String hashFile(Path file) throws NoSuchAlgorithmException {
        // TODO implement
        String hash = "";
        MessageDigest md = MessageDigest.getInstance("SHA-256");
        return hash;
    }
}
