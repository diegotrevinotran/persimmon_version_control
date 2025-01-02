package org.persimmon;

import java.io.Serializable;
import java.nio.file.Path;
import java.time.Instant;

/**
 * Representation of a "snapshot" of a repository. Equivalent to a "commit" in git terms.
 */
public class Snapshot implements Serializable {
    /**
     * The timestamp at which this Snapshot was created.
     */
    private Instant timestamp;
    /**
     * The message contained by this Snapshot.
     */
    private String message;

    /**
     * Name of the internal repository.
     */
    private final String REPO_NAME = "persimmon";

    /**
     * The parent Snapshot that preceded this Snapshot.
     */
    private Snapshot parent;
    // TODO add constructor
}
