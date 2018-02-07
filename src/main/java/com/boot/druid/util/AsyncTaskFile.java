package com.boot.druid.util;

import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

public class AsyncTaskFile {

    public void asyncTaskFile(MultipartFile file, String pathAndPictureName) throws IOException {
        file.transferTo(new File(pathAndPictureName));

    }
}
