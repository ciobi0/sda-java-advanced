package com.sdaJavaAdvanced.billapp;

import com.sdaJavaAdvanced.billapp.banknote.BanknoteEur100;
import com.sdaJavaAdvanced.billapp.banknote.BanknoteEur20;
import com.sdaJavaAdvanced.billapp.banknote.BanknoteEur50;
import com.sdaJavaAdvanced.billapp.coin.CoinEur1;
import com.sdaJavaAdvanced.billapp.coin.CoinEur2;
import com.sdaJavaAdvanced.billapp.ticket.SodexoTicket;

import java.util.Locale;
import java.util.Scanner;

public class Utils {
    public static void extractedTicket(Payment payment, String serialNumber) {
        try {
            payment.addNewPayableType(new SodexoTicket(serialNumber));
        } catch (FakePayableException e) {
            e.printStackTrace();
        }
    }

    public static void extractedCoin(Payment payment, int value) {
        switch (value) {
            case 1:
                try {
                    payment.addNewPayableType(new CoinEur1(10, 5));
                } catch (FakePayableException e) {
                    e.printStackTrace();
                }
                break;
            case 2:
                try {
                    payment.addNewPayableType(new CoinEur2(10, 5));
                } catch (FakePayableException e) {
                    e.printStackTrace();
                }
                break;
            default:
                System.out.println("incorrect value");
        }
    }

    public static void extractedBanknote(Payment payment, int value) {
        switch (value) {
            case 20:
                try {
                    payment.addNewPayableType(new BanknoteEur20(10, 5));
                } catch (FakePayableException e) {
                    e.printStackTrace();
                }
                break;
            case 50:
                try {
                    payment.addNewPayableType(new BanknoteEur50(10, 5));
                } catch (FakePayableException e) {
                    e.printStackTrace();
                }
                break;
            case 100:
                try {
                    payment.addNewPayableType(new BanknoteEur100(10, 5));
                } catch (FakePayableException e) {
                    e.printStackTrace();
                }
                break;
            default:
                System.out.println("incorrect value");
        }
    }

    public static Bill generateBill() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("insert bill serial number\nit should be 12 digits long");
        String billSerial = scanner.next();
        int i=billSerial.length();
        while ((billSerial.length() != 12) || !isNumeric(billSerial)) {
            System.out.println("invalid serial for the bill\ntry new serial number");
            billSerial = scanner.next();
        }
        int amountToBePayed = getAmountToBePayed();
        return new Bill(billSerial, amountToBePayed, CurrencyType.EUR);
    }

    public static boolean isNumeric(String strNum) {
        if (strNum == null) {
            return false;
        }
        try {
            long d = Long.parseLong(strNum);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }

    public static int getAmountToBePayed() {
        double f = Math.random() / Math.nextDown(1.0);
        int amountToBePayed = (int) (10 * (1.0 - f) + 251 * f);
        return amountToBePayed;
    }

    public static PaymentType getPaymentType(Scanner scanner) {
        PaymentType payMethod = null;
        while (payMethod == null) {
            System.out.println("select type of payment: [B]-banknote | [C]-coin | [T]-ticket");
            String option = scanner.next();
            try {
                payMethod = PaymentType.valueOf(option.toUpperCase(Locale.ROOT));
            } catch (Exception e) {
                System.out.println("enum can not be parsed");
            }
        }
        return payMethod;
    }
}
