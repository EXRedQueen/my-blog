package com.vacant.myblog.generator;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;
import org.springframework.util.ResourceUtils;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * @description: Mybatis逆向工程执行类
 * @author: link(dingshengxiao)
 * @date: 2019/5/5 19:22
 */
public class MybatisGeneratorRun {

    public static void main(String[] args) throws Exception{
        List<String> warnings = new ArrayList<>();
        File configFile =  ResourceUtils.getFile("classpath:generatorConfig.xml");
        ConfigurationParser cp = new ConfigurationParser(warnings);
        Configuration config = cp.parseConfiguration(configFile);
        DefaultShellCallback callback = new DefaultShellCallback(true);
        MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
        myBatisGenerator.generate(null);
    }
}
