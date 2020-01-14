/**
 *
 */
package test.com.juxtapose.example.ch08;

import org.springframework.batch.core.JobParametersBuilder;
import test.com.juxtapose.example.JobLaunchBase;

import java.util.Date;

/**
 *
 * @author bruce.liu(mailto : jxta.liu @ gmail.com)
 * 2013-10-1上午12:10:50
 */
public class JobLaunchErrorListener extends JobLaunchBase {

    /**
     * @param args
     */
    public static void main(String[] args) {
        executeJob("ch08/job/job-listener.xml", "errorTranslateJob",
                new JobParametersBuilder().addDate("date", new Date()));
    }
}