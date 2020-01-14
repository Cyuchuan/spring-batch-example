/**
 *
 */
package test.com.juxtapose.example.ch06;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

/**
 *
 * @author bruce.liu(mailto : jxta.liu @ gmail.com)
 * 2013-8-16下午09:09:42
 */
public class JobLaunchJpaPaging {

    /**
     * 执行批处理作业.<br>
     * @param jobPath    作业配置文件
     * @param jobName    作业名
     * @param builder    作业参数构造器
     */
    public static void executeJob(String jobPath, String jobName, JobParametersBuilder builder) {
        ApplicationContext context = new ClassPathXmlApplicationContext(jobPath);
        JobLauncher launcher = (JobLauncher) context.getBean("jobLauncher");
        Job job = (Job) context.getBean(jobName);
        try {
            JobExecution result = launcher.run(job, builder.toJobParameters());
            System.out.println(result.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        executeJob("ch06/job/job-db-paging-jpa.xml", "jpaPagingReadJob",
                new JobParametersBuilder().addDate("date", new Date())
                        .addString("id_begin", "1").addString("id_end", "4"));
    }
}
