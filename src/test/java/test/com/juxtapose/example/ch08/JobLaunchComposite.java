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
 * 2013-9-30上午11:11:09
 */
public class JobLaunchComposite {

    /**
     * @param args
     */
    public static void main(String[] args) {
        JobLaunchBase.executeJob("ch08/job/job-composite.xml", "compositeJob",
                new JobParametersBuilder().addDate("date", new Date())
                        .addString("filter", "true"));
    }
}
