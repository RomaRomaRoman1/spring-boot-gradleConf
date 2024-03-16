import model.FirstBean
import model.SecondBean

beans {
    // Создание бина с именем "firstBean" и типом FirstBean
    // Создание бина с именем "firstBean" и типом FirstBean
    firstBean(FirstBean, ref('prototype'), ref('singleton'))

    // Создание бина с именем "secondBean" и типом SecondBean
    secondBean(SecondBean, ref('prototype'), ref('singleton'))

    // Создание бина с именем "prototype" и типом Prototype
    prototype(model.Prototype) {
        // Установка области видимости бина на "prototype"
        bean -> bean.scope = 'prototype'
    }

    // Создание бина с именем "singleton" и типом Singleton
    singleton(model.Singleton)
}