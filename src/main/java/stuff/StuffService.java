package stuff;

import org.fluttercode.datafactory.impl.DataFactory;

public class StuffService {


    public String iCanBringYouStuff() {
        return "here is your stuff ...";
    }

    public String moreStuffFor(final String whom) {
        return "stuff for " + whom;
    }

    public String getRandomStuff() {
        return new DataFactory().getRandomWord(10, 30);
    }

    public String getRandomStuffFor(final String whom) {
        return getRandomStuff() + " for " + whom;
    }
}
