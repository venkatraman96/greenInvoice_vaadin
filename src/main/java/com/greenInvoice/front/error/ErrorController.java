/**
 * 
 */
package com.greenInvoice.front.error;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Venkatraman
 *
 */
@Controller
public class ErrorController {
    
    @RequestMapping("/error")
    protected String error404() {
        return "error/page_404";
    }
}
