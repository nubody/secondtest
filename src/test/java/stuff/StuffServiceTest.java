package stuff;

import org.hamcrest.CoreMatchers;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.assertThat;

public class StuffServiceTest {

    private StuffService stuffService = new StuffService();

    @Test
    public void iCanBringYouStuff() {
        // given
        final String stuff = "here is your stuff ...";

        // when
        String myStuff = stuffService.iCanBringYouStuff();

        // then
        assertThat(myStuff, is(stuff));
    }

    @Test
    public void moreStuffFor() {
        // given
        final String awaitedStuffForMe = "stuff for me";

        // when
        String stuff = stuffService.moreStuffFor("me");

        // then
        assertThat(stuff, is(awaitedStuffForMe));
    }

    @Test
    public void getRandomStuff() {
        // when
        String randomStuff = stuffService.getRandomStuff();

        // then
        assertThat(randomStuff, is(notNullValue()));
    }

    @Test
    public void getRandomStuffFor() {
        // when
        String randomStuffForMe = stuffService.getRandomStuffFor("me");

        // then
        assertThat(randomStuffForMe, is(notNullValue()));
        assertThat(randomStuffForMe, CoreMatchers.endsWith("for me"));
    }
}