package com.figure.store.api.controller;

import com.figure.store.domain.service.stock.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * author LucasDonizeti
 */

@RestController
@RequestMapping(path ="/stock-history")
public class StockHistoryController {
    private StockService stockService;

    @Autowired
    public StockHistoryController(StockService stockService) {
        this.stockService = stockService;
    }

    @GetMapping
    public ResponseEntity<?> getStockHistory(){
        return new ResponseEntity<>(stockService.findAll(), HttpStatus.OK);
    }
}