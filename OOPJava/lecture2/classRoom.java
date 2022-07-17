package lecture2;

public class classRoom {
    //Atributes
    private int id;
    private float size;
    private boolean ac;
    public String name;
    
    // Constructor
    public classRoom(int classId, String className) {
        this.id = classId;
        this.name = className;

        this.lights_switch(false);
    }

    // Getters
    public int get_id () {
        return this.id;
    }

    //Methods
    void is_occupied(boolean on) {

    }

    public void lights_switch (boolean on) {
        if (on == true) {
            System.out.println("The light are on in " + this.name);
            }else {
            System.out.println("The light are off in " + this.name);
            }
    }



}