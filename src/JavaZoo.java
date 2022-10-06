import java.util.*;

public class JavaZoo {

    static JavaZoo javaZoo = new JavaZoo();


    Animals leoOne = new AnimalLeo("Индия", "Хищник", 30, "мясо", "Индийский лев");
    Animals leoTwo = new AnimalLeo("Африка", "Хищник", 30, "мясо", "Африканский лев");
    Animals horseOne = new AnimalHorse("ОАЭ", "Травоядное", 20, "овёс", "Арабская лошадь");
    Animals horseTwo = new AnimalHorse("Америка", "Травоядное", 15, "пшено", "Лошадь мустанг");
    Animals horseThree = new AnimalHorse("Европа", "Травоядное", 10, "морковь", "Пони");
    Animals lynx = new AnimalLynx("Европа", "Хищник", 10, "мясо", "Рысь");
    Animals monkeys = new AnimalMonkeys("Азия", "Всеядное", 10, "бананы", "Обезьяна");
    Animals dolphins = new AnimalDolphins("Океан", "Хищник", 10, "рыба", "Дельфин");

    private List<Animals> animals = new ArrayList<>(Arrays.asList(leoOne, leoTwo, horseOne, horseTwo, horseThree, lynx, monkeys, dolphins));

    public void run() {
        javaZooMenu();
    }

    private void javaZooMenu() {
        Scanner in = new Scanner(System.in);

        MAIN_LOOP:
        while (true) {
            System.out.println("Мы рады приветствовать вас в JavaZoo, produced by seniors Pablo and Alejandro.\n" +
                    "\t1. Покупка билета (прогулка по территории JavaZoo).\n" +
                    "\t2. Список животных, которых вы увидите при посещении JavaZoo.\n" +
                    "\t3. Дополнительные развлечения в JavaZoo.\n" +
                    "\t4. Правила поведения с животными в JavaZoo.\n" +
                    "\t5. Покинуть JavaZoo.\n" +
                    "Для выбора нужного пункта введите число: ");

            try {
                final int i = in.nextInt();
                switch (i) {
                    case 1:
                        buyTicket(in);
                        break;
                    case 2:
                        listAnimals();
                        break;
                    case 3:
                        System.out.println("Дополнительные развлечения в JavaZoo:\n" +
                                "\t1. Экскурсия по JavaZoo с гидом.\n" +
                                "\t2. Шоу дельфинов (Мартин, Льюис, Ричард, Глория, Фиалка, Амаретто).\n" +
                                "\t3. 30-ти минутная поездка на пони по территории JavaZoo.\n" +
                                "\t4. 5 минут в клетке со львом.\n" +
                                "\t5. Фотография с обезьянкой.\n" +
                                "\t6. Вернуться в главное меню.\n" +
                                "Для выбора нужного пункта введите число: ");
                        final int j = in.nextInt();
                        switch (j) {
                            case 1:
                                guidedTour(in);
                                break;
                            case 2:
                                dolphinShow();
                                break;
                            case 3:
                                ponyRide(in);
                                break;
                            case 4:
                                visitingLionCage(in);
                                break;
                            case 5:
                                photoWithMonkey();
                                break;
                            case 6:
                                break;
                            default:
                                System.out.println("Такой пункт в меню отсутствует. Пожалуйста вводите корректные данные.\nВыход в главное меню.\n");
                        }
                        break;
                    case 4:
                        rulesBehaviorAnimals(in);
                        break;
                    case 5:
                        System.out.println("Приходите ещё, мы всегда рады посетителям. Хорошего дня!");
                        break MAIN_LOOP;
                    default:
                        System.out.println("Такой пункт в меню отсутствует. Пожалуйста вводите корректные данные.\nВыход в главное меню.\n");
                }
            } catch (InputMismatchException inputMismatchException) {
                System.out.println("Ошибка ввода. Пожалуйста используйте корректные вводные данные.\n");
                javaZooMenu();
            }
        }
    }

