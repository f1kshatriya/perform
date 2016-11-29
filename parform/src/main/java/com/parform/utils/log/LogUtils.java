package com.parform.utils.log;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.springframework.stereotype.Component;

/** 
* @author  li114 E-mail: 1145480206@qq.com
* @date 创建时间：2016年11月28日 下午10:21:39 
* @version 1.0 
* @parameter  
* @since  
* @return  
*/
@Component
public class LogUtils {
	
	public static Logger log = (Logger) LogManager.getLogger();

	
}
