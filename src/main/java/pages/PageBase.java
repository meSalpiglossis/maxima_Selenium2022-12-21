package pages;

import static helpers.WebBrowser.webBrowser;

public class PageBase {

   protected static boolean titleIsPresented(String TITLE_EXPECTED) {
       return webBrowser().getTitle().contains(TITLE_EXPECTED);
   }
}
