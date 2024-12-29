# Persimmon
## Project Description
Persimmon is a version-control system developed specifically for music producers and their projects. Users can choose
files to be tracked, take various snapshots during the creation process, and revert to different versions if necessary.
## Commands
### init
Creates a new repository in the current directory, which will be used to track and manage changes. If this command is
used in a directory that already contains a repository, nothing happens and an error message is returned.
### add [file]
Adds the specified file to the staging area. If the file has already been added to the staging area, this command overwrites the
previous version. If the file is not in the working directory or if no file is specified, nothing happens and an error
message is returned.
### commit [message]
Creates a new snapshot of the changes added to the staging area, then resets the staging area. If no message is specified,
the default message lists the timestamp. No changes are actually made to the working directory or any of its files.
### rm [file]
Removes the specified file from the staging area. If the file is not in the staging area, or if no file is specified,
nothing happens and an error message is returned.
### log
Returns information about each commit from the most recent commit to the initial commit.