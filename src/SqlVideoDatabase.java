public class SqlVideoDatabase implements VideoDatabase {
    @Override
    public void store(Video video){
        System.out.println("storing video metadata");
        System.out.println("Title:" +video.getTitle() );
        System.out.println("File Name:"+ video.getFileName());
        System.out.println("Done!\n");
    }
}
