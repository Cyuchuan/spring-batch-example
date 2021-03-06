/**
 *
 */
package test.com.juxtapose.example.ch06;

import org.springframework.batch.core.JobParametersBuilder;
import test.com.juxtapose.example.JobLaunchBase;

import java.util.Date;

/**
 *
 * @author bruce.liu(mailto : jxta.liu @ gmail.com)
 * 2013-8-16下午09:09:42
 */
public class JobLaunchErrorListener extends JobLaunchBase {

    /**
     * @param args
     */
    public static void main(String[] args) {
        executeJob("ch06/job/job-listener.xml", "errorItemReadJob",
                new JobParametersBuilder().addDate("date", new Date()));
    }
}
