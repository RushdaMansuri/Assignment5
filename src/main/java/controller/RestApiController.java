package com.info.shows.controller;

import java.nio.file.Paths;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.info.shows.SpringShowsCastApplication;
import com.info.shows.model.Details;

import org.springframework.boot.SpringApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestApiController {
    public static final ObjectMapper MAPPER = new ObjectMapper();
    public static final String CUSTOMERS_FILE_PATH = "D:\\Spring 2022\\Internet Computing\\Assignments\\DockerSpringWebservice-master\\DockerSpringWebservice-master\\customers.json";

    @GetMapping("/hello")
    public String hello(@RequestParam(value = "name", defaultValue = "test") String name) {
        return String.format("Hello %s!", name);
    }

    @CrossOrigin(origins = "*")
    @GetMapping("/customers")
    public String getCustomers() {
        try {
            Details details = MAPPER.readValue(Paths.get(CUSTOMERS_FILE_PATH).toFile(), Details.class);
            return MAPPER.writerWithDefaultPrettyPrinter().writeValueAsString(details);
        } catch (Exception ex) {
            ex.printStackTrace();
            return "Sorry, we are unable to serve your request.";
        }
    }

    @CrossOrigin(origins = "*")
    @RequestMapping(value = "/customers/{custId}", method = RequestMethod.GET)
    public String getParticularCustomers(@PathVariable("custId") String custId) {
        try {
            Details details = MAPPER.readValue(Paths.get(CUSTOMERS_FILE_PATH).toFile(), Details.class);
            return MAPPER.writerWithDefaultPrettyPrinter().writeValueAsString(
                    details.getCustomers().stream().filter(t -> custId.equals(t.getUserId())).findFirst().orElse(null));
        } catch (Exception ex) {
            ex.printStackTrace();
            return "Sorry, we are unable to serve your request.";
        }
    }

    @CrossOrigin(origins = "*")
    @RequestMapping(value = "/customers/{custId}/orders", method = RequestMethod.GET)
    public String getCustomerOrders(@PathVariable("custId") String custId) {
        try {
            Details details = MAPPER.readValue(Paths.get(CUSTOMERS_FILE_PATH).toFile(), Details.class);
            return MAPPER.writerWithDefaultPrettyPrinter().writeValueAsString(details.getCustomers().stream()
                    .filter(t -> custId.equals(t.getUserId())).findFirst().orElse(null).getOrders());
        } catch (Exception ex) {
            ex.printStackTrace();
            return "Sorry, we are unable to serve your request.";
        }
    }

    @RequestMapping(value = "/customers/{custId}/orders/{orderId}", method = RequestMethod.GET)
    public String getCustomerOrders(@PathVariable("custId") String custId, @PathVariable("orderId") String orderId) {
        try {
            Details details = MAPPER.readValue(Paths.get(CUSTOMERS_FILE_PATH).toFile(), Details.class);
            return MAPPER.writerWithDefaultPrettyPrinter()
                    .writeValueAsString(details.getCustomers().stream().filter(t -> custId.equals(t.getUserId()))
                            .findFirst().orElse(null).getOrders().stream().filter(t -> orderId.equals(t.getOrderId()))
                            .findFirst().orElse(null));
        } catch (Exception ex) {
            ex.printStackTrace();
            return "Sorry, we are unable to serve your request.";
        }
    }

}