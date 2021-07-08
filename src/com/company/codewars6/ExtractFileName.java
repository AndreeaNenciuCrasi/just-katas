package com.company.codewars6;

//Description:
//        You have to extract a portion of the file name as follows:
//
//        Assume it will start with date represented as long number
//        Followed by an underscore
//        You'll have then a filename with an extension
//        it will always have an extra extension at the end
//        Inputs:
//        1231231223123131_FILE_NAME.EXTENSION.OTHEREXTENSION
//
//        1_This_is_an_otherExample.mpg.OTHEREXTENSIONadasdassdassds34
//
//        1231231223123131_myFile.tar.gz2
//        Outputs
//        FILE_NAME.EXTENSION
//
//        This_is_an_otherExample.mpg
//
//        myFile.tar

public class ExtractFileName {
    public static String extractFileName(String f) {
        return f.substring(f.indexOf('_')+1,f.lastIndexOf('.'));
    }
}

    public static String extractFileName(String d) {
        return d.replaceAll(".*?_(.*)\\..*","$1");
    }

    public static String extractFileName(String dirtyFileName) {
        return dirtyFileName.replaceAll("^[0-9]+_", "").replaceAll("\\.\\w+$", "");
    }
