package org.persimmon;

import java.io.Serializable;
import java.nio.file.Path;
import java.time.Instant;

/**
 * Representation of a "snapshot" of a repository.
 */
public class Commit implements Serializable {
    /**
     * The timestamp at which this Commit was created.
     */
    private Instant timestamp;
    /**
     * The message contained by this Commit.
     */
    private String message;

    /**
     * Name of the internal repository.
     */
    private final String REPO_NAME = "persimmon";

    /**
     * The parent Commit that preceded this Commit.
     */
    private Commit parent;
    // TODO add constructor
}
