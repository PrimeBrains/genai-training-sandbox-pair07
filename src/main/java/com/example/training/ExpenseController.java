package com.example.training;

import java.util.List;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/expenses")
public class ExpenseController {

    private final ExpenseService service;

    public ExpenseController(ExpenseService service) {
        this.service = service;
    }

    @PostMapping("/reimburse")
    public int reimburse(@RequestBody ExpenseItem item) {
        return service.reimburse(item);
    }

    @PostMapping("/total")
    public int total(@RequestBody List<ExpenseItem> items) {
        return service.total(items);
    }
}
