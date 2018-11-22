package com.completeboot.course.lessons.topic4;

public class L1SpringBeansAndDI {

    /**
     * Раздел 4. Лекция 27
     * Bean Configuration
     * Есть несколько путей конфигурации бинов
     * 1. XML
     * 2. Annotations
     * 3. Java Bean Configuration
     * 4. Groovy
     *
     *
     * Bean Scope
     * 1. singleton - default
     * 2. prototype - каждый раз при запросе бина - создается новый бин
     * 3. request - web context, каждый Http request - создается новый бин
     * 4. session - каждую  Http сессию - создается новый бин
     * 5. global session -каждую  глобальную Http сессию - создается новый бин
     *
     *  Пример присвоения скоупа
     *  @Scope("session")
     *
     *  DI
     *  Обычно в контроллеры встраиваются сервисы
     *
     *  1. property based injection
     *
     *  @Autowired
     *  private NotificationService notificationService;
     *  Такая фича усложняет написание тестов
     *
     *
     *  2. Setter based injection
     *
     *  private NotificationService notificationService;
     *  @Autowired
     *  public void setNotificationService(NotificationService notificationService){
     *      this.notificationService = notificationService;
     *  }
     *
     *  3. Constructor based injection
     *  class PageController{
     *
     *      private NotificationService notificationService;
     *
     *      @Autowired
     *      public PageController(NotificationService notificationService){
     *          this.notificationService = notificationService;
     *      }
     *  }
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     * **/
}
