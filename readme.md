# Итоговая контрольная работа
## Информация о проекте

Необходимо организовать систему учета для питомника в котором живут
домашние и вьючные животные.

*Как сдавать проект*
Для сдачи проекта необходимо создать отдельный общедоступный
репозиторий(Github, gitlub, или Bitbucket). Разработку вести в этом
репозитории, использовать пул реквесты на изменения. Программа должна
запускаться и работать, ошибок при выполнении программы быть не должно.
Программа, может использоваться в различных системах, поэтому необходимо
разработать класс в виде конструктора

## Задания

1. Используя команду cat в терминале операционной системы Linux, создать
два файла Домашние животные (заполнив файл собаками, кошками,
хомяками) и Вьючные животными заполнив файл Лошадьми, верблюдами и
ослы), а затем объединить их. Просмотреть содержимое созданного файла.
Переименовать файл, дав ему новое имя (Друзья человека).

История решения в этом репозитории. 

Список команд прилагаю к заданию 2
  
2. Создать директорию, переместить файл туда.

История решения в этом репозитории. 

<details><summary>Список команд прилагаю </summary>
  <image src="/images/history1.jpg" alt="История команд по заданию 1">
  <image src="/images/history2.jpg" alt="История команд по заданию 2">
</details>


3. Подключить дополнительный репозиторий MySQL. Установить любой пакет
из этого репозитория.
  
  Установлен MySQL (сервер и клиент) из официального репозитория
    
  Список команд прилагаю 
<image src="/images/history3.jpg" alt="История команд по заданию 3">
  
4. Установить и удалить deb-пакет с помощью dpkg.
  
<details><summary>Список команд прилагаю </summary>
    4.1. Скачиваем пакет
      <image src="/images/dpkg1.jpg" alt="Скачивание нужного пакета">
    4.2. Вызываем команду dpkg на установку пакета
      <image src="/images/dpkg2.jpg" alt="Вызываем команду dpkg на установку пакета">
    4.3. Устанавливаем недостающие зависимости
      <image src="/images/dpkg3.jpg" alt="Устанавливаем недостающие зависимости">
    4.4. Повторяем установку пакета
      <image src="/images/dpkg4.jpg" alt="Повторяем установку пакета">
    4.5. Запускаем установленный пакет и убеждаемся что все работает
      <image src="/images/dpkg5.jpg" alt="Запускаем установленный пакет и убеждаемся что все работает">
    4.6. Удаляем *полностью* пакет 
      <image src="/images/dpkg6.jpg" alt="Удаляем *полностью* пакет">
</details>
    
5. Выложить историю команд в терминале ubuntu

        Выкладывал в каждом задании. См. выше
        
6. Нарисовать диаграмму, в которой есть класс родительский класс, домашние
животные и вьючные животные, в составы которых в случае домашних
животных войдут классы: собаки, кошки, хомяки, а в класс вьючные животные
войдут: Лошади, верблюды и ослы).

<details><summary>UML диаграмма</summary>
  <image src="/images/UML Animals.jpg" alt="диаграмма">
</details>
        
7. В подключенном MySQL репозитории создать базу данных “Друзья
человека”
<details><summary>Создание базы</summary>
  <image src="/images/sql1.jpg" alt="Создание базы">
</details>
  
8. Создать таблицы с иерархией из диаграммы в БД
  <details><summary>Домашние животные</summary>
  <image src="/images/sql2.jpg" alt="таблица1">
</details>
    <details><summary>Вьючные животные</summary>
  <image src="/images/sql3.jpg" alt="таблица2">
</details>
9. Заполнить низкоуровневые таблицы именами(животных), командами
которые они выполняют и датами рождения
10. Удалив из таблицы верблюдов, т.к. верблюдов решили перевезти в другой
питомник на зимовку. Объединить таблицы лошади, и ослы в одну таблицу.
11.Создать новую таблицу “молодые животные” в которую попадут все
животные старше 1 года, но младше 3 лет и в отдельном столбце с точностью
до месяца подсчитать возраст животных в новой таблице
12. Объединить все таблицы в одну, при этом сохраняя поля, указывающие на
прошлую принадлежность к старым таблицам.
13.Создать класс с Инкапсуляцией методов и наследованием по диаграмме.
14. Написать программу, имитирующую работу реестра домашних животных.
В программе должен быть реализован следующий функционал:
14.1 Завести новое животное
14.2 определять животное в правильный класс
14.3 увидеть список команд, которое выполняет животное
14.4 обучить животное новым командам
14.5 Реализовать навигацию по меню
15.Создайте класс Счетчик, у которого есть метод add(), увеличивающий̆
значение внутренней̆int переменной̆на 1 при нажатие “Завести новое
животное” Сделайте так, чтобы с объектом такого типа можно было работать в
блоке try-with-resources. Нужно бросить исключение, если работа с объектом
типа счетчик была не в ресурсном try и/или ресурс остался открыт. Значение
считать в ресурсе try, если при заведения животного заполнены все поля.
