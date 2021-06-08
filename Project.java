public class Project {

    private String name;
    private String description;

    public Project() {
    }

    public Project(String name) {
        this.name = name;
    }

    public Project(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public void setProjectName(String name) {
        this.name = name;
    }

    public String getProjectName() {
        return name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void elevatorPitch() {
        System.out.println(this.name + " : " + this.description);
    }
}