public enum Vehicles {
    FORD(5000) {
        public String getColor() {
            return "White";
        }
    },
    BMW(20000) {
        public String getColor() {
            return "Black";
        }
    };
    int price;

    Vehicles(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Model = " + super.toString() + ", color = " + getColor() + ", price = " + price;
    }
    abstract String getColor();
}