    private void buyTicket(Scanner in) {
        System.out.println("Относитесь ли вы к следующим категориям: инвалид/пенсионер?\n" +
                "1. Да\n2. Нет\n3. Вернуться в главное меню.\n" + "Для выбора нужного пункта введите число:");

        final int i = in.nextInt();
        switch (i) {
            case 1:
                System.out.println("Для вас вход бесплатный. Хорошей прогулки!\n");
                break;
            case 2:
                System.out.println("Вам исполнилось 16 лет?\n" +
                        "1. Да\n2. Нет\n" + "Для выбора нужного пункта введите число:");
                final int j = in.nextInt();
                switch (j) {
                    case 1:
                        System.out.println("Билет успешно куплен за 15р.\nВыход в главное меню.\n");
                        break;
                    case 2:
                        System.out.println("Билет успешно куплен за 10р.\nВыход в главное меню.\n");
                        break;
                    default:
                        System.out.println("Такой пункт в меню отсутствует. Пожалуйста вводите корректные данные.\nВыход в главное меню.\n");
                        break;
                }
            case 3:
                break;
            default:
                System.out.println("Такой пункт в меню отсутствует. Пожалуйста вводите корректные данные.\nВыход в главное меню.\n");
                break;
        }
    }

    public static void listAnimals() {
        int i = 0;
        for (Animals a : javaZoo.getAnimals()) {
            if (a instanceof AnimalLeo) {
                System.out.println("\t" + i++ + ". " + ((AnimalLeo) a).getTypeLion());
            } else if (a instanceof AnimalHorse) {
                System.out.println("\t" + i++ + ". " + ((AnimalHorse) a).getTypeHorse());
            } else {
                System.out.println("\t" + i++ + ". " + a.getNameAnimal());
            }
        }
        System.out.println();
    }

    private void guidedTour(Scanner in) {
        while (true) {
            System.out.println("Экскурсия с гидом. Кого желаете посетить?");
            listAnimals();
            final int k = in.nextInt();
            if (k < 0 | k >= animals.size()) {
                System.out.println("Такой пункт в меню отсутствует. Пожалуйста вводите корректные данные.\nВыход в главное меню.\n");
                break;
            } else if (animals.get(k) instanceof AnimalLeo) {
                System.out.println("Вы посетили: " + ((AnimalLeo) animals.get(k)).getTypeLion() + ".\n" +
                        "Основное место обитания: " + animals.get(k).getLiveCountry() + ".\n" +
                        "Относится это животное к типу: " + animals.get(k).getTypeEat() + ".\n" +
                        "Основной рацион питания: " + animals.get(k).getFoodRation() + ".\n" +
                        "В среднем представители данного вида живут: " + animals.get(k).getAverageLifeExpectancy() + " лет.\n");
            } else if (animals.get(k) instanceof AnimalHorse) {
                System.out.println("Вы посетили: " + ((AnimalHorse) animals.get(k)).getTypeHorse() + ".\n" +
                        "Основное место обитания: " + animals.get(k).getLiveCountry() + ".\n" +
                        "Относится это животное к типу: " + animals.get(k).getTypeEat() + ".\n" +
                        "Основной рацион питания: " + animals.get(k).getFoodRation() + ".\n" +
                        "В среднем представители данного вида живут: " + animals.get(k).getAverageLifeExpectancy() + " лет.\n");
            } else {
                System.out.println("Вы посетили: " + animals.get(k).getNameAnimal() + ".\n" +
                        "Основное место обитания: " + animals.get(k).getLiveCountry() + ".\n" +
                        "Относится это животное к типу: " + animals.get(k).getTypeEat() + ".\n" +
                        "Основной рацион питания: " + animals.get(k).getFoodRation() + ".\n" +
                        "В среднем представители данного вида живут: " + animals.get(k).getAverageLifeExpectancy() + " лет.\n");
            }
            System.out.println("Продолжаем экскурсию?\n1. Конечно.\n2. Было весьма познавательно. На этом экскурсию можно закончить.");
            final int l = in.nextInt();
            if (l < 0 | l > 2) {
                System.out.println("Такой пункт в меню отсутствует. Пожалуйста вводите корректные данные.\nВыход в главное меню.\n");
                break;
            } else if (l == 1) {
                continue;
            } else if (l == 2) {
                break;
            }
        }
    }

