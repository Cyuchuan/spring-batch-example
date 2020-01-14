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
 * 2013-8-16下午09:09:42
 */
public class JobLaunchIbatis {

    /**
     * @param args
     */
    public static void main(String[] args) {
        JobLaunchBase.executeJob("ch07/job/job-db-ibatis.xml", "ibatisWriteJob",
                new JobParametersBuilder().addDate("date", new Date()));
    }
}
