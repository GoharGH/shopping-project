package am.gitc.shopping.controllers.shopController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class ShopController {
    @GetMapping("/category")
    public ModelAndView category(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("user/shop/category");
        return modelAndView;
    }

    @GetMapping("/product")
    public ModelAndView product(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("user/shop/product");
        return modelAndView;
    }

    @GetMapping("/cart")
    public ModelAndView cart(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("user/shop/cart");
        return modelAndView;
    }


    @GetMapping("/checkout")
    public ModelAndView checkout(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("user/shop/checkout");
        return modelAndView;
    }

    @GetMapping("/confirmation")
    public ModelAndView confirmation(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("user/shop/confirmation");
        return modelAndView;
    }
}
