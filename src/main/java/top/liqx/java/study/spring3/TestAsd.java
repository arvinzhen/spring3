package top.liqx.java.study.spring3;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;

import java.util.Timer;
import java.util.TimerTask;
import java.util.UUID;

/**
 * @author Arvin
 * @date 2023/7/4 14:05
 */
@Component
@Slf4j
public class TestAsd implements ApplicationContextAware {

//    @Resource
//    @Setter
//    private FgsDeptMapper fgsDeptMapper;

    private StringRedisTemplate stringRedisTemplate;

    static boolean ok = true;

    @Override
    public void setApplicationContext(ApplicationContext context) throws BeansException {

        stringRedisTemplate = context.getBean(StringRedisTemplate.class);

        stringRedisTemplate.opsForValue().set("asd", UUID.randomUUID().toString());

        Runtime.getRuntime().addShutdownHook(new Thread(() -> ok = false));

        Timer t = new Timer();
        t.schedule(new TimerTask() {
            @Override
            public void run() {
                if (ok) {
                    String s = stringRedisTemplate.opsForValue().get("asd");
                    System.out.println(s);
                    log.error("asdasdasdasdasd: {}", s);
                }
                //
                else {
                    t.cancel();
                }
            }
        }, 1000, 2000);

    }

    public void asd() {
//        FgsDeptModel fgsDeptModel = fgsDeptMapper.selectOne(Wrappers.lambdaQuery(FgsDeptModel.class).last("limit 1"));


        System.out.println(1);
    }
}