package top.liqx.java.study.spring3.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

import java.util.UUID;

/**
 * @author Arvin
 * @date 2023/7/5 17:14
 */
@RestController
@RequestMapping("/asd")
public class AsdController {

    @RequestMapping("asd")
    public Mono<String> asd() {

        return Mono.just(UUID.randomUUID().toString());
    }
}