package org.bk.rube;



import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:/rube.xml")
public class EchoTest {
	
	@Autowired EchoGateway echoGateway;

	@Test
	public void testEcho() {
		String response = echoGateway.echo("Hello");
		assertThat(response, is("Hello"));
	}

}