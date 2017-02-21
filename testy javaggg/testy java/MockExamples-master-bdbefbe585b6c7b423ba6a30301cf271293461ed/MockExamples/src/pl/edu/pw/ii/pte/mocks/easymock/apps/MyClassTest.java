package pl.edu.pw.ii.pte.mocks.easymock.apps;


//import static org.easymock.EasyMock.createNiceMock;
import org.easymock.EasyMockSupport;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;
//import junit.framework.TestCase;

//public class MyClassTest extends TestCase{
//public class MyClassTest {
public class MyClassTest extends EasyMockSupport{
	private SimpleLogger logger = createNiceMock(SimpleLogger.class);
	private MyClass myClass;

	@Before
	public void createMyClass() throws Exception {
		myClass = new MyClass();
		myClass.setLogger(logger);
	}

	@Test
	public void testMessage() throws Exception {
		//throw new RuntimeException("not yet implemented");
		 // given
        myClass.setMsg("World");
        // when
        String res = myClass.message();
        // then
        Assert.assertEquals("Hello World", res);
	}

	@Test
    public void testMessage2() throws Exception {
        // given
        myClass.setMsg("World");                // ustawiamy obiekt
        logger.messageGenerated("Hello World");    // ma byæ 1 wywo³anie z takim parametrem        
        // when
        replayAll();                            // zaczynamy odtwarzanie
        String res = myClass.message();            // tu kod sprawdzany
        // then
        Assert.assertEquals("Hello World", res);// tradycyjne sprawdzenie wyniku
        verifyAll();                            // sprawdzamy, czy zgadza siê z nagraniem
    }
}
