package com.urise.webapp.exception;

import com.urise.webapp.storage.Storage;

public class ExistStorageException extends StorageException {
    public ExistStorageException(String uuid) {
        super("Resume" + uuid + "already exist", uuid);
    }
}
