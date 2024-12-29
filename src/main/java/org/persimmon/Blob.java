package org.persimmon;
import java.nio.file.Path;
import java.security.MessageDigest;

/**
 * Representation of some version of some file, based on an SHA-1 hash.
 */
public class Blob {
    private Path file;
    private String hash;
    private String prefix;
    private String suffix;
}
