public class ProjectTest {
    public static void main(String[] args) {
        Project noName = new Project();
        noName.setProjectName("Cloverfield");
        noName.setDescription("A film where 5 residents flee from a massive monster");
        noName.elevatorPitch();

        Project wagTheDog = new Project("Wag the Dog");
        wagTheDog.setDescription("A political satire film where a Hollywood producer fabraictes a war to distract the public from a presidential sex scandal");
        wagTheDog.elevatorPitch();

        Project mha = new Project("My Hero Academia", "A japanese manga series that follows Izuke Midoriya, a boy born with superpowers (aka quirks) in a world where they have become commonplace");
        mha.elevatorPitch();
    }
}
