package com.sdaJavaAdvanced.billapp;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FakePayableException {

        Bill bill = new Bill("123456", 200, CurrencyType.EUR);
        Payment payment = new Payment(bill);
        Scanner scanner = new Scanner(System.in);
        while (!payment.isBillPayed()) {
            System.out.println("you have payed: " + payment.getAmountCollected() + " " +
                    "from bill with value of: " + payment.getBill().getAmount());
            System.out.println("select type of payment: [B]-banknote | [C]-coin | [T]-ticket");
            String option = scanner.next().toUpperCase();
            switch (option) {
                case "B": {
                    System.out.println("select type of banknote:\n" +
                            "[20]-eur20 | [50]-eur50 | [100]-eur100");
                    int value = scanner.nextInt();
                    switch (value) {
                        case 20:
                            payment.addNewPayableType(new BanknoteEur20(10, 5));
                            break;
                        case 50:
                            payment.addNewPayableType(new BanknoteEur50(10, 5));
                            break;
                        case 100:
                            payment.addNewPayableType(new BanknoteEur100(10, 5));
                            break;
                        default:
                            System.out.println("incorrect value");
                    }
                    break;
                }
                case "C": {
                    System.out.println("select type of coin:\n" +
                            "[1]-eur1 | [2]-eur2");
                    int value = scanner.nextInt();
                    switch (value) {
                        case 1:
                            payment.addNewPayableType(new CoinEur1(10, 5));
                            break;
                        case 2:
                            payment.addNewPayableType(new CoinEur2(10, 5));
                            break;
                        default:
                            System.out.println("incorrect value");
                    }
                    break;
                }
                case "T":{
                    System.out.println("enter Ticket serial number: ");
                    String serialNumber=scanner.next();
                    payment.addNewPayableType(new SodexoTicket(serialNumber));
                    break;
                }
                default:
                    System.out.println("invalid payment choice");
            }
        }
        System.out.println("Congratulation, you have payed the bill.");
    }
}
