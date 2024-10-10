public class Park {
    private Attraction[] attractions;

    public Park(int count) {
        this.attractions = new Attraction[count];
    }

    public void addAttraction(int index, String name, String startTime, String endTime, double cost) {
        if (index >= 0 && index < attractions.length) {
            attractions[index] = new Attraction(name, startTime, endTime, cost);
        }
    }

    public void printAttractions() {
        for (Attraction attraction : attractions) {
            if (attraction != null) {
                attraction.printInfo();
                System.out.println(); // пустая строка для разделения
            }
        }
    }

    private class Attraction {
        private String name;
        private String startTime;
        private String endTime;
        private double cost;

        public Attraction(String name, String startTime, String endTime, double cost) {
            this.name = name;
            this.startTime = startTime;
            this.endTime = endTime;
            this.cost = cost;
        }

        public void printInfo() {
            System.out.println("Название аттракциона: " + name);
            System.out.println("Время работы: с " + startTime + " до " + endTime);
            System.out.println("Стоимость: " + cost + " рублей");
        }
    }
}
