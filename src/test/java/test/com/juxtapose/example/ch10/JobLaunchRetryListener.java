/**
 *
 */
package test.com.juxtapose.example.ch10;

import org.springframework.batch.core.JobParametersBuilder;
import test.com.juxtapose.example.JobLaunchBase;

import java.util.Date;

/**
 *
 * @author bruce.liu(mailto : jxta.liu @ gmail.com)
 * 2013-10-21下午10:14:09
 */
public class JobLaunchRetryListener {

    /**
     * @param args
     */
    public static void main(String[] args) {
        JobLaunchBase.executeJob("ch10/job/job-step-retry-listener.xml", "retryListener2Job",
                new JobParametersBuilder().addDate("date", new Date()));
    }
}
