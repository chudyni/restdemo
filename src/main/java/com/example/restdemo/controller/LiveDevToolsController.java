package com.example.restdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by marcin.bracisiewicz
 */
@RestController
@RequestMapping("/live")
public class LiveDevToolsController {

    /**
     *  Intellij setup:
     *  1. Help -> Find Action... -> Registry... -> enable option: compiler.automake.allow.when.app.running
     *  2. Settings/Preferences ->  Compiler -> enable option: Build/Make project automatically
     *
     *  Chrome setup:
     *  1. Add LiveReoload plugin
     *  2. Enable LiveReload on url, where request is sent
     */
    @GetMapping("/{output}")
    public String displayOutput(@PathVariable String output) {
        return "LIVE output " + output;
    }

}
