package smile.wangsy.january.merchant.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import smile.wangsy.january.merchant.valid.MerchantValid;

import javax.jws.WebParam;

/**
 * @author wangsy
 * @Date 2018/8/29.
 */
@RestController
public class WebMerchantController {

    @RequestMapping({"/", "/index"})
    public ModelAndView index() {
        return new ModelAndView("index.html");
    }

    @RequestMapping("/login")
    public ModelAndView login() {
        return new ModelAndView("login.html");
    }

    /**
     * 商品列表
     */
    @RequestMapping("/product_list")
    public ModelAndView product_list() {
        return new ModelAndView("product/product_list.html");
    }

}