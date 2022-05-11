import org.junit.Assert;
import org.junit.Test;

import java.util.*;
import java.util.Map.Entry;

public class TestZipCodeWilmington {

    @Test
    public void testHostLecture(){
        ZipCodeWilmington zipCodeWilmington = new ZipCodeWilmington();
        zipCodeWilmington.hostLecture(new Instructor(5,"Vinte"),8);

        double expected = 8;
        double actual = 0;

        for (Entry<String, Double> entry : zipCodeWilmington.getStudyMap().entrySet()) {
            actual += entry.getValue();
        }

        Assert.assertEquals(expected,actual,0.01);
        }
    }

