package com.sdaJavaAdvancedIndividualWorkSession.ex10.model;

import java.time.LocalDate;
import java.util.Date;

public interface Product {
    double getPrice();

    boolean isAvailable(LocalDate localDate);
}
