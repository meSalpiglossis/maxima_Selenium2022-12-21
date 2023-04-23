import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

import pages.DragAndDrop2Page;



public class DragAndDrop2Test extends TestBaseDrop2{

    @Test(timeOut = 5000)
    public void dragAndDropAtoB() {

        DragAndDrop2Page.moveSmallSquareToBigSquare();

        assertTrue(DragAndDrop2Page.successTextPresented());
    }
}
