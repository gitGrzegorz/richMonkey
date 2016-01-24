package pl.technologyintouch.controllers;

import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pl.technologyintouch.model.Cost;

import java.util.LinkedList;
import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.*;

@RestController
@RequestMapping("/cost")
public class CostController {
    private static final Logger logger = Logger.getLogger(CostController.class);

    @RequestMapping(path = "/add", method = PUT)
    public void addCost(@RequestBody Cost cost) {
        logger.info(String.format("Add cost %s to category %s.", cost.getAmount(), cost.getCategory().getName()));
    }

    @RequestMapping(path = "/get-history", method = GET)
    public List<Cost> getCostsHistory(@RequestParam(name = "from", required = false) String from,
                                      @RequestParam(name = "to", required = false) String to) {
        //TODO -> think about this
        return new LinkedList<Cost>();
    }

    @RequestMapping(path = "/remove", method = DELETE)
    public void removeCost() {
        //TODO -> think about this
    }
}
