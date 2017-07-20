import static org.junit.Assert.*;

/*
 *yellowBox.swapでCandyBoxにおけるswapが呼び出される。
 *コンパイルすることは可能だが、異なる種類のボックスをswapすると例えばTeaをCandyにcastできないエラーが出る。
 */

import org.junit.Test;

public class BoxExamples {
  Candy yellowCandy = new Candy("Yellow", 300);
  Candy blueCandy   = new Candy("Blue",   99);
  
  Tea earlGray = new Tea("Earl Gray", 2);
  Tea assam    = new Tea("Assam",     2);

  @Test
  public void testGet() {
    CandyBox yellowBox = new CandyBox(yellowCandy);
    TeaBox   assamBox  = new TeaBox(assam);
    assertEquals("Yellow", yellowBox.get().color);
    assertEquals("Assam",  assamBox.get().kind);
  }
  
  @Test
  public void testSwap() {
    CandyBox yellowBox = new CandyBox(yellowCandy);
    CandyBox blueBox   = new CandyBox(blueCandy);
    yellowBox.swap(blueBox);
    assertEquals(blueCandy,   yellowBox.get());
    assertEquals(yellowCandy, blueBox.get());
    
    TeaBox earlGrayBox = new TeaBox(earlGray);
    TeaBox assamBox    = new TeaBox(assam);
    assamBox.swap(earlGrayBox);
    assertEquals(assam,    earlGrayBox.get());
    assertEquals(earlGray, assamBox.get());
  }

  

  @Test
  public void testSwap2() {
    CandyBox yellowBox = new CandyBox(yellowCandy);
    TeaBox assamBox    = new TeaBox(assam);
    yellowBox.swap(assamBox);
    assertEquals(assam,yellowBox.get());
  }

}
