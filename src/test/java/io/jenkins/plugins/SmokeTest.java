package io.jenkins.plugins;

import static org.junit.Assert.assertEquals;

import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.junit.jupiter.api.Test;
import org.jvnet.hudson.test.JenkinsRule;
import org.jvnet.hudson.test.junit.jupiter.WithJenkins;

@WithJenkins
class SmokeTest {
    @Test
    void smokeTest(JenkinsRule jenkinsRule) throws Exception {
        DateTime dateTime = new DateTime(2022, 1, 1, 0, 0, DateTimeZone.UTC);
        DateTime modifiedDateTime = dateTime.plusDays(1);

        assertEquals(2022, dateTime.getYear());
        assertEquals(1, dateTime.getMonthOfYear());
        assertEquals(1, dateTime.getDayOfMonth());

        assertEquals(2022, modifiedDateTime.getYear());
        assertEquals(1, modifiedDateTime.getMonthOfYear());
        assertEquals(2, modifiedDateTime.getDayOfMonth());
    }
}
