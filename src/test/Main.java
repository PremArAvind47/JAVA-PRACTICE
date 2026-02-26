package test;

import java.net.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {

        URL url = new URL("https://example.com");

        URLConnection con = url.openConnection();

        InputStream in = con.getInputStream();

        int data;

        while((data = in.read()) != -1) {
            System.out.print((char)data);
        }
    }
}