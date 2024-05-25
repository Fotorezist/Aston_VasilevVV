public class Park {
    private String city;
    private String name;
    private int area;

    public Park (String city, String name, int area){
        this.city = city;
        this.name = name;
        this.area = area;
    }
//    Вывод данных о парке
    public void parkInfo() {
        System.out.println("Информация о парке: \n" + " Город: " + city + " Название: " + name + " Площадь: " + area);
    }

    public class Entertainment {
        private int startWork;
        private int stopWork;
        private int price;
        public Entertainment (int startWork, int stopWork, int price){
            this.startWork = startWork;
            this.stopWork = stopWork;
            this.price = price;
        }
//        Вывод данных об атракционах
        public void entertaimentInfo() {
            System.out.println("Атракционы: \n" + " Время открытия: " + startWork + "\n Время закрытия: " + stopWork + "\n Стоимость: " + price);
        }
    }

}