    private void dolphinShow() {
        Random random = new Random();
        System.out.println("Приветствуем на увлекательном шоу дельфмнов!\n");

        AnimalDolphins martin = new DolphinsBoys("Мартин");
        AnimalDolphins luis = new DolphinsBoys("Льюис");
        AnimalDolphins richard = new DolphinsBoys("Ричард");
        AnimalDolphins gloriya = new DolphinsGirls("Глория");
        AnimalDolphins fialka = new DolphinsGirls("Фиалка");
        AnimalDolphins amaretto = new DolphinsGirls("Амаретто");

        ArrayList<AnimalDolphins> animalDolphins = new ArrayList<>(Arrays.asList(martin, luis, richard, gloriya, fialka, amaretto));

        System.out.print("Для вас будут выступать: ");
        for (AnimalDolphins ad : animalDolphins) {
            System.out.print(ad.getNameAnimal() + ", ");
        }

        System.out.println();
        System.out.println();
        System.out.println("А перед началом дельфинам следует подкрепиться:");
        for (AnimalDolphins ad : animalDolphins) {
            if (ad instanceof DolphinsBoys) {
                int fishRandom = random.nextInt(9) + 1;
                System.out.println(ad.getNameAnimal() + " скушал " + fishRandom + " рыбок.");
            } else if (ad instanceof DolphinsGirls) {
                int fishRandom = random.nextInt(10) + 2;
                System.out.println(ad.getNameAnimal() + " скушала " + fishRandom + " рыбок.");
            }
        }

        System.out.println();
        System.out.println("И так, выступление начинается!\n");
        for (AnimalDolphins ad : animalDolphins) {
            if (ad instanceof DolphinsBoys) {
                int i = random.nextInt(3) + 2;
                System.out.println(ad.getNameAnimal() + ":");
                if (i == 2) {
                    ad.jumpOutWater();
                } else if (i == 3) {
                    ad.finStrike();
                } else if (i == 4) {
                    ad.rideVisitor();
                }
                ad.uniqueSkill();
                System.out.println("Скушал " + i + " рыбки.");
                System.out.println();
            } else if (ad instanceof DolphinsGirls) {
                int i = random.nextInt(3) + 2;
                System.out.println(ad.getNameAnimal() + ":");
                if (i == 2) {
                    ad.jumpOutWater();
                } else if (i == 3) {
                    ad.finStrike();
                } else if (i == 4) {
                    ad.rideVisitor();
                }
                ad.uniqueSkill();
                System.out.println("Скушала " + i + " рыбки.");
                System.out.println();
            }
        }
        System.out.println("Представление окончено. Спасибо за внимание!");
        System.out.println();
    }

    private void ponyRide(Scanner in) {
        WorkingHorse pony = new WorkingHorse("Розочка");
        System.out.println("Вас будет катать пони по имени: " + pony.getNameAnimal() + "\n" +
                "Вы усаживаетесь на пони и поездка начинается.\n");
        int choice = 1;
        LOOP:
        for (int i = 25; i <= 200; i += 25) {

            if (i >= 200) {
                System.out.println("Поездка подошла к концу. Приятного пребывания в JavaZoo!\n");
                break LOOP;
            }

            System.out.println("Лошадка прошла уже " + i + " м. Ей нужно выпить воды и скушать сахар.\n" +
                    "\t1. Напоить/покормить.\n" + "\t2. Продолжить путь.");
            final int j = in.nextInt();
            if (j == 2) {
                switch (choice) {
                    case 1:
                        System.out.println("Это ваш " + choice + "-ый раз, когда вы отказываете Розочке в её потребностях.\n" + pony.getNameAnimal() + ":");
                        pony.horseTired();
                        System.out.println();
                        choice++;
                        break;
                    case 2:
                        System.out.println("Это ваш " + choice + "-ой раз, когда вы отказываете Розочке в её потребностях.\n" +
                                "Следующего раза может не быть.\n" + pony.getNameAnimal() + ":");
                        pony.horseTired();
                        System.out.println();
                        choice++;
                        break;
                    case 3:
                        System.out.println("Вы настоящий тиран! Пони падает без сил. Поездка окончена.\n");
                        break LOOP;
                }
            } else if (j == 1) {
                System.out.println(pony.getNameAnimal() + ":");
                pony.drinkWater();
                pony.eatSugar();
                System.out.println("Поездка продолжается.\n");
            } else if (j < 1 | j > 2) {
                System.out.println("Такой пункт в меню отсутствует. Пожалуйста вводите корректные данные.\nВыход в главное меню.\n");
                break;
            }
        }
    }

