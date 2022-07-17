package lecture2;

public class mainLecture2 {
   
    //Main
    public static void main(String[] args)
    {

        
        classRoom breakRoom = new classRoom(3, "Break Room");
        classRoom computersClassRoom = new classRoom(7, "Computers Class");
        
        System.out.println("Class name: " + computersClassRoom.name);
        System.out.println("Class id: " + computersClassRoom.get_id());

        System.out.println("Class name: " + breakRoom.name);
        System.out.println("Class id: " + breakRoom.get_id());
    }

}