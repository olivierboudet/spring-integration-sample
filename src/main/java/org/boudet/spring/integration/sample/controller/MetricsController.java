package org.boudet.spring.integration.sample.controller;

import org.boudet.spring.integration.sample.model.Metric;
import org.boudet.spring.integration.sample.service.MetricSenderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MetricsController {

    @Autowired
    MetricSenderService metricService;

    @PostMapping(path = "/metric")
    void metric(@RequestBody Metric metric) {
        metricService.send(metric);
    }
}
