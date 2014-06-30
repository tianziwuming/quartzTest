package test;

import static com.sun.btrace.BTraceUtils.concat;
import static com.sun.btrace.BTraceUtils.print;
import static com.sun.btrace.BTraceUtils.println;
import static com.sun.btrace.BTraceUtils.str;
import static com.sun.btrace.BTraceUtils.timeMillis;

import com.sun.btrace.annotations.BTrace;
import com.sun.btrace.annotations.Kind;
import com.sun.btrace.annotations.Location;
import com.sun.btrace.annotations.OnMethod;
import com.sun.btrace.annotations.ProbeClassName;
import com.sun.btrace.annotations.ProbeMethodName;
import com.sun.btrace.annotations.TLS;

/**
 * 
 * @author wangshubao
 *测试21天零销售后台加载一个页面的耗时
 */
@BTrace
public class BtraceTestZeroSales {
	
	@TLS
	public static long timeMillis;

	@OnMethod(clazz="com.lashou.stat.controller.salesmonitor.zerosales.TwentyoneZeroSalesController",
			method="viewForTwentyoneZeroSales")
	public static void execute(){
		timeMillis=timeMillis();
	}
	
	@OnMethod(clazz="com.lashou.stat.controller.salesmonitor.zerosales.TwentyoneZeroSalesController",
			method="viewForTwentyoneZeroSales",
			location=@Location(Kind.RETURN))
	public static void executeEnd(@ProbeClassName String className,@ProbeMethodName String methodName){
		long timeWaste = timeMillis()-timeMillis;
		print(concat(className,"."));
		print(methodName);
		print(concat("耗时", str(timeWaste)));
		println("毫秒");
	}
}
