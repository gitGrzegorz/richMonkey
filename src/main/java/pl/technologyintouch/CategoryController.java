package pl.technologyintouch;

import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.technologyintouch.model.CostCategory;

import java.util.Collections;
import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

@RestController
@RequestMapping("/cost-categories")
public class CategoryController {

    private static final Logger logger = Logger.getLogger(CategoryController.class);

    @RequestMapping(path = "/add", method = POST)
    public void addCostCategory(@RequestBody CostCategory costCategory) {
        logger.info("Add cost category: " + costCategory.getName());
    }

    @RequestMapping(path = "/get", method = GET)
    public List<CostCategory> getCOstCategories() {
        CostCategory costCategory = new CostCategory();
        costCategory.setName("prezentyDlaGrzesia");
        return Collections.singletonList(costCategory);
    }
}
