class Bank{
    string name;
    int age;
    string rank;
    double salary;
    float fees;

    public Sahil(string name, int age, string rank, double salary, float fees){
        this.name = name;
        this.age = age;
        this.rank = rank;
        this.salary = salary;
        this.fees = fees;
    }

    public static void main(String[] args) {
        Sahil s = new Sahil("Sahil", 18, "intermediate", 180000.00, 12345f);
        Sahil s2 = new Sahil();
    }
}