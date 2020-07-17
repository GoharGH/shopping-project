package am.gitc.shopping.controllers.shopController;

import am.gitc.shopping.repo.ProductRepo;
import am.gitc.shopping.models.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ProductController {

    @Autowired
    private ProductRepo productRepo;

    @GetMapping("/category")
    public ModelAndView category(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("user/shop/category");
//        Iterable<Product> products=productRepo.findAll();
//        modelAndView.addObject("products",products);
        return modelAndView;
    }
}
