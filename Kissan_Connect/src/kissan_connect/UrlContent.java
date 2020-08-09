/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kissan_connect;

import java.awt.Desktop;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;

/**
 *
 * @author vaibhav
 */
public class UrlContent {
    
    public static void url(String z) {

        URL url;

                try {
          Desktop desktop = java.awt.Desktop.getDesktop();
//          tomato
//          https://dir.indiamart.com/impcat/tomato.html
          String url1 = "https://dir.indiamart.com/search.mp?ss=";
          String url2 = "&cq=pune&cq_src=Not%20Found";
          String f = url1+z+url2;
//          https://www.google.com/search?q=current+mangos
          URI oURL = new URI(f);
          desktop.browse(oURL);
        } catch (Exception e) {
          e.printStackTrace();
        }

    }
    public static void msg(){
        System.out.println("hello");
    }
}
