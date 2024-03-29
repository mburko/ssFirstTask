package com.softserve.firsttask.tools;

import java.util.List;

public interface ExternalReader {
    String FILE_NOT_FOUND_EXCEPTION = "File %s could not be found";
    String FILE_NOT_READ_EXCEPTION = "File %s could not be read";
    String FILE_NOT_CLOSE_EXCEPTION = "File %s could not be closed";
    String DB_READING_ERROR = "DB Reading Error, %s";

    List<List<String>> getAllCells();
    List<List<String>> getAllCells(String path);
}