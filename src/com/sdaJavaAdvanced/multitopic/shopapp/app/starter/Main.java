package com.sdaJavaAdvanced.multitopic.shopapp.app.starter;

import com.sdaJavaAdvanced.multitopic.shopapp.app.repository.GroceryProductRepositoryImpl;

import java.util.InputMismatchException;
import java.util.Objects;
import java.util.Scanner;

public class Main {private static final Scanner SCANNER = new Scanner(System.in);

    private static Integer loggedInUser;

    private static final GroceryProductRepositoryImpl groceryProductRepository = new GroceryProductRepositoryImpl();

    public static void main(String[] args)
    {
        System.out.println("Welcome to the online shop !");

        AppCommand command;
        do
        {
            try
            {
                AppCommand.printOptions(loggedInUser != null);
                command = AppCommand.valueOf(SCANNER.nextLine());
            }
            catch (IllegalArgumentException e)
            {
                command = AppCommand.OPTION_NOT_DEFINED;
            }

            try
            {
                switch (command)
                {
                    case LOGIN_CUSTOMER:
                        System.err.println(command.getCommandText());
                        loggedInUser = SCANNER.nextInt();
                        break;
                    case LOGOUT:
                        System.err.println(command.getCommandText());
                        loggedInUser = null;
                        break;
                    case BUY_PRODUCT:
                        System.err.println(command.getCommandText());
                        String id = SCANNER.nextLine();
                        System.out.println(groceryProductRepository.search(id)
                        .map(Objects::toString)
                        .orElse("Product not found"));
                        break;
                    case VIEW_PRODUCTS:

                        break;
                    case SEARCH_PRODUCT:
                        System.err.println(command.getCommandText());
                        String name = SCANNER.nextLine();
                        System.out.println(groceryProductRepository.findByName(name)
                                .map(Objects::toString)
                                .orElse("Product was not found"));
                        break;
                    case EXIT:
                    case OPTION_NOT_DEFINED:
                        //System.err.println(command.getCommandText());
                        break;
                }
            }
            catch (InputMismatchException e)
            {
                System.err.println("Wrong data was inserted !");
            }
        }
        while (!AppCommand.EXIT.equals(command));
    }
}
