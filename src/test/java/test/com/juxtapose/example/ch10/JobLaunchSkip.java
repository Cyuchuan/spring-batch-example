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
 * 2013-2-28下午08:34:48
 */
public class JobLaunchSkip {
    /**
     * @param args
     */
    public static void main(String[] args) {
        JobLaunchBase.executeJob("ch10/job/job-step-skip.xml", "skipJob",
                new JobParametersBuilder().addDate("date", new Date()));
    }
}
