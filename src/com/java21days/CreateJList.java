package com.java21days;

public class CreateJList {
    public static void main(String[] args) {
        String title = "RSS Subscriptions";
        String[] options = { "Ideoplex", "Inessential", "Intertwingly", "Now This", "Rasterweb", "RC3", "Whole Lotta Nothing", "Workbench" };
        String message = "RSS Subscriptions:";

        List list = new List(title, options, message);
    }
}
