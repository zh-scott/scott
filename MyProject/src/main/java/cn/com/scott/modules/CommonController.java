package cn.com.scott.modules;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @className CommonController.java
 * @author 朱浩(zhuhao@yitong.com.cn)
 * @date 2018年6月7日 上午9:44:15
 * @desc 通用控制类
 */
@Controller
@RequestMapping("common")
public class CommonController {
    
    Logger logger = LoggerFactory.getLogger(this.getClass());
    
    @RequestMapping(value="{transCode}")
    public String execute (@PathVariable String transCode, HttpServletRequest request, HttpServletResponse response) {
        logger.info("transCode is {}", transCode);
        return transCode;
    }
}
