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
 * 2013-9-29下午12:36:33
 */
public class JobLaunchCustomItemWriter {

    /**
     * @param args
     */
    public static void main(String[] args) {
        JobLaunchBase.executeJob("ch07/job/job-custom-itemwriter.xml", "customItemWriteJob",
                new JobParametersBuilder().addDate("date", new Date()));
    }
}
