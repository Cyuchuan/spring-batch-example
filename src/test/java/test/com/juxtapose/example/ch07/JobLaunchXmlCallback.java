/**
 *
 */
package test.com.juxtapose.example.ch07;

import org.springframework.batch.core.JobParametersBuilder;
import test.com.juxtapose.example.JobLaunchBase;

import java.util.Date;

/**
 *
 * @author bruce.liu(mailto : jxta.liu @ gmail.com)
 * 2013-2-28下午08:34:48
 */
public class JobLaunchXmlCallback {

    /**
     * @param args
     */
    public static void main(String[] args) {
        JobLaunchBase.executeJob("ch07/job/job-xml-callback.xml", "xmlFileReadAndWriterJob",
                new JobParametersBuilder().addDate("date", new Date()));
    }
}