    private void visitingLionCage(Scanner in) {
        AnimalLeo leoOne = new AnimalLeo("лев", "Африканский", false);
        AnimalLeo leoTwo = new AnimalLeo("лев", "Индийский", true);

        System.out.print("Для посещения доступны следующие виды львов:\n" +
                "1. " + leoOne.getTypeLion() + " " + leoOne.getNameAnimal() + ", ");
        leoOne.characterDescription(leoOne.isCharacterLion());
        System.out.print("2. " + leoTwo.getTypeLion() + " " + leoTwo.getNameAnimal() + ", ");
        leoTwo.characterDescription(leoTwo.isCharacterLion());
        System.out.println();

        int choice = 2;

        System.out.println("Кого желаете посетить?");
        System.out.println("1. Хочется адреналина. Обострить чувство самосохранения. " +
                "(" + leoOne.getTypeLion() + " " + leoOne.getNameAnimal() + ")\n" +
                "2. Хочется почувствовать себя ближе к природе. " +
                "(" + leoTwo.getTypeLion() + " " + leoTwo.getNameAnimal() + ")\n" +
                "3. Вы передумали. Вернуться в главное меню.\n" +
                "Ваш выбор: ");
        final int i = in.nextInt();
        switch (i) {
            case 1:
                leoOne.characterAction(leoOne.isCharacterLion());
                System.out.println();
                break;
            case 2:
                leoTwo.characterAction(leoTwo.isCharacterLion());
                System.out.println();
                break;
            case 3:
                break;
            default:
                System.out.println("Такой пункт в меню отсутствует. Пожалуйста вводите корректные данные.\nВыход в главное меню.\n");
                return;
        }

        LOOP:
        for (; ; choice++) {
            System.out.println("Желаете посетить льва ещё раз?\n" +
                    "1. Да\n" + "2. Возвращение в главное меню.");
            final int j = in.nextInt();
            switch (j) {
                case 1:
                    if (choice % 2 == 0) {
                        leoOne.setCharacterLion(true);
                        System.out.println("Африканский лев потерял интерес и стал спокойным.");
                        leoTwo.setCharacterLion(false);
                        System.out.println("Индийский лев стал раздражительным и агрессивным.\n");
                        System.out.println("Кого желаете посетить?");
                        System.out.println("1. Хочется адреналина. Обострить чувство самосохранения. " +
                                "(" + leoTwo.getTypeLion() + " " + leoTwo.getNameAnimal() + ")\n" +
                                "2. Хочется почувствовать себя ближе к природе. " +
                                "(" + leoOne.getTypeLion() + " " + leoOne.getNameAnimal() + ")\n" +
                                "Ваш выбор: ");
                        final int ij = in.nextInt();
                        switch (ij) {
                            case 1:
                                leoTwo.characterAction(leoTwo.isCharacterLion());
                                System.out.println();
                                break;
                            case 2:
                                leoOne.characterAction(leoOne.isCharacterLion());
                                System.out.println();
                                break;
                            default:
                                System.out.println("Такой пункт в меню отсутствует. Пожалуйста вводите корректные данные.\nВыход в главное меню.\n");
                                break LOOP;
                        }
                    } else {
                        leoTwo.setCharacterLion(true);
                        System.out.println("Индийский лев потерял интерес и стал спокойным.");
                        leoOne.setCharacterLion(false);
                        System.out.println("Африканский лев стал раздражительным и агрессивным.\n");
                        System.out.println("Кого желаете посетить?");
                        System.out.println("1. Хочется адреналина. Обострить чувство самосохранения. " +
                                "(" + leoOne.getTypeLion() + " " + leoOne.getNameAnimal() + ")\n" +
                                "2. Хочется почувствовать себя ближе к природе. " +
                                "(" + leoTwo.getTypeLion() + " " + leoTwo.getNameAnimal() + ")\n" +
                                "Ваш выбор: ");
                        final int ij = in.nextInt();
                        switch (ij) {
                            case 1:
                                leoOne.characterAction(leoOne.isCharacterLion());
                                System.out.println();
                                break;
                            case 2:
                                leoTwo.characterAction(leoTwo.isCharacterLion());
                                System.out.println();
                                break;
                            default:
                                System.out.println("Такой пункт в меню отсутствует. Пожалуйста вводите корректные данные.\nВыход в главное меню.\n");
                                break LOOP;
                        }
                    }
                    break;
                case 2:
                    break LOOP;
                default:
                    System.out.println("Такой пункт в меню отсутствует. Пожалуйста вводите корректные данные.\nВыход в главное меню.\n");
                    break LOOP;
            }
        }
    }

