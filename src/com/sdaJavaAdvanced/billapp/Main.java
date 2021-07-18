package com.sdaJavaAdvanced.billapp;

import java.util.Scanner;

import static com.sdaJavaAdvanced.billapp.Utils.*;

public class Main {
    public static void main(String[] args) {

        Bill bill = generateBill();
        Payment payment = new Payment(bill);
        Scanner scanner = new Scanner(System.in);
        while (!payment.isBillPayed()) {
            System.out.println("you have payed: " + payment.getAmountCollected() + " " +
                    "from bill with value of: " + payment.getBill().getAmount());
            PaymentType payMethod = getPaymentType(scanner);
            switch (payMethod) {
                case B: {
                    System.out.println("select type of banknote:\n" +
                            "[20]-eur20 | [50]-eur50 | [100]-eur100");
                    int value = scanner.nextInt();
                    extractedBanknote(payment, value);
                    break;
                }
                case C: {
                    System.out.println("select type of coin:\n" +
                            "[1]-eur1 | [2]-eur2");
                    int value = scanner.nextInt();
                    extractedCoin(payment, value);
                    break;
                }
                case T: {
                    System.out.println("enter Ticket serial number: ");
                    String serialNumber = scanner.next();
                    extractedTicket(payment, serialNumber);
                    break;
                }
                default:
                    System.out.println("invalid payment choice");
            }
        }
        System.out.println("Congratulation, you have payed the bill.");
    }
}
