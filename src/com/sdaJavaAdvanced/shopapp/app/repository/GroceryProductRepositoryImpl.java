package com.sdaJavaAdvanced.shopapp.app.repository;

import com.sdaJavaAdvanced.shopapp.app.model.GroceryProduct;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class GroceryProductRepositoryImpl
        extends SellableRepositoryImpl<GroceryProduct>
        implements GroceryProductRepository {
    private static final DateFormat DATE_FORMAT = new SimpleDateFormat("mm/dd/yyyy");

    public GroceryProductRepositoryImpl() {
        Path path = Paths.get("C:/Users/cosmin/Documents/sda-java-advanced/src/groceries.csv");
        try {
            Files.lines(path)
                    .skip(1)
                    .filter(line -> line != null)
                    .filter(line -> !line.isEmpty())
                    .map(line -> {
                        try {
                            String[] arrayElem = line.split("\\|");
                            return new GroceryProduct(
                                    DATE_FORMAT.parse(arrayElem[5]),
                                    Boolean.parseBoolean(arrayElem[6]),
                                    arrayElem[7],
                                    arrayElem[2],
                                    Double.parseDouble(arrayElem[1]),
                                    arrayElem[3],
                                    arrayElem[4],
                                    arrayElem[0]
                            );
                        } catch (Exception e) {
                            e.printStackTrace();
                            return null;
                        }
                    })
                    .filter(groceryProduct -> groceryProduct!=null)
                    .forEach(groceryProduct -> add(groceryProduct));
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}
