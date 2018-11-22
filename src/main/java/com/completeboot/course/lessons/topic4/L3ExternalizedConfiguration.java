package com.completeboot.course.lessons.topic4;

public class L3ExternalizedConfiguration {

    /**
     * Раздел 4, лекция 29, 30
     *
     * В пропортях
     * helloController.msg = halo fom props
     *
     *
     * В контроллере
     *  @Value("${helloController.msg}")
        private String helloControllerMsg;

        Если в приложении, есть оба файлаЮ и properties и yaml
        То по приоритету выигрывает файл .properties

        Mapping Properties to POJOs

    @EnableConfigurationProperties
    @ConfigurationProperties

    Можно внедрить property напрямую в Pojo
    MyAppConfig


     *
     * **/
}