    private void photoWithMonkey() {
        MonkeyZoi zoi = new MonkeyZoi("Zoi");
        System.out.println("К вам навстречу бежит обезьянка " + zoi.getNameAnimal() + ".\n" +
                "У неё есть личные любимые вещи:");
        for (Object arrayList : zoi.getStolenItems()) {
            System.out.println(arrayList);
        }

        System.out.println();
        while (true) {
            String one = zoi.randomItem(zoi.getStolenItems());
            String two = zoi.randomItem(zoi.getStolenItems());
            if (one.equals(two)) {
                continue;
            } else {
                System.out.println("Для фото с вами она выбирает:\n" + "1. " + one +
                        "\n2. " + two);
            }
            System.out.println();
            System.out.println("Вам она протягивает " + one + ", в своих лапках оставляет " + two +
                    ". На память вы получаете фото и с хорошим настроением покидаете вольер с обезьянкой.");
            System.out.println();
            break;
        }
    }

    private void rulesBehaviorAnimals(Scanner in) {
        System.out.println("1. Правила кормления животных.\n2. Правила касаний животных.\n3. Выход в главное меню.");
        final int i = in.nextInt();
        switch (i) {
            case 1:
                for (int j = 0; j < animals.size(); j++) {
                    System.out.print(j + ". ");
                    if (javaZoo.getAnimals().get(j) instanceof AnimalLeo) {
                        System.out.println(((AnimalLeo) javaZoo.getAnimals().get(j)).getTypeLion() + " является хищником. Кормление запрещено!");
                    } else if (javaZoo.getAnimals().get(j) instanceof AnimalHorse) {
                        System.out.print(((AnimalHorse) javaZoo.getAnimals().get(j)).getTypeHorse() + " является травоядным. Кормление разрешено! ");
                        System.out.println("При себе лучше иметь " + (javaZoo.getAnimals().get(j)).getFoodRation() + ".");
                    } else if (javaZoo.getAnimals().get(j) instanceof AnimalLynx) {
                        System.out.println(javaZoo.getAnimals().get(j).getNameAnimal() + " является хищником. Кормление запрещено!");
                    } else if (javaZoo.getAnimals().get(j) instanceof AnimalMonkeys) {
                        System.out.print(javaZoo.getAnimals().get(j).getNameAnimal() + " является всеядным. Кормление разрешено! ");
                        System.out.println("При себе лучше иметь " + (javaZoo.getAnimals().get(j)).getFoodRation() + ".");
                    } else {
                        System.out.println("Кормление дельфинов запрещено!");
                    }
                }
                System.out.println();
                System.out.println("1. Предыдущее меню.\n2. В главное меню.");
                final int o = in.nextInt();
                switch (o) {
                    case 1:
                        rulesBehaviorAnimals(in);
                    case 2:
                        break;
                    default:
                    System.out.println("Такой пункт в меню отсутствует. Пожалуйста вводите корректные данные.\nВыход в главное меню.\n");
                }
                break;
            case 2:
                for (int j = 0; j < animals.size(); j++) {
                    System.out.print(j + ". ");
                    if (javaZoo.getAnimals().get(j) instanceof AnimalLeo) {
                        System.out.println(((AnimalLeo) javaZoo.getAnimals().get(j)).getTypeLion() + " является хищником. Трогать строго запрещено!");
                    } else if (javaZoo.getAnimals().get(j) instanceof AnimalHorse) {
                        System.out.println(((AnimalHorse) javaZoo.getAnimals().get(j)).getTypeHorse() + " трогать разрешено! ");
                    } else if (javaZoo.getAnimals().get(j) instanceof AnimalLynx) {
                        System.out.println(javaZoo.getAnimals().get(j).getNameAnimal() + " является хищником. Трогать строго запрещено!");
                    } else if (javaZoo.getAnimals().get(j) instanceof AnimalMonkeys) {
                        System.out.println(javaZoo.getAnimals().get(j).getNameAnimal() + " трогать разрешено! Зоопарк не несёт ответственности за ваши вещи!");

                    } else {
                        System.out.println("Дельфинов можно потрогать в рамках выступления.");
                    }
                }
                System.out.println();
                System.out.println("1. Предыдущее меню.\n2. В главное меню.");
                final int t = in.nextInt();
                switch (t) {
                    case 1:
                        rulesBehaviorAnimals(in);
                    case 2:
                        break;
                    default:
                        System.out.println("Такой пункт в меню отсутствует. Пожалуйста вводите корректные данные.\nВыход в главное меню.\n");
                }
                break;
            case 3:
                break;
            default:
                System.out.println("Такой пункт в меню отсутствует. Пожалуйста вводите корректные данные.\nВыход в главное меню.\n");
        }
    }

    public List<Animals> getAnimals() {
        return animals;
    }


    public static void main(String[] args) {
        new JavaZoo().run();
    }
}
