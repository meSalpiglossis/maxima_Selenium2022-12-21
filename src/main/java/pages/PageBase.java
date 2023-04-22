package pages;

import static helpers.WebBrowser.webBrowser;

public class PageBase {

   protected static boolean titleIsPresented(String TITLE_EXPECTED) {
       return webBrowser().getTitle().contains(TITLE_EXPECTED);
   }

//    public static boolean isProperH3HeaderPresented(By h3HeaderActual, String h3HeaderExpected) {
//        return webBrowser().findElement(h3HeaderActual).getText().contains(h3HeaderExpected);
//    }
}
