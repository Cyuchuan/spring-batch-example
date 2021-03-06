/**
 *
 */
package test.com.juxtapose.example.ch09;

import org.springframework.batch.core.JobParametersBuilder;
import test.com.juxtapose.example.JobLaunchBase;

import java.util.Date;

/**
 *
 * @author bruce.liu(mailto : jxta.liu @ gmail.com)
 * 2013-9-30上午11:11:09
 */
public class JobLaunchExternalFlow {

    /**
     * @param args
     */
    public static void main(String[] args) {
        JobLaunchBase.executeJob("ch09/job/job-external-flow.xml", "externalFlowJob",
                new JobParametersBuilder().addDate("date", new Date())
                        .addString("inputFile", "classpath:ch09/data/credit-card-bill-201310.zip")
                        .addString("readFileName", "credit-card-bill-201310.csv")
                        .addString("workDirectory", "file:target/ch09/work/")
                        .addString("writeTarget", "file:target/ch09/externalFlow/outputFile.csv"));
    }
}
