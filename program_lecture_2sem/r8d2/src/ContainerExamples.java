import static org.junit.Assert.*;
import org.junit.Test;

//testSwap2bのコメントアウトしている部分について
//yellowContainerにswapをすることで、swap(AContainer<Candy> that)と、valueの値が決まってしまう。
//ゆえに、thatの型はcandyContainerであり、assamContainerをいれることはできなくなる。


public class ContainerExamples {
  Candy yellow = new Candy("Yellow", 300);
  Candy blue   = new Candy("Blue", 99);
  CandyContainer yellowContainer = new CandyContainer(yellow);
  CandyContainer blueContainer   = new CandyContainer(blue);

  Tea uva   = new Tea("Uva", 2);
  Tea assam = new Tea("Assam", 2);
  TeaContainer uvaContainer   = new TeaContainer(uva);
  TeaContainer assamContainer = new TeaContainer(assam);

  public void testGet() {
    assertEquals("Yellow", yellowContainer.get().color);
    assertEquals("Assam",  assamContainer.get().kind);
  }

  @Test
  public void testSwap() {
    CandyContainer yellowContainer = new CandyContainer(yellow);
    CandyContainer blueContainer   = new CandyContainer(blue);
    yellowContainer.swap(blueContainer);
    assertEquals(blue,   yellowContainer.get());
    assertEquals(yellow, blueContainer.get());

    TeaContainer uvaContainer   = new TeaContainer(uva);
    TeaContainer assamContainer = new TeaContainer(assam);
    assamContainer.swap(uvaContainer);
    assertEquals(assam, uvaContainer.get());
    assertEquals(uva,   assamContainer.get());
    
  }
  

  
  public void testSwap2b(){
	CandyContainer yellowContainer = new CandyContainer(yellow);
	TeaContainer assamContainer = new TeaContainer(assam);  
	/*yellowContainer.swap(assamContainer);*/
    assertEquals(assam,yellowContainer.get());
  }
}
