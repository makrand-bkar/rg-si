package rube.complicated;



import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import rube.complicated.EchoGateway;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("rube.xml")
public class EchoTest {
	
	@Autowired EchoGateway echoGateway;

	@Test
	public void testEcho() throws Exception{
		String amessage = "Hello from Spring Integration";
		
		String response = echoGateway.echo(amessage);
		assertThat(response, is("HELLO FROM SPRING INTEGRATION"));
	}
}