package com.sdaJavaAdvanced.abstractclass.sdawebexample;

public class CSVParser extends DataParser{
    @Override
    public Data parse() {
        validateData();
        String[] splitData = data.split(",");
        return new Data(splitData[0], Integer.parseInt(splitData[1]));
    }

}
