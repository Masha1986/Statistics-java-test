## Задача №1 - Статистика

### Легенда

Статистика - очень важный компонент любого бизнеса. У вас есть набор данных о продажах конкретного предприятия по месяцам: `[8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18]`.

Вам поручили написать небольшой сервис (программисты все заняты), который умеет рассчитывать:
1. Сумму всех продаж
2. Среднюю сумму продаж в месяц
3. Номер месяца, в котором был пик продаж (осуществлены продажи на максимальную сумму)*
4. Номер месяца, в котором был минимум продаж (осуществлены продажи на минимальную сумму)*
5. Кол-во месяцев, в которых продажи были ниже среднего (см. п.2)
6. Кол-во месяцев, в которых продажи были выше среднего (см. п.2)

Вам необходимо:
1. Создать Maven проект, в котором в package `ru.netology.stats` будет класс `StatsService` с необходимыми методами (сами придумайте им говорящие названия*)
1. Написать на каждый метод по одному автотесту, который проверяет правильность работы на тестовых данных** 
1. Убедитесь, что ваши автотесты работают и проходят (для этого пробуйте "ронять" каждый свой тест и удостоверяйтесь, что он действительно падает).

Итого: у вас должен быть репозиторий на GitHub, в котором расположен ваш Java-код и автотесты к нему.