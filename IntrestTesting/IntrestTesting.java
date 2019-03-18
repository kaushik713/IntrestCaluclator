import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import intrest.IntrestCalucaltor;
class IntrestTesting {
	IntrestCalucaltor intrest=new IntrestCalucaltor();
	
	@Test
	void testSimpleIntrest(){
		assertEquals("wrong answer please check simple interest function",225,intrest.simpleInterest(90,5,50),0.0);
		assertEquals("wrong answer check simple interest function",89.08761600000001,intrest.simpleInterest(90.98,4.5,21.76),0.0);
		assertEquals("wrong answer check simple interest function",163450.54874747433,intrest.simpleInterest(898.58963,32.02350,568.010265),0.0);
	}
	
	@Test
	void testCompoundIntrest(){
		assertEquals("wrong answer please check simple interest function",180,intrest.compoundInterest(80,2,50),0.0);
		assertEquals("wrong answer check simple interest function",4186.407035882459,intrest.compoundInterest(1890.98,4,21.98),0.0);
		assertEquals("wrong answer check simple interest function",2.3227590567808837E29,intrest.compoundInterest(898.58963,32.02350,568.010265),0.0);
	}

	

}
