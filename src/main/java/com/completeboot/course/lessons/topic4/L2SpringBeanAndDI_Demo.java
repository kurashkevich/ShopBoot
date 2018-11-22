package com.completeboot.course.lessons.topic4;

public class L2SpringBeanAndDI_Demo {

    /**
     * Раздел 4 лекция 28
     *  ApplicationContext applicationContext = SpringApplication.run(ShopBootApplication.class, args);
     *  SpringApplication.run - это и есть App context
     *
     * аннотация @SpringBootApp включает в себя
     * @Configuration - Этот класс является сурсом для аппликейшн контекста
     * @EnableAutoConfiguration
     * @ComponentScan - Сканирует компоненты, сервисы, конфигурацию внутри этого ПАКЕТА
     *
     * Чтобы переопределить компонент скан
     * @ComponentScan({"com.completeboot.course.service", "com.completeboot.course.domain", "com.completeboot.course.controller"})
     *
     * Для того что бы спринг распознавал свои бины, необходимо их аннотировать
     * @Controller
     * @Service
     * @Repository
     *
     * и тд
     *
     * **/
}
