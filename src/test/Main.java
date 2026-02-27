package test;

import java.text.NumberFormat;
import java.util.Locale;

public class Main {

    static void printCurrency(Locale locale) {

        NumberFormat nf =
            NumberFormat.getCurrencyInstance(locale);

        System.out.println(nf.format(10500.32));
    }

    public static void main(String[] args) {

        printCurrency(Locale.US);

        printCurrency(Locale.UK);

        printCurrency(Locale.FRANCE);
    }
}