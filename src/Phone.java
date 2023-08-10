public class Phone {
     String brand;
     String version;
     double screen; // Исправлено на double
     int memory;
     double price;

    public Phone(String brand, String version, double screen) { // Исправлено тип данных screen
        this.brand = brand;
        this.version = version;
        this.screen = screen;
    }

    // Геттеры и сеттеры для memory и price (необязательно для объяснения)

    public double getScreen() { // Добавлен геттер для screen
        return screen;
    }

    public void setMemory(int i) {
    }

    public void setPrice(double v) {
    }




    // Геттеры и сеттеры для brand и version (необязательно для объяснения)
}
