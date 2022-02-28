package com.example.demo.config;

import com.qishenghe.munin.cache.pack.DictEntity;
import com.qishenghe.munin.session.MuninSession;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Frank
 * @Date: 2022-02-28 14:52
 */
@Configuration
public class MuninConfig {

    @Bean
    public MuninSession initSession(){
        return MuninSession.builder()
                //设置初始化步骤
                .setDictPackInitJob(this::selectDict)
                //开启自动更新并定义刷新周期
                .setAutoRefreshCron("0 0/10 * * * ?")
                //生成session
                .getOrCreate();
    }

    /**
     * 获取字典数据
     *
     * @return 字典数据
     * @since 1.0.0
     * @author qishenghe
     * @date 1/29/22 3:19 PM
     * @change 1/29/22 3:19 PM by shenghe.qi for init
     */
    private List<DictEntity> selectDict () {
        // 查询字典表，或从其他途径获取字典源数据，将字典表数据转换成统一输入格式(DictEntity)
        // 以性别字典举例
        String sexDictCode = "sex";

        DictEntity sex1 = new DictEntity();
        sex1.setDictCode(sexDictCode);
        sex1.setCode("1");
        sex1.setMeaning("男性");

        DictEntity sex2 = new DictEntity();
        sex2.setDictCode(sexDictCode);
        sex2.setCode("2");
        sex2.setMeaning("女性");

        // return
        List<DictEntity> result = new ArrayList<>();

        result.add(sex1);
        result.add(sex2);

        return result;
    }
}
