package pl.technologyintouch.controllers;

import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pl.technologyintouch.model.CostCategory;

import java.util.Collections;
import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.*;

@RestController
@RequestMapping("/cost-categories")
public class CategoryController {

    private static final Logger logger = Logger.getLogger(CategoryController.class);

    @RequestMapping(method = PUT)
    public void addCostCategory(@RequestBody CostCategory costCategory) {
        logger.info("Add cost category: " + costCategory.getName());
    }

    @RequestMapping(method = GET)
    public List<CostCategory> getCostCategories() {
        CostCategory costCategory = new CostCategory();
        costCategory.setName("Category 1");
        return Collections.singletonList(costCategory);
    }

    @RequestMapping(method = DELETE)
    public void removeCostCategory(@RequestParam String categoryName) {

    }

    @RequestMapping(method = POST)
    public void editCostCategory(@RequestParam String categoryName, @RequestBody CostCategory costCategory) {
        logger.info(String.format("Change category name from %s to %s", categoryName, costCategory.getName()));
    }
}
