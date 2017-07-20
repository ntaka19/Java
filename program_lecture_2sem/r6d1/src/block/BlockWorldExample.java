package block;

public class BlockWorldExample {
	BlockWorld w1 = new BlockWorld(new DrpBlock());
	BlockWorld w2 = new BlockWorld(new DrpBlock(11,20)); //private はクラスの外から使えない。
	
	@Test
	publc void testDrop(){
		assertEquals(w2,w1.drop());
	}
}
