package com.greenInvoice.front.dashboard;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.greenInvoice.biz.entity.DataRequest;

/**
 * GreenInvoiceDashboardController toa spring based controller.
 * 
 * @author Venkatraman
 *
 */
@Controller
public class GreenInvoiceDashboardController {

    /**
     * index method to start.
     * 
     * @return index
     */
    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index() {
        return "index";
    }

    /**
     * controllerMethod to add two numbers.
     * 
     * @param request
     * @return res
     */
    @RequestMapping(value = "/addNumber", method = RequestMethod.POST)
    @ResponseBody
    public String controllerMethod(@RequestBody DataRequest request) {
        Integer value1 = request.getValue1();
        Integer value2 = request.getValue2();
        System.out.println("values :" + value1 + " , " + value2);
        int result = value1 + value2;
        System.out.println(result);
        String res = Integer.toString(result);
        return res;
    }
}
