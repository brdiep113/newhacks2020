import java.io.Serializable;

@SuppressWarnings("serial") //With this annotation we are going to hide compiler warnings
public class InformationMule implements Serializable {
    String prompt;
    String[] answers;
    boolean hasNext;

    public InformationMule(String prompt, String[] answers, boolean hasNext) {
        this.prompt = prompt;
        this.answers = answers;
        this.hasNext = hasNext;
    }

    public double getId() {
        return id;
    }

    public void setId(double id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private double id;
    private String name;
}
