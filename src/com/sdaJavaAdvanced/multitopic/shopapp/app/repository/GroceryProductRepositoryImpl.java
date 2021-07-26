package com.sdaJavaAdvanced.multitopic.shopapp.app.repository;

import com.sdaJavaAdvanced.multitopic.shopapp.app.model.GroceryProduct;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class GroceryProductRepositoryImpl extends SellableRepositoryImpl<GroceryProduct> implements GroceryProductRepository {

    private static final DateFormat DATE_FORMAT = new SimpleDateFormat("MM/dd/yyyy");

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
                            String id= arrayElem[0];
                            Double price = Double.parseDouble(arrayElem[1]);
                            String currency = arrayElem[2];
                            String name = arrayElem[3];
                            String description = arrayElem[4];
                            Date expirationDate =  DATE_FORMAT.parse(arrayElem[5]);
                            Boolean isBio =  Boolean.parseBoolean(arrayElem[6]);
                            String countryOfOrigin = arrayElem[7];

                            return new GroceryProduct(
                                    id,
                                    price,
                                    currency,
                                    name,
                                    description,
                                    expirationDate,
                                    isBio,
                                    countryOfOrigin
                            );
                        } catch (Exception e) {
                            e.printStackTrace();
                            return null;
                        }
                    })
                    .filter(groceryProduct -> groceryProduct != null)
                    .forEach(groceryProduct -> add(groceryProduct));
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}
