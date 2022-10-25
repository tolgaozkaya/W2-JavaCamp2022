package entities.concretes;

public class Course {

    private int id;
    private String name;
    private double price;
    private String instructor;
    private String category;

    public Course() {
    }

    public Course(int id, String name, double price, String instructor, String category) {
        this.setId(id);
        this.setName(name);
        this.setPrice(price);
        this.setInstructor(instructor);
        this.setCategory(category);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getInstructor() {
        return instructor;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
