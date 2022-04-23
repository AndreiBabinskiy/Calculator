System.out.println("Калькулятор - Пример 1.3.9");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        while (!scanner.hasNextInt()){
            System.out.println("Введите число !");
            if("q".equals(scanner.next())) {
                System.out.println("\nПрограмма закончена !");
                System.exit(0);
            }
        }
        int result = scanner.nextInt();
        while (true){
            System.out.println("Введите арифмитическую операцию");
            String airthmeticOperation = scanner.next();
            if(("q".equals(airthmeticOperation))) {
                System.out.println(result);
                break;
            }
            System.out.println("Введите число");
            while (!scanner.hasNextInt()){
                System.out.println("Введите число !");
                if("q".equals(scanner.next())) {
                    System.out.println("\nПрограмма закончена !");
                    System.out.println("Окончательный результат = " + result);
                    System.exit(0);
                }
            }
            int number = scanner.nextInt();
            switch (airthmeticOperation) {
                case "+": {
                    result += number;
                    break;
                }
                case "-": {
                    result -= number;
                    break;
                }
                case  "*": {
                    result *= number;
                    break;
                }
                case "/": {
                    if(number == 0) {
                        System.out.println("На ноль делить нельзя");
                        continue;
                    }
                    else {
                        result /= number;
                        break;
                    }
                }
                default:
                    System.out.println("Неизвестная операция " + airthmeticOperation);
            }
            System.out.println("Текущий результат = " + result);
        }