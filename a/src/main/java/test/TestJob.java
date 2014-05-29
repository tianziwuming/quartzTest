package test;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;

public class TestJob extends QuartzJobBean {

	private String nameValue;
	@Override
	protected void executeInternal(JobExecutionContext context)
			throws JobExecutionException {
		
		try {
			System.out.println("执行TestJob! name="+ nameValue);
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	public String getNameValue() {
		return nameValue;
	}
	public void setNameValue(String name) {
		this.nameValue = name;
	}
	
	

}
